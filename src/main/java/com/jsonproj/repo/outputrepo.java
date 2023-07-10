package com.jsonproj.repo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.logging.LogManager;
import java.util.*;



import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;

import com.google.protobuf.TextFormat.ParseException;
import com.jsonproj.util.JsonComparisionProperties;
import com.jsonproj.vo.OutProductVO;
import com.jsonproj.vo.ProductVo;

public class outputrepo {
	
	//public static final Logger LOGGER=LogManager.getlogger(inputrepo.class);
	@Autowired
	private JdbcTemplate outputdataSource;
	@Autowired
	private JsonComparisionProperties jsonCompareProp;
	
public List<OutProductVO> getInputproductdatafromAppl1() throws java.text.ParseException{
	
	SimpleDateFormat formater=new SimpleDateFormat("dd-mm-yyyy",Locale.ENGLISH);
	String dateInstring="29-03-2023";
	String dateInstring1="31-03-2023";
	Date date=formater.parse(dateInstring);
	Date date1=formater.parse(dateInstring1);
	java.sql.Date sqldate=new java.sql.Date(date.getTime());
	java.sql.Date sqldate1=new java.sql.Date(date1.getTime());
	
	
	List<OutProductVO> returnlist=//here is the mysql query to fetch products
			outputdataSource.query("select *  from sometabel where createdate>=? and createdate<=?", new PreparedStatementSetter() {
				@Override
				public void setValues(PreparedStatement preparedstatment) throws SQLException{
					preparedstatment.setDate(1, sqldate);
					preparedstatment.setDate(2, sqldate1);
				}},new inputrowdataMapper());
	return returnlist;
	
}

public Integer getjsoncount() {
	return outputdataSource.queryForObject("select count(*) from tablename", Integer.class);
}

class inputrowdataMapper implements RowMapper<OutProductVO>
{
	@Override
	public OutProductVO mapRow(ResultSet rs,int rownum) throws SQLException{
		OutProductVO tfmobj=new OutProductVO();
		tfmobj.setProductid(rs.getLong("ProductID"));
		byte[] byteArray=rs.getBytes("Publishmesg");
		tfmobj.setPublishmesg(new String(byteArray));
		
		return tfmobj;
		
	}
}
//fetch output data from another query
public List<OutProductVO> getOutputproductdatafromAppl1() {
	// TODO Auto-generated method stub
	return null;
}
	
	

}
