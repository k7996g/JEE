package com.cg.mra.service;

import com.cg.mra.bean.Account;
import com.cg.mra.exception.PhoneNumberNotFoundException;

public interface AccountService {
	Account getAccountDetails(String mobileNo) throws PhoneNumberNotFoundException;

	double rechargeAccount(String mobileNo, double rechargeAmount) throws PhoneNumberNotFoundException;
}
