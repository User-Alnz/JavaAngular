package oop;

import java.util.Scanner;

class Student {
	
	//Instance variables. Also called attributes.
	private int studentId; 
	private String studentName;
	private int studentAge;
	
	Scanner scanner =  new Scanner(System.in);
	
	// class method example
	public void enterStudentInfo() {

		System.out.print("Enter your Id number : ");
		studentId = scanner.nextInt();
		
		System.out.print("Enter your name : ");
		studentName = scanner.next();
		
		System.out.print("Enter your age : ");
		studentAge = scanner.nextInt();
		
	}
	
	public void printStudentInfo() {
		System.out.println("Your id is " + studentId);
		System.out.println("Your name is " + studentName);
		System.out.println("Your age is " + studentAge);
	}
}


public class ClassObjectExample {

	public static void main(String[] args) {
		
		//Create Object of Class Student and initiate new instance
		Student student = new Student();
		
		student.enterStudentInfo();
		student.printStudentInfo();
		
	}

}
