package oop;

	//Method overloading in Java is also known as Compile-time Polymorphism, 
	//https://www.geeksforgeeks.org/java/method-overloading-in-java/
	//http://geeksforgeeks.org/java/different-ways-method-overloading-java/
	class Calculation
	{
	
		public static int sum ( int a, int b)
		{
			return a + b;
		}
		
		//Overloading parameters
		public static int sum ( int a, int b, int c)
		{
			return a + b + c;
		}
		
		//Chaining DataType args
		public static float sum ( float a, float b )
		{
			return a + b;
		}
		
		public static double sum ( double a, double b )
		{
			return a + b;
		}
		
		//Could also change parameter order. read doc 
	}
	
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
