package com.limitservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Limitservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(Limitservice1Application.class, args);
	}

}
