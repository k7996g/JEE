package com.cg.paytmWallet.main;

import com.cg.paytmWallet.WalletRepo.ImpWalletRepo;
import com.cg.paytmWallet.WalletRepo.WalletRepo;
import com.cg.paytmWallet.WalletService.ImpWalletService;
import com.cg.paytmWallet.WalletService.WalletService;

public class Main {

	public static void main(String[] args) {
		WalletService w=new ImpWalletService("kaushal", "7895764776", 10000.0);
//w.createAccount("kaushal", "7895764776", 10000.0);
WalletService w1=new ImpWalletService("keshav", "8979875795", 20000.0);
//w1.createAccount("keshav", "8979875795", 20000.0);
w.showBalance("7895764776");
//w1.showBalance("8979875795");
/*WalletRepo x=new  ImpWalletRepo();
System.out.println(x.findByPhone("7895764776"));*/
	}

}
