package SwitchStatement;

import java.util.Scanner;

public class SwitchStatement045 {
		
//	For you to do:
//		Ask the user to enter any number from 1-7.
//		Based on the number define the day of the week	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
			 
				System.out.println("Input a number between 1-7 ");
			
				int number=scan.nextInt();
				
				String today= scan.nextLine();
				
				switch (number) {	

				case 1:
					today = "Monday";
					break;
				case 2:
					today = "Tuesday";
					break;
				case 3:
					today = "Wednesday";
					break;
				case 4:
					today = "Thursday";
					break;
				case 5:
					today = "Friday";
					break;
				case 6:
					today = "Saturday";
					break;
				case 7:
					today = "Sunday";
					break;
				default:
					today = "Invalid";
				}

				System.out.println(today);
			}
		}
				
				