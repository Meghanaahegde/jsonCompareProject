package com.jsonproj.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.jsonproj.model.Product;
import com.jsonproj.model.ProductData;
import com.jsonproj.util.JsonComparisionProperties;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

@org.springframework.stereotype.Service
public class jsonComparisionService {
	@Autowired 
	JsonComparisionProperties exclude;
	
	private ExtentTest extentlogger;

	public ExtentTest getExtentlogger() {
		return extentlogger;
	}

	public void setExtentlogger(ExtentTest extentlogger) {
		this.extentlogger = extentlogger;
	}

	public void compareJson(ProductData IPjson,ProductData OPjson) {
		String infoHeader="<font size=04><font color=#4OCEBA><b><i>";
		String info2Header="<font size=02><font color=#4OCEBA><b><i>";
		Product IPobj=IPjson.getProduct();
		Product OPobj=OPjson.getProduct();
		String Allexclusions=exclude.getExclusion_Param_in_json();
		//Path to node
		String productpath="Product.";
		String keyPath="<br>Keys.";
		try {
			if(IPobj.equals(OPobj)) {
				extentlogger.log(LogStatus.PASS, "IP and OP matches","Json match are equals");
			}else {
				//start printing the diff elements
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
