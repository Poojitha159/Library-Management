package com.techlabs.libraryISPmodel;

import com.techlabs.libraryISPmodel.User;

public class User {

	private String name;
	private String userid;
	public User(String name, String userid) {
		//super();
		this.name = name;
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public void registerUser(User user) {
		System.out.println("User "+user.getName()+ " registered with ID "+user.getUserid());
	}
	
}
