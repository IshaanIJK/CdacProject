package com.registrationlogin.RegistrationLogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.Entity.Registration")
public class RegistrationLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationLoginApplication.class, args);
	}

}
