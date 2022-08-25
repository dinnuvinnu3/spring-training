package com.example.dbsSecurity1.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DbsUser {
	
	@Id
	String userName;
	String password;
	boolean active;
	String roles;
	public DbsUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DbsUser(String userName, String password, boolean active, String roles) {
		super();
		this.userName = userName;
		this.password = password;
		this.active = active;
		this.roles = roles;
	}
	

	public void setActive(boolean active) {
		this.active = active;
	}



	public void setRoles(String roles) {
		this.roles = roles;
	}



	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		// TODO Auto-generated method stub
		return true;
	}

	public String getRoles() {
		// TODO Auto-generated method stub
		return roles;
	}
	
	
	
	

}
