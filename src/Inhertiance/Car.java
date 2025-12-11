package Inhertiance;

public class Car extends Vehicle  {
	void speed () {
		System.out.println(120);
	}
public static void main(String[] args) {
	Car car = new Car ();
	car.brand();
	car.speed();
	
}
}
