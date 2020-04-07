package Arrays2D;

public class Arrays2D_081 {
	
	//Write a program that prints the highest value in the array.


	public static void main(String[] args) {
		
		int[][] numbers = { { 5, 2, 3, 7 }, { 1, 5, 1, 1 }, { 8, 3, 1, 2 } };
//should be 8

		int maxValue = numbers[0][0];
		for (int j = 0; j < numbers.length; j++) {
			for (int i = 0; i < numbers[j].length; i++) {
				if (numbers[j][i] > maxValue) {
					maxValue = numbers[j][i];
				}
			}
		}
		System.out.println(maxValue);
	}
}