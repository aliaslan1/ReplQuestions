package ForLoop;

public class ForLoop055 {

//	Create a for loop that prints out even numbers from 10 to 0
//	Must not include the number 0 in the output

	public static void main(String[] args) {

		for (int i = 10; i > 0; i--) {

			System.out.println(i);

			i -= 1;
		}
		System.out.println("------------second way---------------");
		

		int a = 10;
		for (int i = 10; i > 0; i -= 2)
			System.out.println(i);
	}

}
