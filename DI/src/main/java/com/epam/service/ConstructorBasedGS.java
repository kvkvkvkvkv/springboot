package com.epam.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorBasedGS implements GreetingService{

	@Override
	public String greet() {
		return "From constructor";
	}
	
	
}
