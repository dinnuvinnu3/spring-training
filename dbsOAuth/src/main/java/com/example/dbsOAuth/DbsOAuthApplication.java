package com.example.dbsOAuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableOAuth2Sso
public class DbsOAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbsOAuthApplication.class, args);
	}

}
