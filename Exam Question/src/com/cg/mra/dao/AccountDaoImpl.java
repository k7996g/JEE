package com.cg.mra.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.mra.bean.Account;

public class AccountDaoImpl implements AccountDao {
	Map<String, Account> accountEntry = new HashMap<>();

	public AccountDaoImpl() {
		accountEntry.put("7895764776", new Account("Prepaid", "kaushal", 1000));
		accountEntry.put("8979875795", new Account("Prepaid", "keshav", 1001));
		accountEntry.put("9412895818", new Account("Prepaid", "Anil", 1002));
		accountEntry.put("8445489546", new Account("Prepaid", "surabhi", 1003));
		accountEntry.put("8923374708", new Account("Prepaid", "Himanshi", 1004));
	}

	@Override
	public Account getAccountDetails(String mobileNo) {

		for (Map.Entry m : accountEntry.entrySet()) {
			if (m.getKey().equals(mobileNo)) {

				return (Account) m.getValue();
			}
		}

		return null;
	}

	@Override
	public double rechargeAccount(String mobileNo, double rechargeAmount) {
		int f = 0;
		for (Map.Entry m : accountEntry.entrySet()) {
			if (m.getKey().equals(mobileNo)) {
				double x = (((Account) m.getValue()).getAccountBalance());
				((Account) m.getValue()).setAccountBalance(x + rechargeAmount);
				System.out.println("Account recharge successfully");
				System.out.print("Hello, " + ((Account) m.getValue()).getCustomerName());
				System.out.println(" Your balance is " + ((Account) m.getValue()).getAccountBalance());
				f = 1;
			}
		}
		if (f == 1)
			return 1;
		return 0;
	}

}
