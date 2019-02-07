package com.cg.mra.service;

import com.cg.mra.bean.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;

public class AccountServiceImpl implements AccountService {
	Account account = new Account();
	AccountDao dao = new AccountDaoImpl();

	public AccountServiceImpl(String mobileNo) {
		getAccountDetails(mobileNo);

	}

	@Override
	public Account getAccountDetails(String mobileNo) {
		account = dao.getAccountDetails(mobileNo);
		System.out.println(account.getAccountBalance());
		return account;

	}

	@Override
	public double rechargeAccount(String mobileNo, double rechargeAmount) {
		double d = dao.rechargeAccount(mobileNo, rechargeAmount);
		return d;
	}

}
