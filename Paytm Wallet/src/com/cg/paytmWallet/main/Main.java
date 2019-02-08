package com.cg.paytmWallet.main;

import com.cg.paytmWallet.WalletService.PaytmWalletService;
import com.cg.paytmWallet.WalletService.PaytmWalletServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaytmWalletService a = new PaytmWalletServiceImpl();
		a.createAccount("kaushal", "7895764776", 10000.0);
		a.showBalance("7895764776");
		a.find("7895764776");
	}

}
