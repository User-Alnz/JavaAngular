package basics;

public class Array {

	public static void main(String[] args) {
		
		int index = 0;
		int[] array = new int[] {1, 5, 4 ,5, 9}; 
		// or int [] array = {5, 5, 6 ,9}

		array[0] = 5;
		
		while (index<array.length) 
		{
			System.out.println(array[index]);
			index++;
		}
		
	}

}
