package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Lab4EurekaServerApplication {

	// a replica set is configured. Run each as follows
	
	// -Dspring.profiles.active=primary
	// http://eureka-primary:8011/eureka
	
	// -Dspring.profiles.active=secondary
	// http://eureka-secondary:8012/eureka
	
	// -Dspring.profiles.active=tertiary
	// http://eureka-tertiary:8013/eureka
	
	public static void main(String[] args) {
		SpringApplication.run(Lab4EurekaServerApplication.class, args);
	}
}
