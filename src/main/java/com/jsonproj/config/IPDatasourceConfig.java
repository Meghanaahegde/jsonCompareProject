package com.jsonproj.config;

import java.beans.PropertyVetoException;
import java.sql.SQLException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("classpath:config/inputdb.properties")
@PropertySource(value="file:${CONF_DIR}/inputdb.properties",ignoreResourceNotFound=true)
public class IPDatasourceConfig {
	
	@Bean
	public DriverManagerDataSource inputdataSource(Environment env) throws IllegalStateException,PropertyVetoException,SQLException{
		DriverManagerDataSource inputdataSource =new DriverManagerDataSource();
		inputdataSource.setDriverClassName(env.getRequiredProperty("input.jdbc.driverClassName"));
		inputdataSource.setUrl(env.getRequiredProperty("input.datasource.url"));
		inputdataSource.setUsername(env.getRequiredProperty("input.datasource.username"));
		inputdataSource.setPassword(env.getRequiredProperty("input.datasource.password"));
		inputdataSource.getConnection();
		return inputdataSource;
		
	}
	@Bean
	public NamedParameterJdbcTemplate inputjdbcTemplate(DriverManagerDataSource inputdataSource) {
		NamedParameterJdbcTemplate inputjdbcTemplate=new NamedParameterJdbcTemplate(inputdataSource);
		return inputjdbcTemplate;
		
	}
}