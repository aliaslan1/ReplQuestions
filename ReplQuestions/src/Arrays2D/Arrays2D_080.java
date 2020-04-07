package Arrays2D;

public class Arrays2D_080 {
	
	//Write a program to double the values of every element in the array and print it out.


	public static void main(String[] args) {

		double[][] a = { { 1.4, 2.0, 3.3, 2 }, { 4, 1.5, 6.1, 1 }, { 1.2, 3.1, 4, 1.6 } };

		// prints array

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] * 2 + " ");
			}
			System.out.println();
		}
	}

}