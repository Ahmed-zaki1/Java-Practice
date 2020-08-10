package com.practice;

public class BookRunner {

	public static void main(String[] args) {
		Book english=new Book(10);
		Book hindi=new Book(20);
		Book marathi=new Book(30);
		Book Hello=new Book(30);
		System.out.println(english.getNoOfCopy());
		System.out.println(hindi.getNoOfCopy());
		System.out.println(marathi.getNoOfCopy());
		
		System.out.println(Hello.getNoOfCopy());
		
		english.setNoOfCopy(100);
		hindi.setNoOfCopy(50);
		marathi.setNoOfCopy(30);
	
		english.increasenoOfCopy(20);
		hindi.increasenoOfCopy(20);
		marathi.increasenoOfCopy(50);
		
		english.descresenoOfCopy(15);
		hindi.descresenoOfCopy(44);
		marathi.descresenoOfCopy(35);
		System.out.println(english.getNoOfCopy());
		System.out.println(hindi.getNoOfCopy());
		System.out.println(marathi.getNoOfCopy());
	}

}
