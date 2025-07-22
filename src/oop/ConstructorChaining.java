package oop;

	// Concept here is constructor chaining.
	// Useful when use polymorphisme or children class to help keep code simple n organize. Avoid duplicates.
	class person {
		
		String name;
		
		public person()
		{
			System.out.println("person Class default constructor invoked");
			name = "user"; // could also be this.name to avoid confusion
		}
		
		public person(String name) 
		{
			System.out.println("person Class parametrized constructor invoked");
			this.name = name;
		}	
	}
	
	//Extend class does also rely on previous constructor and invoke them. 
	//And use default constructor as main constructor class of instance.
	class Employee extends person {
		
		String designation;
		
		public Employee() {
			System.out.println("Employee Class default constructor invoked");
			designation = "Manager";	
		}
		
		public Employee(String designation) {
			
			super("String name");// IMP !. use to call parametrized constructor  => public person(String name) 
			//otherwise use default constructor from parent class model 
			
			
			System.out.println("Employee Class parametrized constructor invoked");
			this.designation = designation;	
		}
		
	}


public class ConstructorChaining {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		Employee employee1 = new Employee("John Doe");

	}

}
