package Abstract;

public class Cat  extends Animal{
	
	void sound () {
		System.out.println( "meow meow" );
		
	}
public static void main(String[] args) {
	Cat cat = new Cat () ;
	cat.sleep();
	cat.sound();
}
}
