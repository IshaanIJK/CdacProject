package com.ParkingManagement.ParkingMgmt.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String mobileNo;
  private String fullName;
  private String email;
  private String password;
  
  

  public User() {}

  public User(String mobileNo, String fullName, String email, String password) {
    this.mobileNo = mobileNo;
    this.fullName = fullName;
    this.email = email;
    this.password = password;
  }

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getMobileNo() {
	return mobileNo;
}

public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}

public String getFullName() {
	return fullName;
}

public void setFullName(String fullName) {
	this.fullName = fullName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

 
}
