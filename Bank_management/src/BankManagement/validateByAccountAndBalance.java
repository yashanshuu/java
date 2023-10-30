package BankManagement;
import java.util.Comparator;
public class validateByAccountAndBalance implements Comparator<BankAccount>{
@Override
public int compare(BankAccount o1, BankAccount o2) {
	int res = o1.getAcc_type().compareTo(o2.getAcc_type());
	if(res == 0) {
		if(o1.getAcc_bal() < o2.getAcc_bal())
			return -1;
		if(o1.getAcc_bal() == o2.getAcc_bal())
			return 0;
	}
	return 1;
 }
}
  
  