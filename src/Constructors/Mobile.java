package Constructors;

public class Mobile {
	// no Constructors
	int num;
	String Brand;
	Mobile () {
		
		num= 455;
		Brand = "ONEplus";
	}
	public static void main(String[] args) {
		Mobile mobile=new Mobile();
	//	no arg parametrized
		System.out.println(mobile.Brand);
		System.out.println(mobile.num);
		
	}

}
