package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.Registration;
import com.Repositroy.RegistrationRepository;

@RestController
public class RegisterController {
	
	@Autowired
	private RegistrationRepository registrationRepository ;
	
	@PostMapping("/user")
	Registration newUser(@RequestBody Registration newUser) {
		return registrationRepository.save(newUser);
	}

}
