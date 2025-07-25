package oop;

	import java.util.Scanner;
	
	/*
	 * Main parent class Student
	 * */
	class ParentClassOfStudent
	{
		//Instance variables. Also called attributes.
		protected int studentId; 
		protected String studentName;
		protected int studentAge;
		
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
	
	
	/**
	 * SINGLE INHERITANCE
	 * */
	//student is in oop package from ./ClassObjectExemple.java
	class Marks extends ParentClassOfStudent
	{
		private float objectiveMarks;
		
		
		void enterStudentInfoChildrenClass() 
		{
			super.enterStudentInfo();// this call parent method instead of calling if from instance class like object.enterStudentInfo();
			System.out.println("Enter objectiveMarks : ");
			objectiveMarks = scanner.nextFloat();
		}
		
		void printStudentInfoChildrenClass() 
		{
			System.out.println("Your Mark is " + objectiveMarks);
		}
	}
	
	
	/****
	 * MULTIPLE INHERITANCE 
	 * https://www.digitalocean.com/community/tutorials/multiple-inheritance-in-java
	 * If we add one children class to Student we pass to multiple inheritance model
	 * 
	 * => mind it's chaining methods using "super" to call in chain upper 
	 ****/
	
	class Sport extends Marks 
	{
		private int score;
		
		void enterStudentSportScore() 
		{
			//this super is chained with parent +1 that its method is also chained with parent +2 from Sport class 
			super.enterStudentInfoChildrenClass();
			System.out.println("Enter your score : ");
			score = scanner.nextInt();
		}
		
		void printStudentSportScore() 
		{
			//On purpose ! there we cannot access first Parent method in row. Can only casse parent+1 not parent+n
			//Can only chain with parent+ 1 
			super.enterStudentInfoChildrenClass();
			System.out.println("Your score at sport is " + score);
		}
	}
	
	public class SingleInheritance {

	    public static void main(String[] args) {
	        
	    	Marks marks = new Marks();
	        
	        
	        //method form children class itself + call super.parentmethod in it.
	        marks.enterStudentInfoChildrenClass();
	        
	        //inherit from parent class student
	        marks.printStudentInfo();
	        
	        //method from children class itself
	        marks.printStudentInfoChildrenClass();
	        
	    }

	}
