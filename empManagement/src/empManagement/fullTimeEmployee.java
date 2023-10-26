package empManagement;

import java.time.LocalDate;

public class fullTimeEmployee extends Employee{
	private double monthlySalary;
	
	public fullTimeEmployee(String name,LocalDate dateOfJoining, int phone, 
			int aadhaarNumber, double monthlySalary) {
		super(name,dateOfJoining,phone,aadhaarNumber);
		this.monthlySalary = monthlySalary;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	
}
