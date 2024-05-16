package com.techenthusiasist.restarantlistingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RestaurantlistingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantlistingServiceApplication.class, args);
	}

}
