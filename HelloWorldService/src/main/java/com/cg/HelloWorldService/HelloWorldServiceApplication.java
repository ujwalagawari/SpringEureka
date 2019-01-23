package com.cg.HelloWorldService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HelloWorldServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldServiceApplication.class, args);
	}

}

