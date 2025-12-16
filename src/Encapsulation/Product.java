package Encapsulation;

public class Product {
 private int price;
  

 public int getPrice() {
	return price;
 }

 public void setPrice(int price) {
	if (price >=0) {
		this.price = price ;
	
 }else {
	 System.out.println("invalid");
	 
	 
 }
	 
 }
	 
 
 
 public static void main(String[] args) {
	Product p = new Product();
	p.price=(-500);
	p.getClass();
	System.out.println("price"   + p.price);
	
	}
}
