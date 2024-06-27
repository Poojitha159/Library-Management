package com.techlabs.libraryOCPmodel;

public class BorrowManager implements Borrowable {

	@Override
	public void borrowBook(Book book, User user) {

		if (!book.isBorrowed()) {
            book.setBorrowed(true);
            System.out.println(user.getName() + " borrowed " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is already borrowed.");
        }

		
	}

}
