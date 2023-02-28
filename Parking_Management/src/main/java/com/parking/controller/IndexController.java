package com.parking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.parking.model.User;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public String index()
	{
		return "index";
	}

	@PostMapping("/register")
	public String UserRegistraton(@ModelAttribute User user) {
		System.out.println(user.toString());
		
		return "index";
		
	}
}
