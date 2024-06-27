package com.techlabs.LibraryDependencymodel;

public class BorrowManager implements Borrowable{

	@Override
	public void borrowBook(Book book, User user) {
		if(!book.isBorrowed()) {
			book.setBorrowed(true);
			System.out.println(user.getName()+"  borrowed "+book.getTitle());
		}
		else {
			System.out.println(book.getTitle()+" already borrowed");
		}
		
		
	}

}
