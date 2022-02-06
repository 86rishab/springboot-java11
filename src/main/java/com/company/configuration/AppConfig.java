package com.company.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication // same as @Configuration @EnableAutoConfiguration
// @ComponentScan

@SpringBootApplication(scanBasePackages = {"com.company"})
public class AppConfig {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AppConfig.class, args);
    }
}
