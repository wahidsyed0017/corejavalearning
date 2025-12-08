package Overloading;

public class Ola {
	void print  (String a,String b) {
		System.out.println("Book ride  : " +a + " " + b);
		
		
	}
	void print (String a, String b, String c) {
		System.out.println("Book ride :"  + a + " " + b + " " + c);
		
	}
	void print (String a, String b, int d) {
		System.out.println("Book ride : " + a+ " "+ b + " " +d);
		
	}
	
	
	
	
public static void main(String[] args) {
	Ola ola = new Ola();
	ola.print("Ameerpet", "Hitechcity");
	ola.print("Ameerpet", "Hitechcity", "SUV");
	ola.print("Ameerpet", "Hitechcity", 3);
	
}
}
