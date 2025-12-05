package Constructors;
// three types of constructors
//deafult constructors
// no arguments constructors
// parameterized constructors

  
   Car {
	int price;
	String Company;
	
	 public Car(int a,String b) {
		 price = a;
		 Company=b;
			
		}
		public static void main(String[] args) {
			Car car = new Car(45999,"tata");
			//parametrized constructor.
			System.out.println("price : "+ car.price);
			System.out.println("company  =" +car.Company);
		}	
		
	
		
		}	



