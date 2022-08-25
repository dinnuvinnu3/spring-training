package com.example.dbsjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dbsjpa.model.BankAccount;
import com.example.dbsjpa.repository.BankRepo;

@Service
public class BankService {

	@Autowired
	BankRepo bankRepo;
	public List<BankAccount> fetchDetails(BankAccount bankAccount) {
		// TODO Auto-generated method stub
		return bankRepo.findAll();
	}
	public void insertTheDetails(BankAccount bankAccount) {
		bankRepo.save(bankAccount);
	}

}
