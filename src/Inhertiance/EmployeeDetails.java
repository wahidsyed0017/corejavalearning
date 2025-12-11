package Inhertiance;
class Manager{ 
//	parent class 
	void Department(String Department) {
		System.out.println("Department :"+ Department);
	}
	
}
class Employee extends Manager{
//	child class
	void setDetails(String name,int Salary) {
		System.out.println("Name :"+name);
		System.out.println("Salary :"+Salary);
	}

}

public class EmployeeDetails {
	public static void main(String[] args) {
		
	
	Employee emp = new Employee();
	emp.Department("IT");
	emp.setDetails("Wahid", 50000);

}
}
