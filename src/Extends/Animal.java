package Extends;

public class Animal {
	
	void  breathing () {
	
	}
		
	}
 public class Dog extends Animal {
	void breathing () {
		System.out.println( "Dog is breathing");
	}
	
	
	
	void sound () {
		System.out.println("Dog is braking ");
	}
}
public class Animaldetails extends Dog {
public static void main(String[] args) {
	Dog d = new Dog ();
	d.breathing();
	d.sound();
}

}


				
	



	

