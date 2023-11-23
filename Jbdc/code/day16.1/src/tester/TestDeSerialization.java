package tester;

import java.util.Map;
import java.util.Scanner;

import com.shop.core.Product;

import static utils.BinIOUtils.restoreProductDetails;
public class TestDeSerialization {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name");
			Map<Integer, Product> restoredMap= restoreProductDetails
					(sc.nextLine());
			//print map contents
			System.out.println("Shop contents : ");
			restoredMap.forEach((k,v) -> System.out.println(v));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("de-ser over....");

	}

}
