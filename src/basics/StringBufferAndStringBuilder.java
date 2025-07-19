package basics;

public class StringBufferAndStringBuilder {

	public static void main(String[] args) {
		
		
		
		//Both Method below are MUTABLE => Meaning change value from same memory adress. Pointing same memory adress but update size string.
		
		//✅ Better for multi-threaded (synchronized)
		StringBuffer buffer = new StringBuffer("Hello");
		System.out.println(buffer.capacity());
		
		buffer.append(" world"); //modifies buffer.
		
		System.out.println(buffer);

		//✅ Better for single-threaded (faster, not synchronized)
		StringBuilder build = new StringBuilder("Hello");
		System.out.println(build.capacity());
		
		build.append(" World"); // modifies build object
		
		System.out.println(build);
		
		
		// String is IMMUTABLE => Meaning value don't change in memory, only reference. Pointing to New String Object adress. And stored in heap within poolString
		String str = "Hello";
		str += " World"; // This not really add to string but create new string adress memory and point to it. Because immutable.
		//This create new String("Hello World");
		
		System.out.print(str);
	}

}
