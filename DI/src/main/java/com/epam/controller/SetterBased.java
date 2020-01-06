package com.epam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.epam.service.GreetingService;

@Controller
public class SetterBased {

	private GreetingService greetingService;
	
	public String greet() {
		return greetingService.greet();
	}

	@Autowired
	@Qualifier("setterBasedGS")
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	
}
