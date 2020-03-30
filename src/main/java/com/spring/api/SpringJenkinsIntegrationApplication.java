package com.spring.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsIntegrationApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringJenkinsIntegrationApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Application started");
		SpringApplication.run(SpringJenkinsIntegrationApplication.class, args);
	}

}
