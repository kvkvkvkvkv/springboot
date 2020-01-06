package com.epam.controller;

import org.springframework.stereotype.Controller;

import com.epam.service.GreetingService;

@Controller
public class DiController {
	
	private GreetingService greetingService;
	
	public String DI() {
		System.out.println("Hello");
		return greetingService.greet();
	}

	public DiController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}
