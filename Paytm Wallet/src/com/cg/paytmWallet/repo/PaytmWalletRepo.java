package com.cg.paytmWallet.repo;

import com.cg.patmWallet.bean.Customer;

public interface PaytmWalletRepo {

	boolean save(Customer c1);

	Customer findByPhone(String phoneNo);

}