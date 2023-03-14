package comparator;

import java.util.Comparator;

import com.assinmentjava.entity.Account;

public class AccountNumCom implements Comparator<Account> {
	@Override
	public int compare(Account o1, Account o2) {
		return o1.get-o2.getAcc_Number();
	}


}
