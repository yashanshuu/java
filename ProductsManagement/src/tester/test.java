package tester;
import core.Product;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;
import static java.time.LocalDate.parse;
import static utils.customExceptions.*;
public class test {

	public static void main(String[] args) {
		boolean exit = false;
		HashMap<String,Product> products = new HashMap<>();
		try(Scanner sc = new Scanner(System.in)){
			while(!exit) {
				try {
					System.out.println("1.	Add a new product item\r\n"
							+ "2.	Update the quantity of item in stock.\r\n"
							+ "3.	Display the all product items\r\n"
							+ "4.	Remove all products whose available stock is zero\r\n"
							+ "5.	Display the product items  for which the shipment date is due in the next week");
					System.out.println("Select option: ");
					switch(sc.nextInt()) {
					case 1:
						System.out.println("Enter Product Id:");
						String id = sc.next();
						checkForDups(id, products);
						System.out.println("Enter description, price, shipment date, available stock:");
						Product p = new Product(id,sc.next(),sc.nextDouble(),parse(sc.next()),sc.nextInt());
						products.put(id, p);
						break;
					case 2:
						System.out.println("Enter product id:");
						String id1 = sc.next();
						checkForProduct(id1, products);
						Product p1 = products.get(id1);
						System.out.println("Enter quantity to be updated: ");
						int stock = sc.nextInt();
						p1.setAvailableStock(stock);
						System.out.println("Stock updated...");
						break;
					case 3:
						products.values().stream().
						forEach(p2->System.out.println(p2));
						break;
					case 4:
						System.out.println("Removing products with no available stock...");
						products.values().removeIf(p3->p3.getAvailableStock()==0);
						break;
					case 5:
						System.out.println("Displaying shippments within a week...");
						LocalDate todaysDate = LocalDate.now();
						LocalDate oneWeekLateDate = todaysDate.plus(1,ChronoUnit.WEEKS);
						products.values().stream().filter(p4->p4.getShipmentDate().isBefore(oneWeekLateDate))
						.forEach(p5->System.out.println(p5));				
						break;
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
			}

	}
  }
}
