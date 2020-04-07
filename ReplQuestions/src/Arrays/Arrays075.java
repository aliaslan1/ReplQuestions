package Arrays;

public class Arrays075 {
	
	//Using the following array. 
	//{45, 78, 12,  67, 55, 89, 23, 77, 88}
	//Create a for loop to extract values from that array so your output looks as below:


	public static void main(String[] args) {

		int[] arr = { 45, 78, 12, 67, 55, 89, 23, 77, 88 };

		for (int i = 1; i < arr.length; i += 3) {

			System.out.print(arr[i] + " ");
		}

	}

}
