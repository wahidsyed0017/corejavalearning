package Static;

import Constructors.copy.Hotel;

public class Hotel {
	
	static String name = "TAJ";
	int  roomnum;
	
	Hotel() {
		roomnum = 100;
		
	}
	
	public static void main(String[] args) {
		System.out.println("Hotel name ="  +Hotel.name);
		Hotel hotel = new Hotel();
		
		System.out.println("room number  =" +hotel.roomnum);
	}

}
