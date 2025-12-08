package Overloading;

public class Mobile {
	

	
	void  print1 (long x ) {
		System.out.println("Recharge : " + x + " "+ "successful" );
		
	}
	
	void print2 (long x,String y ) {
		System.out.println("Recharge : " + x + y + "Successful");
		
	}
	void print3 (int x,String y) {
		System.out.println("Recharge :" +  x + y + " " +  "NEW COUPON");
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("Recharge successfull for 900000000");
		Mobile m = new Mobile();
		
		m.print1(299);
		m.print2(299, "successful");
		m.print3(299, "with coupon");
		
	}

}
