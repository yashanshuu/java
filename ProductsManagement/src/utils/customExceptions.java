package utils;
import java.util.HashMap;
import Exception.invalidInputException;
import core.Product;

public class customExceptions {
	public static void checkForDups(String id,HashMap<String, Product> products) throws invalidInputException{
		if(products.containsKey(id))
			throw new invalidInputException("Duplicate product...");
		System.out.println("No duplicate found...");
	}
		
	public static void checkForProduct(String id,HashMap<String, Product> products) throws invalidInputException{
		if(products.containsKey(id)==false)
			throw new invalidInputException("Invalid Product Id...");		
	}
}
