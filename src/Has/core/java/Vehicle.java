package Has.core.java;

public class Vehicle {

	String s;

	String engine;

	public Vehicle(String e) {
		this.engine = e;
	}

	public static void main(String[] args) {
		Vehicle v = new Vehicle("started");
		System.out.println("vehicle is " + v.engine);
		Engine e = new Engine("running");
		System.out.println("Engine is " + e.r);
	}

}
