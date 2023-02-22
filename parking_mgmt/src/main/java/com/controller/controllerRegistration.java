package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.user;
import com.repository.UserRepository;

@Controller
public class controllerRegistration {
	
	@Autowired
	private UserRepository userRepository;
		
	@GetMapping("/register")
	public String showRegistrationForm(Model user) {
		user.addAttribute("user",new user());
		return "registered successful";		
	}
	
	@PostMapping("/register")
	public String pocessRegistrationForm(@ModelAttribute("user")user user1) {
		userRepository.save(user1);
		return "redirect:/success";		
	}	
}
