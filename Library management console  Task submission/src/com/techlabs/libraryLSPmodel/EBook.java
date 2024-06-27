package com.techlabs.libraryLSPmodel;

public class EBook extends Book{

	private String downloadUrl;

	public EBook(String title,String author,String downloadUrl) {
		super(title,author);
		this.downloadUrl = downloadUrl;
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}
	@Override
	public void catalog() {
		// TODO Auto-generated method stub
		System.out.println("Cataloging EBook: "+getTitle());
	}
	 
	
}
