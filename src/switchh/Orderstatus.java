package switchh;

import java.util.Scanner;

public class Orderstatus {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number :");
		int flipkart=sc.nextInt();
		
		switch (flipkart) {
		
		case 1:
			System.out.println("oder success");
			break;
		case 2:
			System.out.println("packing completed");
			break;
		case 3:
			System.out.println("shipped");
			break;
		case 4:
		System.out.println("out for delivery");
		break;
		case 5:
			System.out.println("delivered");
			break;
			
			default:
				System.out.println("error");
				break;
			
			
			
			
			
		}
		
	}

}
