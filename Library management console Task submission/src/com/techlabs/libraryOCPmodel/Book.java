package com.techlabs.libraryOCPmodel;

//import com.techlabs.librarymodel.Book;
import com.techlabs.libraryOCPmodel.User;

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

		public void catalogbook(Book book,User user) {
			System.out.println("Cataloging book: " + book.getTitle() + " by " + book.getAuthor());

		}
}
