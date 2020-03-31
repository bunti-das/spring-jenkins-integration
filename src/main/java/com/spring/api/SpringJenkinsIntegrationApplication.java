package com.spring.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJenkinsIntegrationApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringJenkinsIntegrationApplication.class);

    public static void main(String[] args) {
        LOGGER.info("Application started");
        SpringApplication.run(SpringJenkinsIntegrationApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to Spring Jenkins Tutorial";
    }

}
