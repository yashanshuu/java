package empManagement;

import java.time.LocalDate;

public class partTimeEmployee extends Employee{
	private double hourlySalary;
	
	public partTimeEmployee(String name,LocalDate dateOfJoining, int phone, 
			int aadhaarNumber, double hourlySalary) {
		super(name,dateOfJoining,phone, aadhaarNumber);
		this.hourlySalary = hourlySalary;
	}

	public double getHourlySalary() {
		return hourlySalary;
	}

	public void setHourlySalary(double hourlySalary) {
		this.hourlySalary = hourlySalary;
	}
	
	
}
