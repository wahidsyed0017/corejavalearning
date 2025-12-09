package Overloading;

public class Mobile {
	
	void recharge (long x) {
		System.out.println("mobile number :" +  x );
	}
	void recharge2(long x, int y) {
		System.out.println("mobile number : " + x + "plan = "  + y);
	}
	void recharge3(long x , int y ,String s) {
		System.out.println("mobile number : " + x + "plan =" + y + "new coupon =" + s);
	}
	public static void main(String[] args) {
		Mobile mobile = new Mobile ();
		System.out.println("Recharge successful for " + mobile.recharge(9000000000L));
		
	
	}
	
}
