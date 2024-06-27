package com.techlabs.libraryISPmodel;

public class CatalogManager implements Catalog {

	@Override
	public void catalogBook(Book book) {
		
		System.out.println("Cataloging book: "+book.getTitle()+ " by "+book.getAuthor());
		
	}

}
