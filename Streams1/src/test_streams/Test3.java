package test_streams;

import static utils.ShopUtils.populateProductList;

import java.util.List;

import com.shop.core.Category;
import com.shop.core.Product;

//display name of least expensive product
public class Test3 {

	public static void main(String[] args) {

		// get all product list
		List<Product> productList = populateProductList();
		System.out.println("Shop contains ");
		productList.forEach(p -> System.out.println(p));
		Product product = productList.stream() //Stream<Product> : all
				.filter(p -> p.getProductCategory().equals(Category.GRAIN))
				.min((p1, p2) -> ((Double) p1.getPrice()).compareTo(p2.getPrice())) //Optional<Product>
				.orElseThrow();
		System.out.println("Name of the least expensive product "+product.getName());

	}

}
