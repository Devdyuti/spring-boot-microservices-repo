package org.microservice.poc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {
	
	@GetMapping("/test")
	public String test() {
		return "Service Avlaible!!!";
	}
}
