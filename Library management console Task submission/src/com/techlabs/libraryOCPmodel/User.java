package com.techlabs.libraryOCPmodel;

//import com.techlabs.librarymodel.User;

public class User {
	private String name;
	private String userId;
	
	public User(String name, String userId) {
		//super();
		this.name = name;
		this.userId = userId;
	}

	/*public String getName() {
		return name;
	}*/

	public void setName(String name) {
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	

	public String getName() {
		
		return name;
	}
	
	public void registerUser(User user) {
        // registration logic
        System.out.println("User " + user.getName() + " registered with ID " + user.getUserId());
    }

}
