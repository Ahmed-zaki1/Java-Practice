package com.practice;

public class StudyRunner {
	public static void main(String[] args) {

		// Study student = new Study();
		// student.setName("zaki");
		// student.setEmail("Ahmed40886@gmail.com");

		
		  Person person = new Person(); person.setName("Zaki");
		  person.setEmail("Ahmed40886@gmail.com");
		  person.setPhonenumber("123-456-7890"); String value = person.toString();
		  System.out.println(value); System.out.println(person);
		 

		Employee employee = new Employee("Ahmed", "Programmer");
		employee.setName("Zaki");
		employee.setEmail("Ahmed40886@gmail.com");
		employee.setPhonenumber("123-456-7890");
		employee.setEmployeeGrade('A');
		employee.setTitle("Programmer");

		System.out.print(employee);

	}
}
