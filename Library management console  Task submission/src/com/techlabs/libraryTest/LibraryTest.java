package com.techlabs.libraryTest;

import com.techlabs.librarymodel.Book;
import com.techlabs.librarymodel.User;

public class LibraryTest {

	public static void main(String[] args) {

		Book book1 = new Book("1984", "George Orwell");
        User user1 = new User("Alice", "001");
        
        //userRegistrationManager.registerUser(user1);
		//user1.registerUser(user1);
		//user1.borrowBook(book1, user1);
		//book1.catalogbook(book1, user1);
		//book1.borrowBook(book1, user1);
		//book1.returnBook(book1, user1);  
		
		Book book2=new Book("2013","Sky Dyes");
		User user2=new User("Bob","002");
		user2.registerUser(user2);
		//book2.borrowBook(book2, user1);
		book2.borrowBook(book2, user2);
		
	}
	

} 


//Using SRP ........