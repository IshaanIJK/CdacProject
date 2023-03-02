package com.registrationlogin.RegistrationLogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EntityScan(basePackages = "com.Entity.Registration")
public class RegistrationLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationLoginApplication.class, args);
	}

}
