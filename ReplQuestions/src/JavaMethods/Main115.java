package JavaMethods;

public class Main115 {

	String censorLetter(String str, char c) {

		str = str.replace(c, '*');
		return str;
	}

	public static void main(String[] args) {

		Main115 obj = new Main115();
		System.out.println(obj.censorLetter("computer science", 'e')); // "comput*r sci*nc*"
		System.out.println(obj.censorLetter("trick or treat", 't')); // "*rick or *rea*"
	}
}
//		Write a method header with the following specs:    
//		
//		Returns:
//		a String
//		Name:
//		censorLetter
//		Parameters:
//		a String
//		a char
//		
//		Then complete the method by programming the following behavior
//		Replace all instances of given character with a "*" within the given String.
//		See below examples.
//		
//		Examples:
//		censorLetter("computer science",'e') ==> "comput*r sci*nc*"
//		censorLetter("trick or treat",'t') ==> "*rick or *rea*"