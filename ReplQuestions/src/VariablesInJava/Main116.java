package VariablesInJava;

public class Main116 {
	
//	For you to do:
//	
//	Declare 3 instance variables to hold: 
//	
//	year, school name and batch #
//	
//	Access variables from the main method and assign specific values to them
//	Print values of your variables in the following format:
//	
//	Expected Output:
//	I am a student of batch 6 studying at Syntax in the year of 2020

	int batch;
	  String schoolName;
	  int year;
	  
	  public static void main(String[] args) {
		  Main116 mm= new Main116();
	    mm.batch=6;
	    mm.schoolName="Syntax";
	    mm.year=2020;
	    System.out.println("I am a student of batch "+mm.batch+" studying at "+mm.schoolName+" in the year of "+mm.year);
	  }
	}

