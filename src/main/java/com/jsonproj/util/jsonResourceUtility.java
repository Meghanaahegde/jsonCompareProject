package com.jsonproj.util;

import java.io.InputStream;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jsonproj.model.ProductData;

public class jsonResourceUtility {

	private static ObjectMapper mapper=new ObjectMapper().disable(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES);
	public static ObjectMapper getObjectMapperInstance() {
		return mapper;
	}
	public static ProductData getProductData(String fileName)throws Exception{
		ProductData productData=mapper.readValue(fileName, ProductData.class);
		return productData;
	}
	
	public static InputStream getInputStreamForJsonFile(String fileName) {
		InputStream inputStream=jsonResourceUtility.class.getClassLoader().getResourceAsStream(fileName);
		return inputStream;
	}
}
