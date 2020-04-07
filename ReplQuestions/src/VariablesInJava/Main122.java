package VariablesInJava;

public class Main122 {

	static int count;

	public static void main(String[] args) {
		Main122 obj1 = new Main122();
		count++;
		Main122 obj2 = new Main122();
		count++;
		Main122 obj3 = new Main122();
		count++;

		System.out.println(count);

//			For you to do:
//			Create a variable that will hold the count of all instances of the Main class
//
//			Create 3 Object of the class and print value of the count variable;
//
//			Expected Output:
//				3

	}
}
