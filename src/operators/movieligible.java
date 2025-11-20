package operators;

import java.util.Scanner;

public class movieligible {

	
	public static void main(String[] args) {
		Scanner sc =new  Scanner(System.in);
		
		System.out.println("Enter age :");
		int age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("allowed");
		}else {
			System.out.println("not allowed");
		}
		
		
	}
	
	
	
	
	
}
