package operators;

import java.util.Scanner;

public class Logincheck {
	
	public static void main(String[] args) {
		
		Scanner Sc=new Scanner(System.in);
		
		String correctusername= "wahid77";
		String correctpasscode= "7989";
		
		System.out.println("Enter username :");
		String username=Sc.nextLine();
		
		System.out.println("Enterpasscode");
		String passcode=Sc.nextLine();
		
			if(username.equals(correctusername) && passcode.equals(correctpasscode)) {
			System.out.println("loginsuccess");
		
	}else {
		System.out.println("loginfail");
		
		
		
	}

	}
}
