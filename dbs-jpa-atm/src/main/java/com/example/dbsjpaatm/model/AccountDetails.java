package com.example.dbsjpaatm.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountDetails {

	@Id
	int id;
	String name;
	public AccountDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccountDetails(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
