package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.shop.core.Product;

public interface BinIOUtils {
//add a static method to store the product details from a Map in bin file using ser.
	static void storeProductDetails(Map<Integer, Product> productMap, String fileName) throws IOException {
		// 1. Create chain of I/O streams
		// Java App --> OOS --> FOS (BIn file)
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
			out.writeObject(productMap);// HashMap --Integer --Product : not ser.
		}
	}

	// add a static method to restore the product details from a bin file using
	// de-ser.
	@SuppressWarnings("unchecked")
	static Map<Integer, Product> restoreProductDetails(String fileName)throws IOException,ClassNotFoundException{
		// 1. create chain of i/p streams
		// Java App <--- OIS <---- FIS (bin file)
		try (ObjectInputStream in = new ObjectInputStream
				(new FileInputStream(fileName))) {
			return (Map<Integer, Product>)in.readObject();
		}
	}

}
