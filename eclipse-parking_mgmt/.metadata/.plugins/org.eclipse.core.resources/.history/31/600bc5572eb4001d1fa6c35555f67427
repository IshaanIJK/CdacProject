package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Bean.User;

@Controller
public class UserController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@PostMapping("/home")
	public String userRegistration(@ModelAttribute User user) {
		System.out.println(user.toString());
		
		return "index";
	}

}
