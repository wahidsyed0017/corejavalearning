package Overloading;

public class Supermarket {
	
void Generatebill1(int x) {
	System.out.println( " Final bill :" + "₹ " + x);
}
void Generatebill2(int x) {
     System.out.println( " Final bill with discount :" + " " +"₹"+ x);
	
}
void Generatebill3(int x) {
	System.out.println("Final bill :" + "₹" + x);
}
public static void main(String[] args) {
	Supermarket bill = new Supermarket();
	bill.Generatebill1(1000);
	bill.Generatebill2(900);
	bill.Generatebill3(945);
}
}
