package loops;

import java.util.Scanner;

public class Switch {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter option (1-4)");
		
		int option = sc.nextInt();
		
		
		switch(option) {
		
		
		case 1:
			
			System.out.println("data packed selected");
			
		case 2:
			System.out.println("SMS pack Selected");
			
		case 3:
			System.out.println("Talked time selected");
			
		case 4:
			System.out.println("exit");
			
			
			
			default :
			System.out.println("Invalid option");
			
			sc.close();
			
			
			
		}
		
		
		
		
	}

}
