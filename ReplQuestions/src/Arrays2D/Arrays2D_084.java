package Arrays2D;

public class Arrays2D_084 {
	
	//Write a program that prints the total number of elements that are negative AND odd


	public static void main(String[] args) {
		
		int[][] numbers = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };
		
//should print 3

		int countNegative = 0;
		for (int j = 0; j < numbers.length; j++) {
			for (int i = 0; i < numbers[j].length; i++) {
				if (numbers[j][i] < 0 && numbers[j][i] % 2 != 0) {
					countNegative = countNegative + i;
				}
			}
		}
		System.out.println(countNegative);
	}
}