package inheritance2;

public class person {
	private String firstName;
	private String lastName;
	public person(String firstName, String lastName) {
		//System.out.println("In Person's Constructor");
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override //method level compile time annotation: to inform javac following form of the method
	public String toString() {
		return this.firstName +" " + this.lastName;
	}
	
	public boolean equals(person p) {
		if(this.firstName.equals(p.firstName)  && (this.lastName.equals(p.lastName))) {
			return true;
		}
		return false;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	
	
}
