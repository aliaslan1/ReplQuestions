package Arrays;

public class Arrays071 {
	
	//Write a program that creates an array of integers and stores the following values: 
	//45, 78, 12,  67, 55 and then prints all array values. 

	public static void main(String[] args) {

		int[] arr = { 45, 78, 12, 67, 55, 89, 23, 77, 88 };

		for (int i = 0; i < arr.length; i +=2) {

			System.out.print(arr[i] + " ");
		}
	}
}
