package com.example.dbsSecurity1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.dbsSecurity1.model.DbsUser;
import com.example.dbsSecurity1.model.MyUserDetails;
import com.example.dbsSecurity1.repository.DbsRepo;

@Service
public class DbsService implements UserDetailsService{

	@Autowired
	DbsRepo dbsRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		DbsUser dbsUser = dbsRepo.findByUserName(username);
		MyUserDetails myUserDetails = new MyUserDetails(dbsUser);
		return myUserDetails;
	}
	
	
}
