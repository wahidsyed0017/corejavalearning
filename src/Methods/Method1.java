package Methods;

public class Method1 {
	// no retuen type method with no parameters and arguments 
//	void is a key word and purpose of void is it doesnt return anything
	
	public void add( ) {
//		piblic is access modifier void a no return type
//		add is method name 
		
		
		int a=1;
		int b=7;
		int r=5;
		int c= a+b+r;
		System.out.println("add = "  +c);
	}
		
	public static void main(String[]args) {
		
		Method1 method1 = new Method1();
//		object . refernce vatiable
		method1.add();
	}
		
	}


