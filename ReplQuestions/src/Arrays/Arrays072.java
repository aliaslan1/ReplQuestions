package Arrays;

public class Arrays072 {
	//Write a program that creates an array with the following values{s, a, y,  b, n, c, t,  d, a, e, x} 
	//Print the values so the output should look like below
	
	//syntax

	public static void main(String[] args) {

		char[] array = { 's', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x' };

		for (int i = 0; i <= array.length - 1; i += 2) {

			System.out.print(array[i]);
		}

	}

}
