package com.example.dbsOAuth;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbsAuthController {

	@RequestMapping("/login")
	public String loginPage() {
		return "Welcome to DBS Tech...";
	}
}
