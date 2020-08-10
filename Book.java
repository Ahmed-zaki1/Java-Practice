package com.practice;

public class Book {

	private  int noOfCopy;
	Book(){
		this(70);
	}
	public Book(int noOfCopy) {
		this.noOfCopy=noOfCopy;
	}

	public int getNoOfCopy() {
		return noOfCopy;
	}

	public void setNoOfCopy(int noOfCopy) {
		if (noOfCopy>0) 
		this.noOfCopy = noOfCopy;
	}
	public void increasenoOfCopy(int howMuch) {
		setNoOfCopy(this.noOfCopy + howMuch);
	}
	public void descresenoOfCopy(int howMuch) {
		setNoOfCopy(this.noOfCopy - howMuch);
	}

}
