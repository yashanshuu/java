package empManagement;
import static java.time.LocalDate.parse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
public class test1 {

	public static void main(String[] args) {
		boolean exit = false;
		try(Scanner sc = new Scanner(System.in)){
			ArrayList<Employee> employees = new ArrayList<>();
			try {
				while(!exit) {
					System.out.println("1. Add full time employee\r\n"
							+ "2. Add part time employee\r\n"
							+ "3. Delete an employee by Emp Id\r\n"
							+ "4. Search employee details by Aadhaar number\r\n"
							+ "5. Display all employee details\r\n"
							+ "6. Display all employee details sorted by date of joining\r\n"
							+ "7. Exit");
					System.out.println("Select option: ");
					switch(sc.nextInt()) {
					case 1:
						System.out.println("Enter employee name,Date of joining, Phone Number, "
								+ "Aadhaar number, Monthly salary");
						fullTimeEmployee fte = new fullTimeEmployee(sc.next(),parse(sc.next()),
								sc.nextInt(),sc.nextInt(),sc.nextDouble());
						employees.add(fte);
						break;
					case 2:
						System.out.println("Enter employee name,Date of joining, Phone Number, "
								+ "Aadhaar number, Hourly salary");
						fullTimeEmployee pte = new fullTimeEmployee(sc.next(),parse(sc.next()),
								sc.nextInt(),sc.nextInt(),sc.nextDouble());
						employees.add(pte);
						break;
					case 3:
						System.out.println("Enter employee id which is to be removed: ");
						String id = sc.next();
						Iterator<Employee> emp = employees.iterator();
						while(emp.hasNext()) {
							Employee e = emp.next();
							if(e.getEmpId().equals(id)) {
								emp.remove();
								System.out.println("Employee removed...");
							}	
						}
						break;
					case 4:
						System.out.println("Enter aadhar number: ");
						int ano = sc.nextInt();
						for(Employee e:employees)
							if(e.getAadharNumber()==ano)
								System.out.println(e);
						break;
					case 5:
						employees.stream().forEach(e1->System.out.println(e1));
						break;
					case 6:
						employees.stream().sorted(Comparator.comparing(Employee::getJoining_date)).forEach(i->System.out.println(i));					
						break;
					case 7:
						exit = true;
						System.out.println("Bye...");
						break;
					}				
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
