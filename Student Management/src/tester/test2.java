package tester;

import static utils.StudentUtils.checkForDup;
import static utils.StudentUtils.parseAndValidateCourse;
import static utils.StudentUtils.parseDob;

import java.util.HashMap;
import java.util.Optional;
import java.util.Scanner;

import com.acts.core.Course;
import com.acts.core.Student;

public class test2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create empty HashMap , to store student details
			HashMap<String, Student> students = new HashMap<>();
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println("Options 1. Student Admission \n" + "2.Get Student Details\n "
							+ "3. Display all Student details\n 4. Change course\n 5.Remove Student\n "
							+ "6. Display all details of specific course\n 7. Sort by marks \n 8.Sum of marks by course\n"
							+ "9. Find topper\n 10. Number of failures \n 0.Exit");
					System.out.println("Choose");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter student PRN");
						String prn=sc.next();
						checkForDup(prn,students);
						//=> no dups!
						System.out.println("Enter details : firstName,  lastName,  marks,  enrolledCourse,  dob");
						Student s=new Student(prn, sc.next(), sc.next(),sc.nextInt(),
								parseAndValidateCourse(sc.next()), parseDob(sc.next()));
						students.put(prn, s);
						System.out.println("student admitted!");
						break;
					case 2:
						System.out.println("Enter course name: ");
						Course co = Course.valueOf(sc.next());
						double sumOfMarks = students.values().stream().filter(p1->p1.getEnrolledCourse().equals(co)).mapToDouble(p2->p2.getMarks()).sum();
						System.out.println(sumOfMarks);
						break;
					case 3:
						System.out.println("Enter course name: ");
						Course co1 = Course.valueOf(sc.next());
						Optional<Student> st = students.values()
								.stream()
								.filter(p3->p3.getEnrolledCourse().equals(co1))
								.max((p4,p5)->((Integer)p4.getMarks()).compareTo(p5.getMarks()));
						System.out.println(st);
						break;
					}}catch(Exception e) {
						System.out.println(e);
					}

				}
			}
		}
}
