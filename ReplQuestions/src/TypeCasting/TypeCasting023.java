package TypeCasting;

import java.util.Scanner;

public class TypeCasting023 {

//	    For you to do:
//		Create a program that will ask a user to input boolean value "Input the boolean value"
//		If the input is true or false, then the output should look like below: 
//
//		Example Output: 
//		Input the boolean value
//		The value is true
//
//		Example Output: 
//		Input the boolean value
//		The value is false

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean val = scan.nextBoolean();
		System.out.println("Input the boolean value");

		if (val) {
			System.out.println("The value is " + val);
		} else {
			System.out.println("The value is " + val);
		}

	}

}
