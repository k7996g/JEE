package com.cg.paytmWallet.WalletService;

import java.math.BigDecimal;
import java.util.LinkedList;

import com.cg.patmWallet.bean.Customer;
import com.cg.patmWallet.bean.Wallet;

public class ImpWalletService implements WalletService {
	LinkedList<Customer> c = new LinkedList<Customer>();

	Wallet wallet = new Wallet();

	public ImpWalletService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ImpWalletService(String name, String phone, double balance) {
		createAccount(name, phone, balance);
	}

	@Override
	public void createAccount(String name, String phone, double balance) {
		wallet.setBalance(balance);
		c.add(new Customer(name, phone, wallet));

	}

	@Override
	public void showBalance(String phone) {
		System.out.println(c.size());
		for (int i = 0; i < c.size(); i++) {
			if (c.get(i).getPhone().equals(phone))
				System.out.println(c.get(i).getWallet().getBalance());
		}
	}

	public LinkedList<Customer> getList() {
		System.out.println(c.size());
		return c;
	}
}
