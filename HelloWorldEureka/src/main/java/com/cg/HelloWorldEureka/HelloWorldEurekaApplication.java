package com.cg.HelloWorldEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HelloWorldEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldEurekaApplication.class, args);
	}

}

