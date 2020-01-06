package com.epam.service;

import org.springframework.stereotype.Service;

@Service
public class SetterBasedGS implements GreetingService{

	@Override
	public String greet() {
		return "From setter";
	}

}
