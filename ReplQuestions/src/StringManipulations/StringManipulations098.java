package StringManipulations;

import java.util.Scanner;

public class StringManipulations098 {

//	For you to do:
//
//		Inputs:
//		String word;
//
//		Write a for loop that will print out every other letter in a String, starting with the first letter.  These letters should be printed all on one line with no space in between.
//
//		Sample input/outputs
//		In: hello
//		hlo
//
//		In: SSyynnttaaxxTTeecchhnnoollooggiieess
//		SyntaxTechnologies

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