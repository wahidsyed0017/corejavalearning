package Static.bin;

import java.awt.print.Printable;

public class School {
	
	static void printschoolname () {
	
		System.out.println("ABC  school");
	}
	void   printstudent() {
		System.out.println("student name = wahid");
	}
	public static void main(String[] args) {
		printschoolname();
		School school = new School();
		school.printstudent();
	}
		
	}
	
	


