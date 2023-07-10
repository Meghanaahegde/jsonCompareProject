package com.jsonproj.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.LogManager;



import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.RowMapper;

import com.jsonproj.vo.ProductVo;
import com.jsonproj.vo.TransprodVO;

public class inputrepo {
	
	//public static final Logger LOGGER=LogManager.getlogger(inputrepo.class);
	@Autowired
	@Qualifier("inputjdbcTemplate")
	private NamedParameterJdbcTemplate inputjdbcTemplate;
	
public List<ProductVo> getInputproductdatafromAppl(List<Long> outputProductList){
	SqlParameterSource productid=new MapSqlParameterSource("outputproductlist",outputProductList);
	List<ProductVo> returnlist=//here is the mysql query to fetch products
			inputjdbcTemplate.query("select *  from ", new InputProductBatchRowMapper());
	return returnlist;
	
}


public List<TransprodVO> getinputdatafromsamedb(){
	
	List<TransprodVO> returnlist=inputjdbcTemplate.query("select", new InputProductRowMapper());
	return returnlist;
	
}

class InputProductRowMapper implements RowMapper<TransprodVO>{
	@Override
	public TransprodVO mapRow(ResultSet rs,int rownum) throws SQLException{
		TransprodVO obj=new TransprodVO();
		obj.setProductID(rs.getLong("ProductID"));
		byte[] byteArray=rs.getBytes("Publishmesg");
		obj.setPublishmesg(new String(byteArray));
		
		return obj;
	}
}
class InputProductBatchRowMapper implements RowMapper<ProductVo>
{
	@Override
	public ProductVo mapRow(ResultSet rs,int rownum) throws SQLException{
		ProductVo user=new ProductVo();
		user.setProductID(rs.getLong("ProductID"));
		user.setProductjson(rs.getString("ProductJson"));
		return user;
		
	}
}
	
	

}
