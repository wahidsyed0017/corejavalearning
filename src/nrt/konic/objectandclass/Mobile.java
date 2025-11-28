package nrt.konic.objectandclass;

public class Mobile {
//	properties
	
	String Brand;
	static String processor;
	String Model;
	static String Network;
	String Ram;
	static float size;
	int Rom;
	
	 public static void start() {
		 
	 
//		 * void is a non return type
//		 * start is a behaviour or method name
		 
		 
		 String brand = null;
		 System.out.println("Brand ;"  + brand);
		 System.out.println("Network ;" + Network);
		 System.out.println("size ; "  + size);
		 System.out.println("Processor ;" + processor);
		 
		    
	Mobile.start();	
	}
	 
	 
	 
	public static void main(String[] args) {
		
		
		Mobile mobile=new Mobile ();
		mobile.Brand= "Apple";
		mobile.Model= "IPHONE 16";
		mobile.Network = "5G";
		mobile.processor = "A18 bionic chip";
		mobile.Ram = "8GB";
		mobile.Rom = 128;
		mobile.size=6.1f;
		
		
	}
}
