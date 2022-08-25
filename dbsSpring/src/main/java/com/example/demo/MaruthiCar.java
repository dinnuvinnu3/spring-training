package com.example.demo;

import org.springframework.stereotype.Component;

@Component("MaruthiCar")
public class MaruthiCar implements Car{

	@Override
	public void priceDisplay() {
		System.out.println("Price of Maruthi Car ---> 300000");
		
	}

	@Override
	public void serviceProvided() {
		System.out.println("Service of maruthi car is provided to the metro cities");
		
	}
}