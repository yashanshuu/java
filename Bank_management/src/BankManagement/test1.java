package BankManagement;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.*;
import java.util.Collections;
import static BankManagement.BankValidationRules.*;
public class test1 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			ArrayList<BankAccount> accounts = new ArrayList<>();
			boolean exit = false;
			while(!exit) {
				try {
				System.out.println("Select option: 1. Create Bank Account \n 2. View account "
						+ "summary \n 3. Withdraw funds \n 4. Deposit funds\n 5. Close bank account"
						+ "6. Sort as per manufacturing date\n"
						+ "7. Sort by type and balance\n 8. Sort by Account Number0. Terminate");
				switch(sc.nextInt()) {
				case 1:
					//acct number(int) , customer name(string), pin (string) account type (enum : SAVING,CURRENT,FD,LOAN) 
					//, account balance(double) , creation date(localdate)
					System.out.println("Enter details : Customer Name Account number  Pin Account Type"
							+ "(SAVING,CURRENT,FD,LOAN) Account Balance Creation Date");
						BankAccount account = BankValidationRules.validateAll(sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.next(),accounts);
						accounts.add(account);
						System.out.println("Account added...");
						break;
				case 2: System.out.println("Account Summary:");
				        for(BankAccount a:accounts)
				        	System.out.println(a);
				        break;
				case 3:System.out.println("For Withdrawing Funds, Enter your Bank account number ");
					   System.out.println("Enter account number: ");
					   int acc_no = sc.nextInt();
					   System.out.println("Enter amount to be withdrawn: ");
					   int withdrawRs = sc.nextInt();
					   verifyBalanceAndUpdate(acc_no,withdrawRs,accounts);
				       break;				       
				case 4: System.out.println("For amount to be deposited , Enter your account Number: ");
						System.out.println("Enter account number: ");
						int acc_no1 = sc.nextInt();
						System.out.println("Enter amount to be deposited: ");
						int depositRs = sc.nextInt();
						BankAccount b1 = validateBankAccountNumber(acc_no1,accounts);
						b1.setAcc_bal(b1.getAcc_bal()+depositRs);
					    break;
				case 5: System.out.println(" For Closing Bank account , Enter your account Number:  ");
						break;		
				case 6: System.out.println("Accounts sorted by creation date: ");
						Collections.sort(accounts, new creationDateSorting());
						break;
				case 7: System.out.println("Accounts sorted by type and balance: ");
						Collections.sort(accounts, new validateByAccountAndBalance());
						break;
				case 8: System.out.println("Accounts sorted by account number: ");
						Collections.sort(accounts);
						break;
				case 0: exit = true;
						break;
				}
				}catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}
	
