package WhileLoop;

public class WhileLoop048 {

//	Using while loops that print out even numbers from 1 to 13

	public static void main(String[] args) {

		int num = 1;

		while (num < 13) {

			if (num % 2 == 0) {
				System.out.println(num);

			}
			num = num + 1;
		}

	}
}