package Methods;

public class Method5 {
public boolean age(int a) {
	
//	/return type with parameters
	
	if (a>=18) {
		System.out.println("eligble");
		return true;
	}else {
		System.out.println("not eligble");
		return false ;
		
	}
}
public static void main(String[] args, String age) {
	
	Method5 method5 =new Method5();
	method5.age(12);
	

	System.out.println("age=  " + age);
	
}
}