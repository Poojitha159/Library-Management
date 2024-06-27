package com.techlabs.librarymodel;

import com.techlabs.librarymodel.User;
public class Book {

    private String title;
    private String author;
    private boolean isBorrowed;
	
	public Book(String title, String author) {
		
		this.title = title;
		this.author = author;
		this.isBorrowed =false ;
		
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isBorrowed() {
		return isBorrowed;
	}

	public void setBorrowed(boolean isBorrowed) {
		this.isBorrowed = isBorrowed;
	}

	
	public void borrowBook(Book book, User user) {
		if(!book.isBorrowed()) {
			book.setBorrowed(true);
			System.out.println(user.getName()+" borrowed "+ book.getTitle());
		}
		
	}
	
	public void returnBook(Book book,User user) {
		if (book.isBorrowed()) {
            book.setBorrowed(false);
            System.out.println(user.getName() + " returned " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is not borrowed.");
        }

		
		
	}
	
	public void catalogbook(Book book,User user) {
		System.out.println("Cataloging book: " + book.getTitle() + " by " + book.getAuthor());

		
	}
    
}
