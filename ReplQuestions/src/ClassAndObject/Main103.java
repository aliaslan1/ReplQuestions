package ClassAndObject;

public class Main103 {

	String breed, name, color;

	public static void main(String[] args) {
		Main103 dog1 = new Main103();
		Main103 dog2 = new Main103();
		Main103 dog3 = new Main103();

		dog1.breed="Husky";
		dog1.name="Hatiko";
		dog1.color="Grey";
		
		dog2.breed="Bulldog";
		dog2.name="Bobby";
		dog2.color="White";
		
		dog3.breed="Labrador";
		dog3.name="Sharik";
		dog3.color="Black";
		
		dog1.bark();
		dog1.run();
		dog1.play();
		
		dog2.bark();
		dog2.run();
		dog2.play();
		
		dog3.bark();
		dog3.run();
		dog3.play();
	}
	void bark() {
		System.out.println(breed + " can bark");
	}

	void run() {
		System.out.println(breed + " can run");
	}

	void play() {
		System.out.println(breed + " can play");
	}
}

//	Create a Class Main 
//	
//	In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().
//	Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.
//	
//	The output of the program should be as following:
//	 
//	Husky can bark
//	Husky can run
//	Husky can play
//	Bulldog can bark
//	Bulldog can run
//	Bulldog can play
//	Labrador can bark
//	Labrador can run
//	Labrador can play

