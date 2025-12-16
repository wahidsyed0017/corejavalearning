package Abstract;

import java.security.DomainCombiner;

public class Dog extends Animall {

	@Override
	void sound() {
		System.out.println("dog is = braking");
	}
		 void sleep () {
		System.out.println("dog is = sleeping");	 
		 }	 
		
	
	
public static void main(String[] args) {
	Dog d = new Dog ();	
	d.sound();
	d.sleep();
	// Dog is a class  d is a refenceal variable new is a key word Dog is a constructor
}
}
