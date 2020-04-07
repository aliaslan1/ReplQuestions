package StringManipulations;

public class StringManipulations091 {
	
//	Create a String given="I love Java classes at Syntax"
//			Retrieve 2 Strings from given String and print them 
//	
//	Expected Output:
//
//		classes at Syntax
//		I love Java

public static void main(String[] args) {
		
		String given = "I love Java classes at Syntax";
		String substr=given.substring(12);
		System.out.println(substr);
		
		substr=given.substring(0, 11);
		System.out.println(substr);

	}
}
	
	