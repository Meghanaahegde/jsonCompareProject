package com.jsonproj.config;

import java.beans.PropertyVetoException;
import java.sql.SQLException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mchange.v2.c3p0.ComboPooledDataSource;


@Configuration
@PropertySource("classpath:config/inputdb.properties")
@PropertySource(value="file:${CONF_DIR}/inputdb.properties",ignoreResourceNotFound=true)
public class OPDatasourceConfig {
	
	@Bean
	public ComboPooledDataSource outputdataSource(Environment env) throws IllegalStateException,PropertyVetoException,SQLException{
		ComboPooledDataSource outputdataSource =new ComboPooledDataSource();
		outputdataSource.setDriverClass(env.getRequiredProperty("output.jdbc.driverClassName"));
		outputdataSource.setJdbcUrl(env.getRequiredProperty("output.datasource.url"));
		outputdataSource.setUser(env.getRequiredProperty("output.datasource.username"));
		outputdataSource.setPassword(env.getRequiredProperty("output.datasource.password"));
		outputdataSource.setMaxPoolSize(3);
		outputdataSource.getConnection();
		return outputdataSource;
		
	}
	@Bean
	public JdbcTemplate outputjdbcTemplate(ComboPooledDataSource outputdataSource) {
		JdbcTemplate outputjdbcTemplate=new JdbcTemplate(outputdataSource);
		outputjdbcTemplate.setResultsMapCaseInsensitive(true);
		return outputjdbcTemplate;
		
	}
}