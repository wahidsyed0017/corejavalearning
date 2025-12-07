package Static;

public class Employee {
	
	static String name = "konic";
	int Employeeid = 8989;
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("company name ="  + name );
		Employee employee = new Employee();
		System.out.println("employee id "  + employee.Employeeid);
		
	}
}
