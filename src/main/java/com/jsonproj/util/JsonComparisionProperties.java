package com.jsonproj.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/JsonComparision.properties")
@PropertySource(value= "file:${CONF_DIR)/JsonComparision.properties",ignoreResourceNotFound = true)
@ConfigurationProperties
public class JsonComparisionProperties {
	
	private String runFromLocal;
	private String runFromSQLtoOracleOrDifferentEnvi;
	private String runFromOracletoOracleOrSameEnvi;
	private String inputjsonPath;
	private String outputjsonPath;
	private String extentreportPath;
	private String inboundFileTypes;
	private String exclusion_Param_in_json;
	private String FullFilePrefix;
	
	public String getRunFromLocal() {
		return runFromLocal;
	}
	public void setRunFromLocal(String runFromLocal) {
		this.runFromLocal = runFromLocal;
	}
	public String getRunFromSQLtoOracleOrDifferentEnvi() {
		return runFromSQLtoOracleOrDifferentEnvi;
	}
	public void setRunFromSQLtoOracleOrDifferentEnvi(String runFromSQLtoOracleOrDifferentEnvi) {
		this.runFromSQLtoOracleOrDifferentEnvi = runFromSQLtoOracleOrDifferentEnvi;
	}
	public String getRunFromOracletoOracleOrSameEnvi() {
		return runFromOracletoOracleOrSameEnvi;
	}
	public void setRunFromOracletoOracleOrSameEnvi(String runFromOracletoOracleOrSameEnvi) {
		this.runFromOracletoOracleOrSameEnvi = runFromOracletoOracleOrSameEnvi;
	}
	public String getInputjsonPath() {
		return inputjsonPath;
	}
	public void setInputjsonPath(String inputjsonPath) {
		this.inputjsonPath = inputjsonPath;
	}
	public String getOutputjsonPath() {
		return outputjsonPath;
	}
	public void setOutputjsonPath(String outputjsonPath) {
		this.outputjsonPath = outputjsonPath;
	}
	public String getExtentreportPath() {
		return extentreportPath;
	}
	public void setExtentreportPath(String extentreportPath) {
		this.extentreportPath = extentreportPath;
	}
	public String getInboundFileTypes() {
		return inboundFileTypes;
	}
	public void setInboundFileTypes(String inboundFileTypes) {
		this.inboundFileTypes = inboundFileTypes;
	}
	public String getExclusion_Param_in_json() {
		return exclusion_Param_in_json;
	}
	public void setExclusion_Param_in_json(String exclusion_Param_in_json) {
		this.exclusion_Param_in_json = exclusion_Param_in_json;
	}
	public String getFullFilePrefix() {
		return FullFilePrefix;
	}
	public void setFullFilePrefix(String fullFilePrefix) {
		FullFilePrefix = fullFilePrefix;
	}
	

}
