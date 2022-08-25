package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DBS{

	@Autowired
	@Qualifier("MaruthiCar")
	Car car;
	public void execution() {
		System.out.println("Welcome... to DBS ....");
	}
	
	public void event() {
		car.priceDisplay();
		car.serviceProvided();
	}
}
