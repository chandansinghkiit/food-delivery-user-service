package com.ftgo.food_delivery_user_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FoodDeliveryUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodDeliveryUserServiceApplication.class, args);
	}

}
