package test_streams;

import static utils.ShopUtils.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.shop.core.Product;

public class Test2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get all product list
			List<Product> productList = populateProductList();
			System.out.println("Shop contains ");
			productList.forEach(p -> System.out.println(p));
			System.out.println("Enter date");
			LocalDate date=LocalDate.parse(sc.next());
			List<Product> freshProducts=productList.stream()
					.filter(p -> p.getManufactureDate().isAfter(date)) //filter : intermediate 
					.collect(Collectors.toList());
			System.out.println("Fresh products");
			freshProducts.forEach(p -> System.out.println(p));
		}

	}

}
