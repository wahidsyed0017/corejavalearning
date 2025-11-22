package operators;

import java.util.Scanner;

public class loginchecking {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

        String correctusername = "wahid0017";
        String correctpasscode = "wahid786";

        System.out.println("enter user name :");
        String username = sc.nextLine();

        System.out.println("enter passcode :");
        String passcode = sc.nextLine();

        if (username.equals(correctusername) && passcode.equals(correctpasscode)) {
            System.out.println("login success");
        } else {
            System.out.println("login fail");
            sc.close();
        }
    }
}
	
	

		



