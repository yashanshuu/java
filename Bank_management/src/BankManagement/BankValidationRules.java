package BankManagement;

import static java.time.LocalDate.parse;
import java.util.Collections;
import java.time.LocalDate;
import java.util.ArrayList;

public class BankValidationRules {
	public static BankAccount validateBankAccountNumber(int acc_no,ArrayList<BankAccount> acnt) throws InvalidInputExceptions {
		BankAccount b = new BankAccount(acc_no);
		int index = acnt.indexOf(b);
		if(index == -1)
			throw new InvalidInputExceptions("Account number doesnot not exist...");
		return acnt.get(index);
	}
	
	public static void checkForDup(int acc_no,ArrayList<BankAccount> acnt ) throws InvalidInputExceptions{
		BankAccount b1 = new BankAccount(acc_no);
		if(acnt.contains(b1))
			throw new InvalidInputExceptions("Account already exists");
		System.out.println("No duplicate account found...");
		return;
	}
	
	public static boolean checkBalance(double bal) throws InvalidInputExceptions{
		if(bal < 5000)
			throw new InvalidInputExceptions("Balance less than minimum amount required...");
		return true;
	}
	
	public static type checkAccountType(String t) throws IllegalArgumentException{
		return type.valueOf(t.toUpperCase());
	}
	//
	public static BankAccount validateAll(String name, int acc_num, String pin, String acc_type, double acc_bal, String creationDate,ArrayList<BankAccount> acnt) 
	throws InvalidInputExceptions{
		checkForDup(acc_num,acnt);
		checkBalance(acc_bal);
		type t = checkAccountType(acc_type);
		LocalDate d1 = parse(creationDate);
		return new BankAccount(name,acc_num,pin,t,acc_bal,d1);	
	}
	
	public static void verifyBalanceAndUpdate(int acc_no, double withdrawAmount, ArrayList<BankAccount> acnt) throws InvalidInputExceptions{
		BankAccount b = validateBankAccountNumber(acc_no,acnt);
		if(b.getAcc_bal() < withdrawAmount)
			throw new InvalidInputExceptions("Insufficient Balance");
		b.setAcc_bal(b.getAcc_bal() - withdrawAmount);
	}
	
	public static BankAccount deleteAccount(int acc_no, ArrayList<BankAccount> acnt) throws InvalidInputExceptions{
		BankAccount b2 = new BankAccount(acc_no);
		int index = acnt.indexOf(b2);
		if(index == -1)
			throw new InvalidInputExceptions("Account does not exist");
		return acnt.remove(index);
	}
}