package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@EnableSwagger2
@Configuration
@SpringBootApplication
public class FarmerComplaintApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarmerComplaintApplication.class, args);
	}

}
