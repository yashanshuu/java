package BankManagement;
import java.time.LocalDate;


public class BankAccount implements Comparable<BankAccount>{
	//acct number(int) , customer name(string), pin (string) account type (enum : SAVING,CURRENT,FD,LOAN) , account balance(double) , creation date(localdate)

	private String cus_name;
	private int acc_num;
	private String pin;
	private  type acc_type;
	private double acc_bal;
	private LocalDate creationDate;
	

	public BankAccount(String name, int acc_num, String pin, type acc_type, double acc_bal, LocalDate creationDate) {
		super();
		this.cus_name = name;
		this.acc_num = acc_num;
		this.pin = pin;
		this.acc_type = acc_type;
		this.acc_bal = acc_bal;
		this.creationDate = creationDate;
	}
	
	public BankAccount(int acc_num) {
		super();
		this.acc_num = acc_num;
	}

	
	public double getAcc_bal() {
		return acc_bal;
	}

	public void setAcc_bal(double acc_bal) {
		this.acc_bal = acc_bal;
	}

	public int getAcc_num() {
		return acc_num;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		 return "[name " + cus_name + " acc_num " + acc_num +" pin " +pin +" acc_type " + acc_type + " acc_bal " + acc_bal + " Creationdate " + creationDate + "]";
	 }
	
	@Override
	public boolean equals(Object o) {
		if(this.acc_num == ((BankAccount)o).getAcc_num())
			return true;
		return false;
	}
	
	@Override
	public int compareTo(BankAccount anotherAccount) {
		if(this.acc_num < anotherAccount.acc_num)
			return -1;
		if(this.acc_num == anotherAccount.acc_num)
			return 0;
		return 1;

	}

	public type getAcc_type() {
		return acc_type;
	}

	public void setAcc_type(type acc_type) {
		this.acc_type = acc_type;
	}

	public void setAcc_num(int acc_num) {
		this.acc_num = acc_num;
	}
}

	