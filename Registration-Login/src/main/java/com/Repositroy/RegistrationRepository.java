package com.Repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Entity.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {

}
