package TypeCasting;

import java.util.Scanner;

public class TypeCasting021 {

	
//	Write a program that asks the user's age: "Enter your age  "
//	Then display it by adding 10 (i.e age + 10) in your final output. 
	
	public static void main( String [] args ){
	     
	     Scanner scan = new Scanner(System.in);
	     
	     System.out.println("Enter your age");
	     
	     int age= scan.nextInt();

	     System.out.println("Your age after 10 years is "+(age+10));
	     
	     
	   }
	   
	}
	
	
