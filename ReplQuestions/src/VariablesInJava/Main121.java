package VariablesInJava;

public class Main121 {

static int number;
	
	public static void main(String[] args) {
		
		number=100;
		
		Main121 mm=new Main121();
		mm.number=200;
		
		System.out.println(mm.number);
		System.out.println(number);
		
//		
//		For you to do:
//		
//		Declare a static variable number that will hold an integer value:
//		
//		Access number from the main method and assign value to it.
//		Create an Object of the class, access number in a nonstatic way and assing value of 200.
//		
//		Print out number using class name and using instance
//		
//		Expected Output:
//		200
//		200
	}
}

