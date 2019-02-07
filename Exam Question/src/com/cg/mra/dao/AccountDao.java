package com.cg.mra.dao;

import com.cg.mra.bean.Account;
import com.cg.mra.exception.PhoneNumberNotFoundException;

public interface AccountDao {
	Account getAccountDetails(String mobileNo) throws PhoneNumberNotFoundException;

	double rechargeAccount(String mobileNo, double rechargeAmount) throws PhoneNumberNotFoundException;
}
