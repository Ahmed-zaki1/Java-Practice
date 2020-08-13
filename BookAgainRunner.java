package com.practice;

public class BookAgainRunner {
	public static void main(String[] args) {
		BookAgain book = new BookAgain(123, "Object Oriented Programming with Java",
				"Ahmed");
		book.addReview(new Review(10, "Great Book", 5));
		book.addReview(new Review(101, "Awesome", 5));

		System.out.println(book);

	}
}
