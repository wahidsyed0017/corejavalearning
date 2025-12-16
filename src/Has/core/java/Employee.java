package Has.core.java;

public class Employee {

	String name;
	int id;
	String mail;
	Company company;
	Manager manager;
	Address adress;

	public Employee(String n, int i, String m) {
		this.name = n;
		this.id = i;
		this.mail = m;

		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Company co = new Company("konic", "it", 67687, 900000l, 10000);
		System.out.println("Company name =" + co.name);
		System.out.println("Company code =" + co.code);
		System.out.println("Company deparment =" + co.deparment);
		System.out.println("Company mobile no =" + co.mobilenumber);

		Address ad = new Address("HArinath puram", 524001);
		System.out.println("street name =" + ad.streetname);
		System.out.println("pincode =" + ad.pincode);

		Manager ma = new Manager("Siddiq", 900000l, "siddiq0017@gmail.com");
		System.out.println("Manager name =" + ma.mail);
		System.out.println("mobile no = " + ma.mobilenumber);
		System.out.println("mail =" + ma.mail);

		Employee employee = new Employee("wahid", 609, "wahidsyed0017@gamil.com");
		System.out.println("name =" + employee.name);
		System.out.println("id =" + employee.id);
		System.out.println("mail =" + employee.mail);
	}

}
