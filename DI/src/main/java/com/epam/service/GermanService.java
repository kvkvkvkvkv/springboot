package com.epam.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("ger")
@Primary
public class GermanService implements GreetingService{

	@Override
	public String greet() {
		return "German!";
	}

}
