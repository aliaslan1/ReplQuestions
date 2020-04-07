package com.review01;

public class Task {
	public static void main(String[] args) {
		/*
		 * Create two integer variables, and name them as you want Create one variable
		 * which stores the sum of two numbers Create one variable which stores the
		 * multiplication of two numbers Create one variable which stores the division
		 * of two numbers Create one variable which stores the substruction of two
		 * numbers And then print all the variable
		 */

		int number1 = 10;
		int number2 = 20;

		int sum = number1 + number2;
		int substraction = number1 -number2;
		int multiplication =  number1 * number2;
		int division = number1 / number2;
		

		System.out.println("number1 is " + number1);
		System.out.println("number2 is " + number2);
		System.out.println("The sum is not " + number1 + number2);
		System.out.println("The sum is " + (number1 + number2));
		System.out.println("number1 is " + sum);
		
		
		System.out.println();// skips the line. It is invisible
		System.out.println("The sum is" + sum);
		System.out.println("The substraction is " + substraction);
		System.out.println("The multiplication is " + multiplication);
		
		System.out.println("------------------");//skips the line but make the visible line
		
		int result = 29/10;// 2.9
		
		System.out.println("The division is " + result);
		
		int mod =29 % 10;
        System.out.println("The remainder of division is "+mod);
        
        double doubleResult = 29 / 10;
        System.out.println("The doubleResult of division is " +doubleResult);
        
        double doubleResult2 = 29.0 / 10.0;
        System.out.println("The doubleResult2 of division is " +doubleResult2);
        
       
        System.out.println(" ---Type Convertion---");
        
        int intNumber =25;
        double doubleNumber = intNumber;
        System.out.println("The doubleResult of division is " +doubleNumber);
        

	}

}


