package oop;

import java.util.Scanner;

	class Person{
		
		private String name;
		private String firstName;
		
		//Good practice to use setter or getter to read or write date from private instance value of class
		
		//access read only private attribute class
		public String getFirstName() {
			return firstName;
		}
		
		//access write 
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		public String getName() {
			return name;
		}
				
		public void setName(String name) {
			this.name = name;
		}
	}

	public class GetterAndSetter {
	
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			Person userPerson = new Person();
			
			System.out.println("Your actual name is " + userPerson.getName());
			System.out.println("Enter a new name : ");
			
			String name = scanner.next();
			userPerson.setName(name);
			
			
			System.out.println("Your new name is : ");
			System.out.println(userPerson.getName());
			
			scanner.close();
			
		}
	
	}
