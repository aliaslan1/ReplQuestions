package Arrays;

public class Arrays073 {

	//Write a program that creates an array of strings with the following 
	//values{"This", "is", "array", "of", "strings"} and prints all values in one line.
	public static void main(String[] args) {

		String[] array = { "This", "is", "array", "of", "strings" };

		for (int i = 0; i <= array.length - 1; i++) {

			System.out.print(array[i] + " ");
		}

	}

}
