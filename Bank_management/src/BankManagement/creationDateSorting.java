package BankManagement;

import java.util.Comparator;
public class creationDateSorting implements Comparator<BankAccount>{

	@Override
	public int compare(BankAccount o1, BankAccount o2) {

		if(o1.getCreationDate().isBefore(o2.getCreationDate()))

			return -1;

		if(o1.getCreationDate().equals(o2.getCreationDate()))

			return 0;

		return 1;

	}

}