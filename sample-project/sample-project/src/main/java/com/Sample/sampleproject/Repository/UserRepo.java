package com.Sample.sampleproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sample.sampleproject.Entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
