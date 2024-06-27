package com.techlabs.libraryDependencyTest;

import com.techlabs.LibraryDependencymodel.Book;
import com.techlabs.LibraryDependencymodel.BorrowManager;
import com.techlabs.LibraryDependencymodel.Borrowable;
import com.techlabs.LibraryDependencymodel.Catalogmanager;
import com.techlabs.LibraryDependencymodel.ReturnManager;
import com.techlabs.LibraryDependencymodel.Returnable;
import com.techlabs.LibraryDependencymodel.User;

public class LibraryDependencyTest {

	public static void main(String[] args) {


		Book book1=new Book("Title-andhra","Joseph");
		
		Borrowable boorow=new BorrowManager();
				
		Returnable retur=new ReturnManager();
		
		User user1=new User("Alice","1",boorow,retur);
		
		user1.registerUser(user1);
		
		Catalogmanager catalog=new Catalogmanager();
		
		catalog.catalogBook(book1);
		
		
		user1.returnBook(book1);
		
		user1.borrowBook(book1);
		
		System.out.println(book1.isBorrowed());
		
		user1.returnBook(book1);
	}

}
