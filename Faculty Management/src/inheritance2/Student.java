package inheritance2;

public class Student extends person {
	private int gradYear;
	private String course;
	private int fees;
	private int marks;
	//add sub class constructor
	public Student(String fn,String ln, int year, String course, int fees, int marks) {
		super(fn,ln);
		//before super we cannot write anything while inheriting
		//System.out.println("In Student's Constructor");
		gradYear = year;
		this.course = course;
		this.fees = fees;
		this.marks = marks;
	}
	
	//over-riding the toString method
	@Override
	public String toString() {
		return "Students details:" + super.toString() +" "+ this.gradYear+" " + this.course+" " + this.fees +" "+ this.marks;
	}
	
	public void study() {
		System.out.println(super.getFirstName() + super.getLastName() + "graduated in " + gradYear + "having fees " + fees + "scored " + marks);
	}
}
