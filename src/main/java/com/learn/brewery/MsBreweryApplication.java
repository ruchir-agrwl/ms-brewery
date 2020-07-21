package com.learn.brewery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsBreweryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsBreweryApplication.class, args);
	}

}
