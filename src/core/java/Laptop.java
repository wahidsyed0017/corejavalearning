package core.java;

public class Laptop {
//	properties

	String name;
	String color;
	float Size;
	int price;

	public void processor() {
/*
 * 		public is a access modifier
 * void is a non return type
 * processro is a behaviour or method name
 */

		System.out.println("name  :" + name);
		System.out.println("color  :" + color);
		System.out.println("Size  :" + Size);
		System.out.println("Price  :   " + price);

	}
	public static void main(String[] args) {
		Laptop laptop=new Laptop();
		
//		class refernce variable =key word and  constructor
		
		laptop.color= ("black");
		laptop.name="HP";
		laptop.price=2300;
		laptop.Size=3.5f;
		
		
	laptop.processor();
		
		
	}

}
