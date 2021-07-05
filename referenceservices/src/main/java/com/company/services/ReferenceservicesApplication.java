package com.company.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ReferenceservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReferenceservicesApplication.class, args);
	}

}
