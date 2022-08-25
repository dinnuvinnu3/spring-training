package com.dbs.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProjectInfo {

	@Id
	String customerID;
	String accountHoldername;
	int clearBalance;
	String overDraft;
	public ProjectInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProjectInfo(String customerID, String accountHoldername, int clearBalance, String overDraft) {
		super();
		this.customerID = customerID;
		this.accountHoldername = accountHoldername;
		this.clearBalance = clearBalance;
		this.overDraft = overDraft;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getAccountHoldername() {
		return accountHoldername;
	}
	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}
	public int getClearBalance() {
		return clearBalance;
	}
	public void setClearBalance(int clearBalance) {
		this.clearBalance = clearBalance;
	}
	public String getOverDraft() {
		return overDraft;
	}
	public void setOverDraft(String overDraft) {
		this.overDraft = overDraft;
	}
	
	
	
	
}
