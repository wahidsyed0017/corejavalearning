package loops;

import java.util.Scanner;

public class Results {

	    public static void main(String[] args) {
	    	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter marks");
    int marks=sc.nextInt();
	        

	        if (marks >= 35) {   // First condition → Pass
	            if (marks >= 75) {   // Second condition → Distinction
	                System.out.println("pass with grade A "); 
	                
	               
	            } else {
	                System.out.println("pass");
	            }
	        } else {
	            System.out.println("Fail");
	            sc.close();
	        }
	    }
	}

