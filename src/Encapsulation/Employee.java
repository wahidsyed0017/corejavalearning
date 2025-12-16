package Encapsulation;

class Employeedetails {
	private void name() {
		
	}int salary ;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}




 public class Employee {
	 public static void main(String[] args) {
		Employeedetails  employee = new Employeedetails ();
		employee.salary = 45000;
		employee.getSalary();
		System.out.println("Employee salary" + employee.salary);
	}
	 
 }
 
