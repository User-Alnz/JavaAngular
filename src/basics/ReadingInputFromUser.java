package basics;

import java.util.Scanner;

public class ReadingInputFromUser {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter input : \n");
		
		String userInput = scanner.nextLine();
		
		System.out.print("Now enter digit : ");
		
		int number = scanner.nextInt();
		
		System.out.print("Enter  second random input : \n");
		char charFromInputString = scanner.next().charAt(0); 
		
		
		System.out.print("\nYour input is : " + userInput + "\n");
		System.out.print("Your digit is : " + number + "\n");
		System.out.print("First char of your last input is : " + charFromInputString);
		scanner.close();
	}
	
}
