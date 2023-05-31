package edu.learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/get-message") // Rest Endpoint (REST API)
	public String returnMessage() {
		return "Hello User Welcome to First REST API";
	}
	
}
