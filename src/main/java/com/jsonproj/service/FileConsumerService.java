package com.jsonproj.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.print.attribute.standard.DateTimeAtCompleted;

import org.apache.commons.io.IOUtils;
import org.apache.coyote.http11.filters.BufferedInputFilter;
import org.codehaus.plexus.util.IOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsonproj.model.ProductData;
import com.jsonproj.repo.inputrepo;
import com.jsonproj.repo.outputrepo;
import com.jsonproj.util.JsonComparisionProperties;
import com.jsonproj.util.jsonResourceUtility;
import com.jsonproj.vo.OutProductVO;
import com.jsonproj.vo.ProductVo;
import com.jsonproj.vo.TransprodVO;
import com.jsonproj.vo.jsoncompareVO;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@Service
public class FileConsumerService {
	@Autowired
	JsonComparisionProperties jsonCompareProperty;
	@Autowired
	jsonComparisionService jsoncomparisionService;
	@Autowired
	inputrepo IPRepo;
	@Autowired
	outputrepo OPRepo;
	
	ExtentReports extent;
	
	public ExtentTest extentlogger;
	
	
	HashMap<String, ProductData> IPObjects=new HashMap<>();
	HashMap<String, ProductData> OPObjects=new HashMap<>();

	public void processInboundFiles() throws Exception {
		
		String IPJsonPath=jsonCompareProperty.getInputjsonPath();
		String OPJsonPath=jsonCompareProperty.getOutputjsonPath();
		String FilePrefix=jsonCompareProperty.getFullFilePrefix();
		String ReportFolder=jsonCompareProperty.getExtentreportPath();
		String runFromLocal=jsonCompareProperty.getRunFromLocal();
		String runFromSQLtoOracleOrDifferentEnvi=jsonCompareProperty.getRunFromSQLtoOracleOrDifferentEnvi();
		String runFromOracletoOracleOrSameEnvi=jsonCompareProperty.getRunFromOracletoOracleOrSameEnvi();
		
		extent=new ExtentReports(createFolderwithCurrentDate(ReportFolder)+"//"+"JsonCompare_"+getTimeStamp()+".html", false);
		
		if(runFromLocal.equalsIgnoreCase("No")) {
			if(runFromSQLtoOracleOrDifferentEnvi.equalsIgnoreCase("Yes")) {
				List<TransprodVO> inputlist=null;
				List<OutProductVO> outputlist=null;
				int count=0;
				while(OPRepo.getjsoncount()>0 &&count==0) {
					inputlist=IPRepo.getinputdatafromsamedb();
					outputlist=OPRepo.getInputproductdatafromAppl1();
					List<jsoncompareVO> jsoncomparevo=mapDataDiffEnvi(inputlist,outputlist);
					for(jsoncompareVO eachcompare:jsoncomparevo) {
						ProductData inputproduct=jsonResourceUtility.getProductData(eachcompare.getOPproductjson());
						ProductData outputproduct=jsonResourceUtility.getProductData(eachcompare.getIPproductjson());
						extentlogger=extent.startTest("IP_Json"+eachcompare.getProductid()+"is Getting compared");
						jsoncomparisionService.setExtentlogger(extentlogger);
						jsoncomparisionService.compareJson(inputproduct, outputproduct);
						
						
					}
					count=1;
				}
				
			}else if(runFromOracletoOracleOrSameEnvi.equalsIgnoreCase("Yes")) {
				List<OutProductVO> inputlist=null;
				List<OutProductVO> outputlist=null;
				int count=0;
				while(OPRepo.getjsoncount()>0 &&count==0) {
					inputlist=OPRepo.getInputproductdatafromAppl1();
					outputlist=OPRepo.getOutputproductdatafromAppl1();
					List<jsoncompareVO> jsoncomparevo=mapDataSameEnvi(inputlist,outputlist);
					for(jsoncompareVO eachcompare:jsoncomparevo) {
						ProductData inputproduct=jsonResourceUtility.getProductData(eachcompare.getOPproductjson());
						ProductData outputproduct=jsonResourceUtility.getProductData(eachcompare.getIPproductjson());
						extentlogger=extent.startTest("IP_Json"+eachcompare.getProductid()+"is Getting compared");
						jsoncomparisionService.setExtentlogger(extentlogger);
						jsoncomparisionService.compareJson(inputproduct, outputproduct);
						
					}
					count=1;
				}
				
			}
			
		}else if(runFromLocal.equalsIgnoreCase("Yes")){
			
			String[] paths=null;
			List<String> filename=new ArrayList<>();
			String fileTypes=jsonCompareProperty.getInboundFileTypes();
			List<String> inboundfilytypes=Stream.of(fileTypes.split(",")).collect(Collectors.toList());
			File inputfile= new File(IPJsonPath);
			File outputfile=new File(OPJsonPath);
			
			IPObjects=readjson(inputfile,inboundfilytypes,FilePrefix,filename,paths,IPJsonPath);
			OPObjects=readjson(outputfile,inboundfilytypes,FilePrefix,filename,paths,OPJsonPath);
			
			Set<String> IPKeyset=IPObjects.keySet();
			ArrayList<String> IpKeys=new ArrayList<>(IPKeyset);
			
			Set<String> OPKeyset=OPObjects.keySet();
			ArrayList<String> OpKeys=new ArrayList<>(OPKeyset);
			for(String IPeach:IpKeys) {
				for(String OPeach:OpKeys) {
					if(IPeach.equals(OPeach)) {
						extentlogger=extent.startTest(IPeach+"--Compare Report");
						jsoncomparisionService.setExtentlogger(extentlogger);
						jsoncomparisionService.compareJson(IPObjects.get(IPeach),OPObjects.get(OPeach));
					}
				}
			}
				
			
			
			
			
		}
	
		extent.endTest(extentlogger);
		extent.flush();
		
		
	}
	

public static HashMap<String, ProductData> readjson(File inputfile, List<String> inboundfilytypes, String filePrefix,
			List<String> filename, String[] paths, String iPJsonPath) {
		// TODO Auto-generated method stub
	HashMap<String, ProductData> InputObj=new HashMap<>();
	try {
		inputfile= new File(iPJsonPath);
		while(inputfile.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				if(name.contains(".")) {
					return inboundfilytypes.contains("json");
				}
				// TODO Auto-generated method stub
				return false;
			}
		}).length>0) {
			filename.clear();
			int fileprocesed=0;
			if(checkforjsonFile(inputfile,filePrefix)) {
				paths=inputfile.list(new FilenameFilter() {
					
					@Override
					public boolean accept(File dir, String name) {
						// TODO Auto-generated method stub
						return name.startsWith(filePrefix);
					}
				});
			}else {
				paths=inputfile.list();
			}
			for(String path:paths) {
				if(inboundfilytypes.contains(path.substring(path.indexOf(".")+1))) {
					filename.add(path);
					fileprocesed++;
				}
			}
			if(null!=filename && !filename.isEmpty())	{
				for(String fileName1:filename) {
					if(fileName1.endsWith(".json")) {
						try(InputStream inputStream= new FileInputStream(iPJsonPath+fileName1)){
							final File file=new File(iPJsonPath+fileName1);
							byte[] bytes=IOUtils.toByteArray(inputStream);
							String hrDfPayLoad=new String(bytes,"UTF-8");
							InputObj.put(fileName1, jsonResourceUtility.getProductData(hrDfPayLoad));
							FileOutputStream toclosedes=new FileOutputStream(fileName1.toString());
							toclosedes.close();
						}
					}
				}
			}
			break;
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		return InputObj;
	}


private static boolean checkforjsonFile(File inputfile, String filePrefix) {
	// TODO Auto-generated method stub
	return inputfile.list(new FilenameFilter() {
		
		@Override
		public boolean accept(File dir, String name) {
			// TODO Auto-generated method stub
			return name.startsWith(filePrefix);
		}
	}).length>0;
}


private List<jsoncompareVO> mapDataSameEnvi(List<OutProductVO> inputlist, List<OutProductVO> outputlist) {
	List<jsoncompareVO> jsonList=new ArrayList<jsoncompareVO>();
	try {
		for(OutProductVO IPeach:inputlist) {
			for(OutProductVO OPeach:outputlist) {
				if((IPeach.getProductid().compareTo(OPeach.getProductid())==0)){
					jsoncompareVO jsonvo=new jsoncompareVO();
					jsonvo.setProductid(IPeach.getProductid());
					jsonvo.setIPproductjson(IPeach.getPublishmesg());
					jsonvo.setOPproductjson(OPeach.getPublishmesg());
					 jsonList.add(jsonvo);
				}
			}
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	return jsonList;
	}

private List<jsoncompareVO> mapDataDiffEnvi(List<TransprodVO> inputlist, List<OutProductVO> outputlist) {
		List<jsoncompareVO> jsonList=new ArrayList<jsoncompareVO>();
		try {
			for(TransprodVO IPeach:inputlist) {
				for(OutProductVO OPeach:outputlist) {
					if((IPeach.getProductID().compareTo(OPeach.getProductid())==0)){
						jsoncompareVO jsonvo=new jsoncompareVO();
						jsonvo.setProductid(IPeach.getProductID());
						jsonvo.setIPproductjson(IPeach.getPublishmesg());
						jsonvo.setOPproductjson(OPeach.getPublishmesg());
						 jsonList.add(jsonvo);
					}
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return jsonList;
	}

private String createFolderwithCurrentDate(String reportFolder) {
	String date;
	DateFormat datefor=new SimpleDateFormat("dd-MM-yy");
	date=datefor.format(new Date());
	File theDir=new File(reportFolder+date);
	if(!theDir.exists()) {
		theDir.mkdirs();
	}else {
		System.err.println("Folder with date exists");
	}
		String filePath=theDir.getAbsolutePath();
		System.out.println("Path="+theDir.getAbsolutePath());
		return filePath;
	}

public static String getTimeStamp() {
	String ts=null;
	SimpleDateFormat formatter=new SimpleDateFormat("HH-mm-ss_z");
	Date date=new Date(System.currentTimeMillis());
	ts=formatter.format(date);
	return ts;
}

}
