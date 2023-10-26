package empManagement;

import java.time.LocalDate;

public class Employee {
	private static int nextEmpId = 0;
	private String empId;
	//Name, Date of joining, Phone Number, Aadhaar number 
	private String name;
	private LocalDate joining_date;
	private int phoneNumber;
	private int aadharNumber;
	
	public Employee(String name, LocalDate joining_date, int phoneNumber, int aadharNumber) {
		super();
		this.empId = generateEmpId();
		this.name = name;
		this.joining_date = joining_date;
		this.phoneNumber = phoneNumber;
		this.aadharNumber = aadharNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getJoining_date() {
		return joining_date;
	}

	public void setJoining_date(LocalDate joining_date) {
		this.joining_date = joining_date;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(int aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	
	private String generateEmpId() {
		String s = "emp"+String.format("%04d", nextEmpId);
		nextEmpId++;
		return s;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", joining_date=" + joining_date + ", phoneNumber="
				+ phoneNumber + ", aadharNumber=" + aadharNumber + "]";
	}
}
