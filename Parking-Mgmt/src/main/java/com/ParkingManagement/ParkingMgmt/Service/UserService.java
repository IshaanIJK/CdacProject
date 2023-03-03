package com.ParkingManagement.ParkingMgmt.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ParkingManagement.ParkingMgmt.Entity.User;
import com.ParkingManagement.ParkingMgmt.Repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	 
	 public List<User> getUsers() {
	 return userRepository.findAll();
	 }
	 
	 public User insertUser(User user) {
		 return userRepository.save(user);
	 }
//	 public User insertUser(User user) {
//	        return userRepository.save(user);
//	    }
	


    
}

