package com.currency_caluculation_service;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;

import org.springframework.web.client.RestTemplate;

@FeignClient("com.currency_caluculation_service")
@SpringBootApplication
public class CurrencyCaluculationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyCaluculationServiceApplication.class, args);
	}

}
