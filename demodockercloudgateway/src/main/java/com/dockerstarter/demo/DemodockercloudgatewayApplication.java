package com.dockerstarter.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DemodockercloudgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemodockercloudgatewayApplication.class, args);
	}

}
