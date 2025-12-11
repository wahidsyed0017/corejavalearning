package Has.core.java;

public class Student {
	String name ;
	
	Addres addres;
	
	public Student( String n) {
		this.name =n;
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Student student = new Student("Ahmed");
		System.out.println("Name:" + student.name);
		Addres addres = new Addres("Hyderabad", 500001);
		System.out.println("city:" +addres.city);
		System.out.println("pincode :" + addres.pincode);
		
	}

}
