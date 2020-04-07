package LogicalOperators;

import java.util.Scanner;

public class LogicalOperators035 {

//	For you to do:
//		Create a program that prompt user with question:  "Do you need a loan?"
//		If the result is true then prompt user with question: "What is your credit score?". Otherwise eligibility is "Unknown"
//		Based on the score define users eligibility:
//		if score is below  600 --> eligibility = "Not eligible"
//		if score is between 600 and 700 inclusive -->  eligibility = "Maybe eligible"
//		if score is between 701 and 800 inclusive -->  eligibility = "Eligible"
//		if score is higher than any other previous values --> eligibility = "Definitely eligible" . 

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String eligibility;
		System.out.println("Do you need a loan?");

		boolean result = scan.nextBoolean();

		if (result) {
			System.out.println("What is your credit score?");
			int score = scan.nextInt();
			if (score < 600) {
				eligibility = "Not Eligible";
			} else if (score >= 600 && score <= 700) {
				eligibility = "Maybe Eligible";
			} else if (score > 700 && score <= 800) {
				eligibility = "Eligible";
			} else {
				eligibility = "Definitely eligible";
			}
			System.out.println("The eligibility is " + eligibility);
		} else
			System.out.println("The eligibility is unknown");
	}
}
