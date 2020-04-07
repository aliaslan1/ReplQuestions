package ForLoop;

public class ForLoop056 {

//	Create a for loop that prints out even numbers from 2 to 14 using if condition
//	Must include the number 14 in the output 

	public static void main(String[] args) {

		int a = 14;

		for (int i = 2; i <= a; i++) {

			if (i % 2 == 0) {

				System.out.println(i);
			}

		}

	}

}
