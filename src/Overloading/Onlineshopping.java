package Overloading;

public class Onlineshopping {
	void print(int itemid) {
		System.out.println("product:" + itemid  + "add to cart");
	}
	void print (int itemid , int quality) {
		System.out.println("product :"  + itemid + "added with quality 3"); 
	}
	void print (String itemname) {
		System.out.println("item name : " + "added to cart");
	}
	
	
	public static void main(String[] args) {
		Onlineshopping online = new Onlineshopping() ;
		online.print(101);
		online.print(101, 3);
		online.print("earphones");
		
		
	}

}
