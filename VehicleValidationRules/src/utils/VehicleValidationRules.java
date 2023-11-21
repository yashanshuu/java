package utils;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import custom_exceptions.VehicleHandlingException;

public class VehicleValidationRules {
	// declare static constants : speed range
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	public static SimpleDateFormat sdf;
	static {
		MIN_SPEED=40;
		MAX_SPEED=80;
		sdf = new SimpleDateFormat("yyyy-MM-dd");
	}

//add a static method for speed validation
	public static void validateSpeed(int speed) throws VehicleHandlingException{
		if(speed < MIN_SPEED)
			throw new VehicleHandlingException("Speed too slow");
		if(speed > MAX_SPEED)
			throw new VehicleHandlingException("Speed too fast , FATAL!!!!!!");
		System.out.println("speed within range....");
	}
	
// Add another validation rule, Check Driving license expiry
//	I/p : License expiry date (in string form, using scanner)
//	O/P : in case of success , Valid License OR throw custom exception with suitable err mesg .
	public static void validateLicenseExpiry(String date) throws VehicleHandlingException, ParseException{
		Date d = sdf.parse(date);
		if(d.before(new Date()))
			throw new VehicleHandlingException("License Expired...Not allowed to drive");
		System.out.println("Valid License");
	}
}
