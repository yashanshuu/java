package utils;
import core.Cricketer;
import java.util.HashMap;
import exception.InvalidInputException;

public class CustomException {
	public static void checkDups(String name, HashMap<String, Cricketer> c) throws InvalidInputException{
		if(c.containsKey(name))
			throw new InvalidInputException("Player already exists...");
		System.out.println("No duplicate found");
	}	
}
