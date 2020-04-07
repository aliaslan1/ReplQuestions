package ForLoop;

import java.util.Scanner;

public class ForLoop065 {

		
//		Write a for loop that will print out a series 
//		of numbers starting at one less than x and ending at 0.

	public static void main(String[] args) {
	    
	    Scanner inp = new Scanner(System.in);
			System.out.print("In:");
			int x = inp.nextInt();
			

			for (int i =x-1; i >=0; i--) {
				System.out.print(i+" ");
	    
	    
	  }
	}
	}