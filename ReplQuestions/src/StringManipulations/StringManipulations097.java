package StringManipulations;

import java.util.Scanner;

public class StringManipulations097 {

	// Write code that will take in a String input and check to see if it is a
	// palindrome or not.

	// A palindrome means that the characters are the same forwards and backwards,
	// ignoring spaces.

	// Examples of palindromes:
	// .racecar
	// .was it a car or a cat I saw
	// .never odd or even
	// .rats live on no evil star

	// Your check should be case insensitive too. For example, "Bob" is a
	// palindrome, despite the first B being capitalized.

	// Your program will print out "true" if it's a palindrome and "false" if not.

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("In:");
		String entry = input.nextLine();
		String entryLetters = entry.replace(" ", "").toUpperCase();
		int a = entryLetters.length();
		int counter = 0;
		char[] letters = new char[a];
		for (int i = 0; i < a; i++) {
			letters[i] = entryLetters.charAt(i); // passing String to an array
		}
		for (int j = 0; j < a; j++) {
			if (letters[j] == letters[a - 1 - j]) {
				counter = counter + 1;
			}
		}
		if (counter == a) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}