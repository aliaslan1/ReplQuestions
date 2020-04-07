package NestedIfScanner;

import java.util.Scanner;

public class NestedIfScanner033 {
	
//	 For you to do:
//
//		 Ask the user to enter any number
//		 if a user enters a number and it is even, print "Value is even", otherwise print "Value is odd"
//		 If the number if even then check if it is greater than 1000 or not.
//		 If the number is greater than 1000, then print "Even value is large", else print "Even value is just right". 
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number ");
		int num = scan.nextInt();

		if (num % 2 == 1) {
			System.out.println("Value is odd");

		} else if (num >= 1002) {
			System.out.println("Value is even");
			System.out.println("Even value is large");

		} else {
			System.out.println("Value is even");
			System.out.println("Even value is just right");

		}
	}

}

