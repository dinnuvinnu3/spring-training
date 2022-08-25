package com.example.dbsjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dbsjpa.model.BankAccount;

public interface BankRepo extends JpaRepository<BankAccount, Integer> {

}
