package com.acts.core;

import java.time.LocalDate;

/*
 * Fields  : prn (string) : unique ID ,complete name(first name n last name), 
 * marks,course(enum), dob(LocalDate)
 */
public class Student implements Comparable<Student>{
	private String prn;
	private String firstName;
	private String lastName;
	private int marks;
	private Course enrolledCourse;
	
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	private LocalDate dob;
	public Student(String prn, String firstName, String lastName, int marks, Course enrolledCourse, LocalDate dob) {
		super();
		this.prn = prn;
		this.firstName = firstName;
		this.lastName = lastName;
		this.marks = marks;
		this.enrolledCourse = enrolledCourse;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [prn=" + prn + ", firstName=" + firstName + ", lastName=" + lastName + ", marks=" + marks
				+ ", enrolledCourse=" + enrolledCourse + ", dob=" + dob + "]";
	}
	public Course getEnrolledCourse() {
		return enrolledCourse;
	}
	public void setEnrolledCourse(Course enrolledCourse) {
		this.enrolledCourse = enrolledCourse;
	}
	
	@Override
	public int compareTo(Student os) {
		if(this.marks < os.marks)
			return 1;
		if(this.marks==os.marks)
			return 0;
		return -1;
	}

}
