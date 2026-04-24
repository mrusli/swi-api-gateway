package com.pyramix.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @EnableDiscoveryClient
public class SwiApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwiApiGatewayApplication.class, args);
	}

//	@Bean
//	RouteLocator routeLocator(RouteLocatorBuilder builder) {
//		return builder.routes()
//				.route("kitchen-route", r -> r.path("/kitchen/**").uri("lb://pizza-kitchen"))
//				.route("tracker-route", r -> r.path("/tracker/**").uri("lb://pizza-tracker"))				
//				.build();
//	}
	
}
