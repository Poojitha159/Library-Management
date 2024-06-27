package com.techlabs.libraryLSPmodel;

public class PrintedBook extends Book {

	public PrintedBook(String title, String author,String shelfLocation) {
		super(title, author);
		this.shelfLocation=shelfLocation;
	}

	private String shelfLocation;
	
	

	public String getShelfLocation() {
		return shelfLocation;
	}



	public void setShelfLocation(String shelfLocation) {
		this.shelfLocation = shelfLocation;
	}



	@Override
	public void catalog() {


		System.out.println("CAtaloging printed Book: "+getTitle()+" by "+getAuthor()+" at shelf Location "+getShelfLocation());
	}
	
}
