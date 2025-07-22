package oop;

	/******
	 * 
	 * Does exist other method to initiate Singleton pattern. 
	 * 
	 * => Eager Initialization, 
	 * => Lazy Initialization (Basic),
	 * => Lazy Initialization (Synchronized), 
	 * => Double-Checked Locking, Bill Pugh Singleton
	 * 
	 * 		For each way it depends your need. Foster "Bill Pugh" or "Double-Checked Locking".
	 * 
	 *  dig deeper => 
	 *  https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples
	 *  https://www.geeksforgeeks.org/java/java-singleton-design-pattern-practices-examples
	 * 
	 * ****/

	class SingletonExample 
	{
		//static, so belong to class, not its objects.
		//Under the hood mean only one reference in memory.
		static SingletonExample instance = null;
		
		//this attribute is gonna be shared unique to instance of class through one single instance of class shared by callers.
		public int number = 10;
		
		//Constructor. Can't be access outside class
		private SingletonExample()
		{
			System.out.println("SingletonExample instance created");
		}
		
		//Ensure share same instance Object and instances variables from same reference object.
		//IMP Mean => there is not multiple instance of class but only one instance of class. Access is enforced here.
		static public SingletonExample getInstance() 
		{	
			if(instance == null)
				instance = new SingletonExample(); //only run one when instancing first time.
			
			return instance;
		}
		
	}
	
	
	
public class SingletonPattern {
	

	public static void main(String[] args) {
		
		SingletonExample numberA = SingletonExample.getInstance();
		SingletonExample numberB = SingletonExample.getInstance();
		
		System.out.println("number A is : " + numberA.number);
		System.out.println("number A is : " + numberB.number);
		
		numberA.number += 10;
		System.out.println("Add + 10 to number A ");
		System.out.println("number B is now as A cause sharing same instance ref. B = " + numberB.number);
		
	}

}
