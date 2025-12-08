package Overloading;

public class Student {
	void print(String x) {
		System.out.println("Registered");
		
		
	}
	void print(String x,int y) {
		System.out.println("Registered :" + x +" " + y);
		
	}
	void print(String x,int y,String h) {
		System.out.println("Registered :" +y +" " + h);
		
		
	}
	
	
	public static void main(String[] args) {
		Student sc = new Student();
		sc.print("Rahul");
		sc.print("Rahul", 20);
		sc.print("Rahul", 20, "Hyderabad");
		
	}

}
