package com.in28minutes.introduction;

public class BookRunner {

	public static void main(String[] args) {
		Book art_Of_Computer_programming = new Book();
		Book effective_Java = new Book();
		Book clean_Code = new Book();
		
//		객체 이름은 항상 소문자로 시작
		art_Of_Computer_programming.search();
		effective_Java.search();
		clean_Code.search();
		
		art_Of_Computer_programming.noOfPages(8);
		effective_Java.noOfCopies(12);
		clean_Code.noOfCopies(6);
	}
}