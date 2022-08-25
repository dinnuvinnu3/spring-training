package com.example.dbsSecurity1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.dbsSecurity1.service.DbsService;

@Configuration
@EnableWebSecurity
public class DbsConfiguration extends WebSecurityConfigurerAdapter{

	@Autowired
	DbsService dBsService;
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        
        http.authorizeRequests()
        .antMatchers("/admin").hasAuthority("so")
        .antMatchers("/user").hasAuthority("USER")
        .antMatchers("/home").hasAuthority("HOME")
        .antMatchers("/register").permitAll()
        .and()
        .authorizeRequests().antMatchers("/h2-console/**").permitAll()
        .and()
        .headers().frameOptions().disable()
        .and()
        .csrf().ignoringAntMatchers("/h2-console/**")
        .and()
        .cors().disable()
        .formLogin();
        
    }
    
    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
	
}
