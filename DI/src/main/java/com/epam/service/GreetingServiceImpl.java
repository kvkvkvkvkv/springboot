package com.epam.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{
	
	public String greet() {
		return "HI";
	}
}
