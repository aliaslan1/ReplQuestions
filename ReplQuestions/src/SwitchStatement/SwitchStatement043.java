package SwitchStatement;

import java.util.Scanner;

public class SwitchStatement043 {

//	For you to do:
//
//		Write a program to input number "Input a number between 1-12" and when you input a number it should display the month using Scanner and Switch statement.
//		case: 1 will display January
//		case: 12 will display December
//		Anything outside of 12 will display "Invalid"
	
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Input a number between 1-12");
		int month = scan.nextInt();

		String monthString;
		if (month == 1) {
			monthString = "January";
		} else if (month == 2) {
			monthString = "February";
		} else if (month == 3) {
			monthString = "March";
		} else if (month == 4) {
			monthString = "April";
		} else if (month == 5) {
			monthString = "May";
		} else if (month == 6) {
			monthString = "June";
		} else if (month == 7) {
			monthString = "July";
		} else if (month == 8) {
			monthString = "August";
		} else if (month == 9) {
			monthString = "September";
		} else if (month == 10) {
			monthString = "October";
		} else if (month == 11) {
			monthString = "November";
		} else if (month == 12) {
			monthString = "December";
		} else {
			monthString = "Invalid";
		}

		System.out.println(monthString);

	}

}

