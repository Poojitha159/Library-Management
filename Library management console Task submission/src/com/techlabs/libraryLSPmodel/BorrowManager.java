package com.techlabs.libraryLSPmodel;

public class BorrowManager implements Borrowable {

	@Override
	public void borrowBook(Book book, User user) {


		if(!book.isBorrowed()) {
			book.setBorrowed(false);
			System.out.println(user.getName()+" borrowed "+book.getTitle());
			
		}
		else {
			System.out.println(book.getTitle()+" is already borrowed");
		}
	}

	
}
