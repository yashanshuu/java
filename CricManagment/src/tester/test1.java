package tester;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import core.Cricketer;
import static utils.CustomException.checkDups;

public class test1 {

	public static void main(String[] args) {
		HashMap<String, Cricketer> cricketer = new HashMap<>();
		try(Scanner sc = new Scanner(System.in)){
		boolean exit = false;
		try {
			while(!exit) {
				//String name,int age,String email_id,String Phone,int rating
				if(cricketer.size()>=5) {
					System.out.println("Team full...");
					break;
				}
				else {
				System.out.println("1.Add a new cricketer\n2.Modify cricketer's rating\n"
						+ "3.Search cricketer by name\n4.Display all\n5.Display sorted cricketers by"
						+ "rating\n");
				System.out.println("Select option:");
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Enter player name:");
					String name = sc.next();
					checkDups(name, cricketer);
					//String name,int age,String email_id,String Phone,int rating
					System.out.println("Enter age, email address, phone number, rating");
					Cricketer c = new Cricketer(name,sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
					cricketer.put(name, c);
					System.out.println("Player added...");
					break;
				case 2:
					System.out.println("Modifying player ratings...");
					System.out.println("Enter player name whose rating is to be modified: ");
					String name1 = sc.next();
					if(cricketer.containsKey(name1))
						System.out.println("Enter rating to be modified: ");
					    for(Cricketer c1:cricketer.values())
							if(c1.getName().equals(name1))
								c1.setRating(sc.nextInt());
					break;
				case 3:
					System.out.println("Searching cricketer by name...");
					cricketer.values().stream().filter(p->p.getName().equals(sc.next()))
					.forEach(p1->System.out.println(p1));
					break;
				case 4:
					System.out.println("Display all cricketers...");
					cricketer.values().stream().forEach(p2->System.out.println(p2));
					break;
				case 5:
					System.out.println("Sorting by rating...");
					cricketer.values().stream().sorted(Comparator.comparing(Cricketer::getRating)).forEach(p3->System.out.println(p3));
					break;
				case 0:
					exit=true;
					break;
			}}
			}}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	}
