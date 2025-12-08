package Overloading;

public class ATM{
	void print(int x) {
		System.out.println("Withdraw :" +"₹" +x);
	} 
	void print (double x  ){
		System.out.println( "Withdraw :" +"₹"+x );
	}
	void print(int x,String t){
		System.out.println( "Withdraw :" + "₹"+ x +t);
		
		
	}
	public static void main(String[] args) {
		ATM over = new ATM();
		over.print(500);
		over.print(500.75);
		over.print(1000, "current");
		
		
	}

}
