package test_streams;

import static utils.ShopUtils.*;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

import com.shop.core.Product;

public class Test1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get product map
			Map<Integer, Product> productMap = populateProductMap(populateProductList());
			System.out.println("Shop contains ");
			productMap.forEach((k,v) -> System.out.println(v));
			System.out.println("Enter date");
			LocalDate date=LocalDate.parse(sc.next());
			long noOfProducts=productMap.values().stream()
					.filter(p -> p.getManufactureDate().isAfter(date)) //filter : intermediate 
					.count();//reduce : teminal op.
			System.out.println("no of products after "+date+" : "+noOfProducts);
		}

	}

}
