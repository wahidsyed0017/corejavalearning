package operators;

import java.util.Scanner;

public class Billing {
	
	public static void main(String[] args) {
	
		Scanner Sc =new Scanner(System.in);
		
		
		System.out.println("Enter the item price");
		int a=Sc.nextInt();
		
		System.out.println("tax");
		float b=Sc.nextFloat();
		
		
		System.err.println("final bill" +  (a+b));	}

}
