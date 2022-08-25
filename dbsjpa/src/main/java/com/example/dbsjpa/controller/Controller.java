package com.example.dbsjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbsjpa.model.BankAccount;
import com.example.dbsjpa.service.BankService;
import java.util.List;

@RestController
public class Controller {

	@Autowired
	BankService bankService;
	
	@GetMapping("/getDetails")
	public List<BankAccount> getAllDetails(@RequestBody BankAccount bankAccount) {
		return bankService.fetchDetails(bankAccount);
	}
	
	@PostMapping("/insertDetails")
	public void insertAllDetails(@RequestBody BankAccount bankAccount) {
		bankService.insertTheDetails(bankAccount);
	}
}
