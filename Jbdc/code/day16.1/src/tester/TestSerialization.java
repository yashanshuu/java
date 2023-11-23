package tester;

import static utils.ShopUtils.*;
import static utils.BinIOUtils.*;
import java.util.Map;
import java.util.Scanner;

import com.shop.core.Product;

public class TestSerialization {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get populated map
			Map<Integer, Product> map = populateProductMap(populateProductList());
			System.out.println("Enter file name");
			// invoke IOUtils method : for string product details
			storeProductDetails(map, sc.nextLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

}
