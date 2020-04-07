package VariablesInJava;

public class Main118 {

//	For you to do:
//	
//	Declare 3 instance variables to hold:
//	name of the country
//	capital
//	population size
//	
//	Create a method to display values of instance variables
//	
//	Create 2 Object, assign values to instance variables, execute method display;
//	
//	Expected Output:
//	The capital of USA is Washington DC and population is 330000000
//	The capital of Kazakhstan is Astana and population is 18500000

	String name, capital;
	int population;
	
	void displayDetails() {
		System.out.println("The capital of "+name+" is "+capital+" and population is "+population);
	}
	
	public static void main(String[] args) {
		
		Main118 country1=new Main118();
		country1.name="USA";
		country1.capital="Washington DC";
		country1.population=330000000;
		country1.displayDetails();
		
		Main118 country2=new Main118();
		country2.name="Kazakhstan";
		country2.capital="Astana";
		country2.population=18500000;
		country2.displayDetails();
	}
}

