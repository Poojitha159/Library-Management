package com.techlabs.libraryOCPmodel;

public class ReturnManager {
	public void returnBook(Book book,User user) {
		if (book.isBorrowed()) {
            book.setBorrowed(false);
            System.out.println(user.getName() + " returned " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is not borrowed.");
        }
	}

}
