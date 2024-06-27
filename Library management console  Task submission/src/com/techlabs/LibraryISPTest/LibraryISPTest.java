package com.techlabs.LibraryISPTest;

import com.techlabs.libraryISPmodel.Book;
import com.techlabs.libraryISPmodel.BorrowManager;
import com.techlabs.libraryISPmodel.CatalogManager;
import com.techlabs.libraryISPmodel.ReturnManager;
import com.techlabs.libraryISPmodel.User;

public class LibraryISPTest {

	public static void main(String[] args) {


		Book book1=new Book("Succes Lies","John");
		User user1=new User("Adem","001");
		
		user1.registerUser(user1);

		CatalogManager catalog=new CatalogManager();
		catalog.catalogBook(book1);
		
		ReturnManager retur=new ReturnManager();
		retur.returnBook(book1, user1);
		
		BorrowManager borrow=new BorrowManager();
		borrow.borrowBook(book1, user1);
		
	//	ReturnManager retur=new ReturnManager();
		//retur.returnBook(book1, user1);
		
	}

}
