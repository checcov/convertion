package com.vin.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.vin.controller", "com.vin.service"})
public class ConvertApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConvertApplication.class, args);
	}
}
