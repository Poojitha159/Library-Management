package com.techlabs.LibraryDependencymodel;

//import com.techlabs.libraryLSPmodel.User;
import com.techlabs.LibraryDependencymodel.User;
public class ReturnManager implements Returnable{

	@Override
	public void returnBook(Book book, User user) {


		if(book.isBorrowed()) {
			book.setBorrowed(false);
			System.out.println(user.getName()+" returned "+book.getTitle());
		}
		else {
			System.out.println(book.getTitle()+"  is not borrowed");
		}
		
		
	}

	
	
	
}
