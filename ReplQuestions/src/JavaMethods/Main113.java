package JavaMethods;

public class Main113 {

	public int sumEvenToX(int x)	{
		 
		int sum=0;
		for(int i=1;i<=x;i++) {
			if(i%2==0) {
			sum+=i;
		  }
		}
		return sum ;
	}
	//		test case below (dont change):
			public static void main(String[] args){
				Main113 obj=new Main113();
				System.out.println(obj.sumEvenToX(5)); //6
				System.out.println(obj.sumEvenToX(8)); //20
			}
		}

//		Create a method with the following specs:  
//		
//		Returns:
//		an integer
//		Name:
//		sumEvenToX
//		Parameters:
//		an integer called "x"
//		Purpose:
//		calculate the sum of the EVEN integers from 1 to x (including x)
//		
//		Examples:
//		sumEvenToX(5) ==> 6
//		sumEvenToX(8) ==> 20
