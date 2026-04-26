package com.pyramix.cloud.controller;

import org.springframework.http.ResponseEntity;

/**
 * https://www.geeksforgeeks.org/advance-java/java-spring-boot-microservices-develop-api-gateway-using-spring-cloud-gateway/
 */
// @RestController
// @RequestMapping("/demo")
public class DemoController {

	// @GetMapping("/gfg")
	public ResponseEntity<String> getMessage() {
		return ResponseEntity.ok("Welcome to GeeksforGeeks");
	}
	
}
