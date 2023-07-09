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
@ComponentScan("com.jsonProj")
@EnableCaching
@Component
public class PractiseApplication implements CommandLineRunner{

	@Autowired
	FileConsumerService consumer;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(PractiseApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		consumer.processInboundFiles();
	}

}
