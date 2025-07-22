package oop;

	class JavaStudent {
	
		//Instance class variables
		private int studentId;
		private String studentName;
		private int studentAge;
		
		
		//Below. there is 2 constructor.it's acceptable and known as "constructor overloading".
		
		
		//default constructor.No constructor() syntax. Reuse class name itself.
		public JavaStudent()
		{
			this.studentId = 0;
			this.studentName = "N/A";
			this.studentAge = 0;
		}
		
		//Parameterized constructor
		public JavaStudent(int id, String name, int age)
		{
			this.studentId = id;
			this.studentName = name;
			this.studentAge = age;
		}
		
		//Overloading can also be use to create extra constructor 
		public JavaStudent(int id,  int age , String name)
		{
			this.studentId = id;
			this.studentName = name;
			this.studentAge = age;
		}
		
		//Specific case call default constructor above. This is chaining constructor method.
		public JavaStudent (int id) {
			this(); // assign default constructor to instanced class 
		}
		
		
		void printDetailsOfStudentInstance() 
		{
			System.out.print(studentId  + " ");
			System.out.print(studentName + " ");
			System.out.println(studentAge);
		}
	}

public class Constructor {

	public static void main(String[] args) {
		
		JavaStudent student = new JavaStudent();
		JavaStudent	student2 = new JavaStudent(1, "Jotaro Kujo", 28);
		JavaStudent student3 = new JavaStudent(2, 20, "Jonathan Joestar");
		
		
		student.printDetailsOfStudentInstance();
		student2.printDetailsOfStudentInstance();
		student3.printDetailsOfStudentInstance();
	}

}
