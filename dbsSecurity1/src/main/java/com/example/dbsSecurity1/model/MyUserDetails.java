package com.example.dbsSecurity1.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails implements UserDetails{

	private String userName;
    private String password;
    private boolean active;
    private List<GrantedAuthority> authorities;
	public MyUserDetails(DbsUser dBSUser) {
        
        this.userName = dBSUser.getUserName();
        this.password = dBSUser.getPassword();
        this.active = dBSUser.isActive();
        
        String[] roles = dBSUser.getRoles().split(",");
        String eachRole ="";
        List<GrantedAuthority> localAuth = new ArrayList<GrantedAuthority>();
        for(int i=0;i<roles.length;i++) {
            eachRole = roles[i];
            
            localAuth.add(new SimpleGrantedAuthority(eachRole));
        }
        this.authorities = localAuth;
        
        
        
    }
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	
}