package test_inheritance;
import java.util.Scanner;

import inheritance2.Student;
import inheritance2.faculty;
import inheritance2.person;
public class EventOrganizer {

	public static void main(String[] args) throws InvalidInputException {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many max event members?");
		person[] members = new person[sc.nextInt()];
		int counter=0;
		boolean exit = false;
		while(!exit) {
			System.out.println("Option 1: Student registration \n"
					+ "2: Faculty registration \n" + "3: Display all member details \n"
							+ "4: Display specific member details \n" + "5: Add functionality \n"
					+ "0: Exit \n" );
			System.out.println("Choose Option:");
			switch (sc.nextInt()) {
			case 1: if(counter < members.length) {
					System.out.println("Enter Student details:");
					members[counter++] = new Student(sc.next(),sc.next(),sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt());
					for(int i=0;i<counter-1;i++) {
			        	if (members[counter-1].equals(members[i])) {
			        		throw new InvalidInputException("Duplicate name detected");
			           }
			        }
			}
					else {
						System.out.println("Member registration full!!!");
					}
					break;
			case 2: if(counter < members.length) {
					System.out.println("Enter Faculty details:");
					members[counter++] = new faculty(sc.next(),sc.next(),sc.nextInt(),sc.next());
					for(int i=0;i<counter-1;i++) {
			        	if (members[counter-1].equals(members[i])) {
			        		throw new InvalidInputException("Duplicate name detected");
			           }
			        }		
			}
					else {
						System.out.println("Member registration full!!!");
					}
					break;
			case 3: System.out.println("Member details are:");
			        for(person p:members) {
			        	if (p != null) {
			        	System.out.println(p);
			           }
			        }
			        break;
			case 4: System.out.println("Enter seat no:");
			        int index = sc.nextInt()-1;
			        if (index>=0 && index<counter)
			        	System.out.println(members[index]);
			        break;
			case 5:System.out.println("Enter seat no:");
					index = sc.nextInt()-1;
			        if (index>=0 && index<counter) {
			        	person p = members[index];
			            //p.study()   //javac error as we are trying to access study which is defined in 
			        	// student class and at compile time as compiler goes by reference
			        	// and there is no study method defined in person thus we need to downcast
			            if(p instanceof Student) {
			            	((Student)p).study(); //down casting
			            }
			            else {
			            	((faculty)p).teach();
			            }
			        }
			        else
			        	System.out.println("Invalid seat no");
			        break;
			case 0: exit = true;
						   break;
			}
		}
		sc.close();
	}

}
