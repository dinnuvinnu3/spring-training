package com.example.demo;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class DBSAppConfig {

	@After(value="execution(* com.example.demo.*.*(..))")
	public void m1(Joinpoint joinPoint) {
		System.out.println("Before DBS Aop is called");
	}
}
