package ForLoop;

import java.util.Scanner;

public class ForLoop064 {

//	Write a for loop that will print out a series of numbers 
//	starting at 0 and ending at the doubled value of end
//	(value must be taken from a user), exclusive.
//
//	Each number should be on the same line, separated by a space. 

	
	
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
	    System.out.print("Int:");
	    
		int end = inp.nextInt();

		for (int i = 0; i <end+end; i++) {
			System.out.print(i + " ");
			
		}System.out.println("-----------------2nd way----------------");
		
		Scanner inp1 = new Scanner(System.in);
	    System.out.print("Int:");
	    int end1 = inp.nextInt();
	    
	    if(end1>0) {
	      for(int i=0;i<end1*2;i++){
	          System.out.print(i+ " ");
	      }
	    }
	  }
	}