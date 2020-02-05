package com.epam.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Primary;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.epam.model.HelloW;

@RestController
public class HelloController {
	
	@Autowired
	private MessageSource message;
	
	@GetMapping("/hello")
	public HelloW Hello() {
		return new HelloW("Hi");
	}
	
	@GetMapping("/hellopath/{name}")
	public HelloW HelloPath(@PathVariable String name) {
		return new HelloW(String.format("Hi %s",name));
	}
	
//	@GetMapping("/helloy")
//	public String Helloo(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
//		return message.getMessage("hi.message",null , locale);
//		
//	}
	
	@GetMapping("/helloy")
	public String Helloo() {
		return message.getMessage("hi.message",null , LocaleContextHolder.getLocale());
		
	}
}
