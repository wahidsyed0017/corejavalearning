package switchh;

import java.util.Scanner;

public class Atmmenue {
	public static void main(String[] args, Object option) {
		
		Scanner sc = new Scanner(System.in);
		
		
	System.out.println("Enter 1--6 : ");
		int option1 =sc.nextInt();
		switch (option1) {
		
				
		case 1:
			System.out.println("Enter account number");
			break;
		case 2:
			System.out.println("withdraw");
			break;
		case 3:
			System.out.println("Balance check");
			break;
		case 4:
			System.out.println("Mini statment");
			break;
		case 5:
			System.out.println("eneter pin");
			break;
		case 6:
			System.out.println("exit  ;    THANKYOU");
			break;
			
			default:
			System.out.println("login faile");
			
			
			sc.close();
		
		
		
		
		
		
		
	}

}

}