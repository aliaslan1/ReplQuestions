package VariablesInJava;

public class Main117 {

//	For you to do:
//	declare 3 instance variables to hold an integer, double and char values.
//	
//	Create 2 instances of the class and assign values to variables and the print them
//	
//	Expected Output:
//	10
//	10.23
//	a
//	100
//	100.23
//	s

	int intValue;
	double doubleValue;
	char charValue;

	public static void main(String[] args) {

		Main117 mm = new Main117();
		mm.intValue = 10;
		mm.doubleValue = 10.23;
		mm.charValue = 'a';
		System.out.println(mm.intValue);
		System.out.println(mm.doubleValue);
		System.out.println(mm.charValue);

		Main117 mm1 = new Main117();
		mm1.intValue = 100;
		mm1.doubleValue = 100.23;
		mm1.charValue = 's';
		System.out.println(mm1.intValue);
		System.out.println(mm1.doubleValue);
		System.out.println(mm1.charValue);
	}
}
