package com.cg.paytmWallet.WalletService;

import com.cg.patmWallet.bean.Customer;

public interface PaytmWalletService {

	Customer createAccount(String name, String phoneNo, double balance);

	Customer showBalance(String phoneNo);

	Customer find(String phoneNo);
}