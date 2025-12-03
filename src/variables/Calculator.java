package variables;

import java.util.Scanner;

public class Calculator {
	Scanner sc = new  Scanner(System.in);
	int num1;
	int num2;
	
public void input() {
	System.out.println("Enter A value");
	num1=sc.nextInt();
	System.out.println("Enter B value");
	num2=sc.nextInt();
}
	public int add() {
		return num1 = num2;
		
	}
	public static void main(String[] args) {
		Calculator calculator =new Calculator();
		calculator.input();
		int sum = calculator.add();
		System.out.println("result  ="  + sum);
		
		
	}
}




