package com.epam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.epam.repository.AuthorRepository;

@Controller
public class AuthorController {
	
	@Autowired
	AuthorRepository authorRepository;
	
	@RequestMapping("author")
	public String authors(Model model) {
		model.addAttribute("authors",authorRepository.findAll());
		return "Author";
	}
}
