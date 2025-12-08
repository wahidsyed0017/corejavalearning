package Overloading;

public class Swiggy {
	
void print (String b) {
	System.out.println("orderplaced : " + b);
	
}
void print (String b , String string) {
	System.out.println("orderplaced : " + b + " " + string );
	
}
void print (String b, int a, String t) {
	System.out.println("orderplaced :  " + b + " " + a + " " + t);
	
}
public static void main(String[] args) {
	Swiggy swiggy = new Swiggy();
	swiggy.print("Briyani");
	swiggy.print("Briyani", "(2 qty)");
	swiggy.print("Briyani", 2, "(2 qty ,spicy)");
}

}
