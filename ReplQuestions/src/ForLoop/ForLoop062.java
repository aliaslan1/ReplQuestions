package ForLoop;

public class ForLoop062 {

	//	Using for loop Print 1 to 10 Numbers except 5 and 6

	
	public static void main(String[] args) {

		int [] numbers = {1,2,3,4,5,6,7,8,9,10};

	      for(int x : numbers ) {
	         if( x == 5 || x ==6 ) {
	            continue;
	         }
	         System.out.print( x );
	         System.out.print("\n");
	         
	      }
	         System.out.println("-------2nd way------");
	         
	         
	         for (int i = 1; i <= 10; i++) {
	 			if (i == 5 || i == 6) {
	 				continue;
	 			}
	 			System.out.println(i);
	 		}
	   }
	 }
	         
	         
	         
	