package com.techlabs.librarymodel;

public class User {

	private String name;
	private String userId;
	
	public User(String name, String userId) {
		
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
        // TO register logic
        System.out.println("User " + user.getName() + " registered with ID " + user.getUserId());
    }
	
	public void borrowBook(Book book, User user) {
		if(!book.isBorrowed()) {
			book.setBorrowed(true);
			System.out.println(user.getName()+" borrowed "+ book.getTitle());
		}
		
	}	
}
