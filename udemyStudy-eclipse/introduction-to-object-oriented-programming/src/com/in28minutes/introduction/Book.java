package com.in28minutes.introduction;

public class Book {
	private int pages = 0;
	private int copies = 0;
	
	public void search() {
		System.out.println("SEARCH!");
	}

	public void noOfPages(int a) {
		pages = a;
		System.out.printf("this book has %d pages", pages).println();		
	}
	public void noOfCopies(int a) {
		copies = a;
		System.out.printf("this book was %d times copied", copies).println();		
	}
}