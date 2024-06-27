package com.techlabs.libraryLSPTest;

import com.techlabs.libraryLSPmodel.Book;
import com.techlabs.libraryLSPmodel.BorrowManager;
import com.techlabs.libraryLSPmodel.Borrowable;
import com.techlabs.libraryLSPmodel.Catalog;
import com.techlabs.libraryLSPmodel.EBook;
import com.techlabs.libraryLSPmodel.PrintedBook;
import com.techlabs.libraryLSPmodel.ReturnManager;
import com.techlabs.libraryLSPmodel.User;

public class LibraryLSPTest {

	public static void main(String[] args) {

           Book book1=new EBook("Agent-Andhra","Andrew","https://book.com/2020");
           Book printedBook1=new PrintedBook("New World-India ","herley","H1");
           
           User user1=new User("William","01");
           
           user1.registerUser(user1);
           
           Catalog catalog=new Catalog();
           catalog.calatalogBook(book1, user1);
           catalog.calatalogBook(printedBook1, user1);
           
           Borrowable borrow=new BorrowManager();
           borrow.borrowBook(book1, user1);
           borrow.borrowBook(printedBook1, user1);
           
           ReturnManager retur=new ReturnManager();
           retur.returnBook(book1,user1);
           retur.returnBook(printedBook1, user1);
           
           
           

           

	}

}
