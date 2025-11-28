

package nrt.konic.objectandclass;

public class objectcar {
	
	
	public static void main(String[] args) {
		
		Car car=new Car();
		
//		Car is a class  and car is a varibale 
//		new is a keyword   and Car();is a constructor and it is must be same as class name 
		
		
		car.Companyname = "tata";
		car.Fueltype =("Petrol");
	    car.Model=("Sedan");   
		car.Seating= ("6");
		car.BHP=("1000");
		car.CC=("1500");
		car.Trouque=("1890");
		
		car.start();						
		
// by creating object class we can access other class properties and behaviours in this object class
		
	
	}
}
