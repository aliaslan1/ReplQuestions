package TypeCasting;

import java.util.Scanner;

public class TypeCasting026 {
	
//   	For you to do: 
//		The variable "name" holds a String user input 
//		Write a conditional statement starting on line 9 that does the following:
//		If name is equal to "Chen", print "teacher"
//		For any other input, print "student"
	
	
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String name = inp.nextLine();

		if (name.equals("Chen")) {
			System.out.println("teacher");

		} else {
			System.out.println("student");
		}

	}
}

	
	
	


