package com.epam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.epam.service.GreetingService;

@Controller
public class PropertyBasedDi {
	
	@Autowired
	@Qualifier("greetingServiceImpl")
	private GreetingService greetingServiceImpl;
	
	public String greet() {
		return greetingServiceImpl.greet();
	}
}
