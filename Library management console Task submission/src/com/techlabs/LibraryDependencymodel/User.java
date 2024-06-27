package com.techlabs.LibraryDependencymodel;

public class User {
	
	private String name;
	private String userid;
	private  Borrowable borrowManager;
	private Returnable returnManager;
	
	
	
	
	public User(String name, String userid, Borrowable borrowManager, Returnable returnManager) {
		super();
		this.name = name;
		this.userid = userid;
		this.borrowManager = borrowManager;
		this.returnManager = returnManager;
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
	
	public void borrowBook(Book book) {
		borrowManager.borrowBook(book, this);
	}
	
	public void returnBook(Book book) {
		returnManager.returnBook(book, this);
	}
	
	
	public void registerUser(User user) {
		System.out.println("User "+user.getName()+" registered with ID "+user.getUserid());
	}

}
