package com.example.dbsjpadinesh1.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankAccount1 {

	@Id
	int accNo;
	String name;
	int balance;
	public BankAccount1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount1(int accNo, String name, int balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
