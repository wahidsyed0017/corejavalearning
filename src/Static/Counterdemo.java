package Static;

public class Counterdemo {
	
	static int count = 0;
	Counterdemo()  {
		count++;
	}
	public static void main(String[] args) {
		new Counterdemo();
		new Counterdemo();
		new Counterdemo();
		
		System.out.println("final price ="   +  count) ;
		}
	}
	
	
	


