package com.example.dbssecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbsController {

	@GetMapping("/home")
	public String homePage() {
		return "Welcome to DBS Tech..";
	}
	
}
