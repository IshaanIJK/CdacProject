package com.Sample.sampleproject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	private int uid;
	private String uname;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int uid, String uname) {
		super();
		this.uid = uid;
		this.uname = uname;
	}
	
	
}
