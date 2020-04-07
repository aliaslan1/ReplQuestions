package ClassAndObject;

public class Main102 {

	String carColor;
	   int carYear;
	   String carModel;
	  public static void main(String[] args) {
	    Main102 mm=new Main102();
	    mm.carColor="Black";
	    mm.carYear=2019;
	    mm.carModel="BMW";
	    
	    Main102 mm1=new Main102();
	    mm1.carColor="White";
	    mm1.carYear=2018;
	    mm1.carModel="Toyota";
	System.out.println("Car color is "+mm.carColor+" and car year is "+mm.carYear+" and car name is "+mm.carModel);

	System.out.println("Car color is "+mm1.carColor+" and car year is "+mm1.carYear+" and car name is "+mm1.carModel);

	  }
	}

//		For you to do:
//		
//		Create a class named 'Main' with specific attributes.
//		Create two objects of that class in which you will be assigning the following values and then print them.
//		carColor='Black'
//		carYear=2019
//		carMake='BMW'
//		
//		carColor='White'
//		carYear=2018
//		carMake='Toyota'
//		
//		Expected Output:
//		Car color is Black and car year is 2019 and car model is BMW
//		Car color is White and car year is 2018 and car model is Toyota