package ForLoop;

import java.util.Scanner;

public class ForLoop060 {

//	Write a program that prints the count down from 10 up to 1 and then says "Happy New Year!".

	public static void main(String[] args) {

		int total = 10;

		for (int i = 10; i >= 1; i--) {

			total += i;
			System.out.println(i);
		}

		System.out.println("Happy New Year!");
		
		

		System.out.println("------------------2nd way-------------");

		for (int i = 10; i >= 1; i--) {

			System.out.println(i);
		}

		System.out.println("Happy New Year!");

	}
}
