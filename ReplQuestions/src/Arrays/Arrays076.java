package Arrays;

import java.util.Scanner;

public class Arrays076 {

//		Write a program that creates a String array with size 7. 
//		Ask the user to input Days of a week beginning with Sunday using Scanner class.
//		Add these inputs to your array and then print all values from that array

//		Example:
//			Please enter day 1 of the week
//			Sunday
//			Please enter day 2 of the week
//			Monday
//			Please enter day 3 of the week
//			Tuesday etc

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String[] a = new String[7];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Please enter day " + (i + 1) + " of the week");
			a[i] = userInput.next();
		}
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i]);
		}
	}
}
