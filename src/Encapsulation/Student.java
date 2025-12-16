package Encapsulation;

public class Student {
 
	private int marks ;

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		if (marks <=100) {
			this.marks=marks;
		} else { 
			System.out.println("invalid marks"); 
		
		}
		
	}
	
	public static void main(String[] args) {
		Student student = new Student ();
		student.setMarks(120); 
		int marks=student.getMarks();
		System.out.println(marks);
	}
}
