package com.pyramix.cloud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * https://www.geeksforgeeks.org/advance-java/java-spring-boot-microservices-develop-api-gateway-using-spring-cloud-gateway/
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

	@GetMapping("/gfg")
	public ResponseEntity<String> getMessage() {
		return ResponseEntity.ok("Welcome to GeeksforGeeks");
	}
	
}
