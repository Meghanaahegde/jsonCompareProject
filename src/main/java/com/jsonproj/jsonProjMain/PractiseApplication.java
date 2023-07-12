package com.jsonproj.jsonProjMain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.jsonproj.service.FileConsumerService;

@SpringBootApplication
////@ComponentScan("com.jsonproj")
//@EnableCaching
////@Component
//implements CommandLineRunner
public class PractiseApplication {

	//@Autowired
	static FileConsumerService consumer=new FileConsumerService();
	
	public static void main(String[] args) throws Exception{
		//SpringApplication.run(PractiseApplication.class, args);
		
		try {
			consumer.processInboundFiles();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		consumer.processInboundFiles();
//	}

}
