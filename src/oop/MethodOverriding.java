package oop;

	//https://www.geeksforgeeks.org/java/overriding-in-java/
	class Animal
	{
		String name;
		int age;
		
		public Animal(String name, int age)
		{
			this.name = name;
			this.age = age;
		}
		
		public void print() 
		{
			System.out.println("name is " + name + "\n" + "its age is " + age);
		}
		
	}
	
	class Cat extends Animal
	{
		String race;
		String gender;
		
		public Cat(String name, int age, String race, String gender) 
		{
			super(name, age); //chain constructor from Parent class
			this.race = race;
			this.gender = gender;
		}
		
		public void print() // this overrides print Parent class
		{
			super.print(); //call parent class method to run it.
			System.out.println("its race is " + name + "\n" + "its gender is " + gender);
		}
	}


public class MethodOverriding {

	public static void main(String[] args) {
		
		Cat dooritoMybeloved = new Cat("Doorito", 5, "Persian", "Male");
		
		dooritoMybeloved.print();

	}

}
