package com.practice;

import java.util.Scanner;

public class MultipleTable {
public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
	n=sc.nextInt();
for (int i = 1; i <= 10; i++) {
	System.out.printf("%d x %d = %d", n, i, n * i).println();
}
}
}
