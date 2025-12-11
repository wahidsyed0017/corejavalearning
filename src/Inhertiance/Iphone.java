package Inhertiance;

public class Iphone extends Mobile {
	void feauters  () {
		System.out.println("i phone has special feauters");
	}
public static void main(String[] args) {
	Mobile mobile = new Mobile ();
	Iphone iphone = new Iphone() ;
	mobile.feauters();
	iphone.feauters();
}
}
