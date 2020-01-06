package com.epam.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"eng","default"})
public class PrimaryGS implements GreetingService{

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "Hi primary";
	}
	
	
}
