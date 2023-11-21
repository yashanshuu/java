package exception_handling;

import java.util.Scanner;

import static utils.VehicleValidationRules.*;

public class TestSpeed {

	public static void main(String[] args) /* throws VehicleHandlingException */ {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter curnt speed");
			// invoke a static method for speed validation.
			validateSpeed(sc.nextInt());
			System.out.println("Enter License Expiry Date(yyyy-MM-dd): ");
			validateLicenseExpiry(sc.next());
			System.out.println("end of try...");
		} // JVM : sc.close()
		catch (Exception e) {
		//	System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("main cntd....");

	}

}
