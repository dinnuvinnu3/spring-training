package com.example.demo;

import org.springframework.stereotype.Component;

@Component("Porsch")
public class Porsch implements Car{

	@Override
	public void priceDisplay() {
		System.out.println("Porsch Price is above 10000000");
		
	}

	@Override
	public void serviceProvided() {
		System.out.println("Porsch service available only for the bigger/metro cities");
		
	}

	
	
}
