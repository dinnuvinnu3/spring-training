package com.example.dbsSecurity1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbsController {

	@GetMapping("/home")
	public String homePage() {
		return "Welcome to DBs Tech...";
	}
	
	@GetMapping("/admin")
	public String adminPage() {
		return "Welcome to ADMIN Page...";
	}
	
	@GetMapping("/user")
	public String userPage() {
		return "Welcome to user Page...";
	}
}
