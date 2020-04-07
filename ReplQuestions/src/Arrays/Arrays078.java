package Arrays;

import java.util.Scanner;

public class Arrays078 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] * 10);

		}

	}
}