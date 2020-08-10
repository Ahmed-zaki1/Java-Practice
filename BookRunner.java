package com.practice;

public class BookRunner {

	public static void main(String[] args) {
		Book english=new Book();
		Book hindi=new Book();
		Book marathi=new Book();
		
		english.setNoOfCopy(100);
		System.out.println(english.getNoOfCopy());
		hindi.setNoOfCopy(50);
		System.out.println(hindi.getNoOfCopy());
		marathi.setNoOfCopy(30);
		System.out.println(marathi.getNoOfCopy());
	}

}
