package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 class AscendingStudentAgainComparator  implements Comparator<StudentAgain> {
	@Override
	public int compare(StudentAgain StudentAgain1, StudentAgain StudentAgain2) {
		return Integer.compare(StudentAgain1.getId(), StudentAgain2.getId());
	}
}

public class StudentAgainsCollectionRunner {

	public static void main(String[] args) {
		List<StudentAgain> students = List.of(new StudentAgain(1, "Ranga"),
				new StudentAgain(100, "Adam"),
				new StudentAgain(2,"Eve"));
		
		ArrayList<StudentAgain> StudentAgainsAl = new ArrayList<>(students);
		
		System.out.println(StudentAgainsAl);
		
		Collections.sort(StudentAgainsAl);
		System.out.println("Desc " + StudentAgainsAl);
		
		
		StudentAgainsAl.sort(new AscendingStudentAgainComparator());
		System.out.println("AscendingStudentAgainComparator " + StudentAgainsAl);	
	}

}