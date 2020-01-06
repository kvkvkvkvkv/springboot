package com.epam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.epam.service.GreetingService;

@Controller
public class ConstructorBased {
	
	private GreetingService greetingService;

	@Autowired
	public ConstructorBased(@Qualifier("constructorBasedGS")GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String greet() {
		return greetingService.greet();
	}
}
