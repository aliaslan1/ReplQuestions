package LogicalOperators;

import java.util.Scanner;

public class LogicalOperators037 {
	
//	For you to do:
//		Prompt user with a question: "Is it weekend?"
//		If it is not a weekend --> subject="Manual testing"
//		Otherwise --> subject="Java"
//	
	
	
	
	public static void main(String[] args) {
		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("Is it weekend?");
		
        boolean weekend=scan.nextBoolean();

		if (! weekend) {
			System.out.println("Today you will be learning Manual testing");
		
		} else
			System.out.println("Today you will be learning Java");
		
	}

}

	

