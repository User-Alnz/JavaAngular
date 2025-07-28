package Polymorphism;

	/*
	 *  Encapsulation — "Hiding the internal state and requiring all interaction to be performed through an object's methods.
	 *  
	 *  More used to protect data form outside and packing logic and data together. 
	 *  Usually more focus on centralizing code to do one thing and properly.
	 *  
	 *  Think it like a piece of code, which focus on same main field of action or core methods and same field of protected data.
	 *  
	 *  problem is solved at implementation level when abstraction at design level.
	 *  
	 *  /!\ Encapsulation is a process of binding data and methods together in a single unit, providing controlled access to data.
	 * */


	//Java program to demonstrate encapsulation
	
	class Encapsulate {
	
	 // private variables declared
	 // these can only be accessed by
	 // public methods of class
	 private String geekName;
	 private int geekRoll;
	 private int geekAge;
	
	 // get method for age to access
	 // private variable geekAge
	 public int getAge() { return geekAge; }
	
	 // get method for name to access
	 // private variable geekName
	 public String getName() { return geekName; }
	
	 // get method for roll to access
	 // private variable geekRoll
	 public int getRoll() { return geekRoll; }
	
	 // set method for age to access
	 // private variable geekage
	 public void setAge(int newAge) { geekAge = newAge; }
	
	 // set method for name to access
	 // private variable geekName
	 public void setName(String newName)
	 {
	     geekName = newName;
	 }
	
	 // set method for roll to access
	 // private variable geekRoll
	 public void setRoll(int newRoll) { geekRoll = newRoll; }
	}
	
	//Class to access variables
	//of the class Encapsulate

	public class Encapsulation {
	
		public static void main(String[] args) {
		     Encapsulate obj = new Encapsulate();
	
		     // setting values of the variables
		     obj.setName("Harsh");
		     obj.setAge(19);
		     obj.setRoll(51);
	
		     // Displaying values of the variables
		     System.out.println("Geek's name: " + obj.getName());
		     System.out.println("Geek's age: " + obj.getAge());
		     System.out.println("Geek's roll: " + obj.getRoll());
	
		     // Direct access of geekRoll is not possible
		     // due to encapsulation
		     // System.out.println("Geek's roll: " +obj.geekRoll); 
		   /* over here if geekName was declared public then it would have been displayed. 
		   Since it has been declared private it cannot be accessed without getter and setter methods.
		   */
	
		}
	
	}
