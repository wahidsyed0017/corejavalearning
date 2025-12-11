package Inhertiance;



public class Child  extends Parent1{
	
	void property () {
		System.out.println("child class property method ");
			
		}
		void display () {
			System.out.println("child class property display");
		}
		public static void main(String[] args) {
			Parent1 parent =new Parent1 ();
			Child child =  new Child();			
			parent.display();
			parent.property();
			
			}
			}
		
	


