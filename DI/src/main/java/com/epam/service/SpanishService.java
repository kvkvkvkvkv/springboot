package com.epam.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("span")
@Primary
public class SpanishService implements GreetingService{

	@Override
	public String greet() {
		return "Spanish";
	}
	
	
}
