package ForLoop;

import java.util.Scanner;

public class ForLoop063 {

//	Write a for loop that will print out a series of numbers
//	starting at 0 and ending at the x (value must be taken from a user), exclusive.

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		int x = inp.nextInt();
		for (int i = 0; i < x; i++) {
			System.out.print(i + " ");
		}
	}
}