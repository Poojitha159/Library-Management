package com.techlabs.libraryOCPTest;

import com.techlabs.libraryOCPmodel.Book;
import com.techlabs.libraryOCPmodel.BorrowManager;
import com.techlabs.libraryOCPmodel.Borrowable;
import com.techlabs.libraryOCPmodel.ReturnManager;
import com.techlabs.libraryOCPmodel.User;

public class LibraryOCPTest {

	public static void main(String[] args) {


		Book book1=new Book("1990","Landel");
		User user1=new User("Jake","101");
		
		user1.registerUser(user1);
		book1.catalogbook(book1, user1);
		
		Borrowable borrow=new  BorrowManager();
		borrow.borrowBook(book1, user1);
		
		ReturnManager retur=new ReturnManager();
		
		retur.returnBook(book1,user1);
		
		
	}

}

//following the Open/Closed Principle (OCP), 
//we ensure that the system can be extended with new functionality (e.g., different borrowing strategies) without modifying the existing classes. 
//This enhances maintainability and scalability.