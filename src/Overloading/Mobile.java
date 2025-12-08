package Overloading;

public class Mobile {
	

	
	void  print1 (int x ) {
		System.out.println("Recharge : " + x + " "+ "successful" );
		
	}
	
	void print2 (int x ) {
		System.out.println("Recharge : " + x  + "Successful");
		
	}
	void print3 (int x) {
		System.out.println("Recharge :" +  x + " " +  "NEW COUPON");
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("Recharge successfull for 7989721575");
		Mobile m = new Mobile();
		m.print1(299);
		m.print2(299);
		m.print3(299);
		
		
	}

}
