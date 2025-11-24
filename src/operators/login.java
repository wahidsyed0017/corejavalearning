package operators;

import java.util.Scanner;

public class login {

	
	

	public static void main(String[] args) {
		
		Scanner Sc =new Scanner(System.in);
		
		 
		 String correctusername = "wahid";
		 String correctpassword = "567";
		 
		 System.out.println("user name  ;  ");
		 String username =Sc.next();
		 
		 System.out.println("password");
		 String password =Sc.next();
		 
		 if(username.contains(correctpassword)  && password.contains(correctpassword));
		System.out.println("login successful");
	
		
		if (username.contentEquals(correctusername)   &&   password.contentEquals(correctpassword));
	
		
		
		
		System.out.println("fail");
	}
		
		
	}
	
	



	

