package basics;

public class StringMethods {

	public static void main(String[] args) 
	{
		
		//String literal 
		String str1 = "Hello";
		
		//String Object // really specific case almost never
		String str2 = new String("World"); // diff cause creating unique instance object in heap. 
		
		String str3 = str1 + " "+ str2;
		 
		System.out.print(str3);
	}

}
