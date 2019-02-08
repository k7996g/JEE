package com.cg.paytmWallet.WalletService;

import java.util.LinkedList;

import com.cg.patmWallet.bean.Customer;
import com.cg.patmWallet.bean.Wallet;
import com.cg.paytmWallet.repo.PaytmWalletRepo;
import com.cg.paytmWallet.repo.PaytmWalletRepoImpl;

public class PaytmWalletServiceImpl implements PaytmWalletService {

	LinkedList<Customer> c = new LinkedList<Customer>();

	PaytmWalletRepo repo = new PaytmWalletRepoImpl();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cg.paytmWallet.WalletService.PaytmWalletService#createAccount(java.lang.
	 * String, java.lang.String, double)
	 */
	@Override
	public Customer createAccount(String name, String phoneNo, double balance) {
		Wallet wallet = new Wallet();

		wallet.setBalance(balance);
		Customer customer = new Customer(name, phoneNo, wallet);
		c.add(customer);
		if (repo.save(customer))
			return customer;

		return null;
	}

	public Customer find(String phoneNo) {
		Customer c = (repo.findByPhone(phoneNo));
		return c;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cg.paytmWallet.WalletService.PaytmWalletService#showBalance(java.lang.
	 * String)
	 */
	@Override
	public Customer showBalance(String phoneNo) {
		for (int i = 0; i < c.size(); i++)
			if (c.get(i).getPhone().equals(phoneNo)) {
				System.out.println(c.get(i).getWallet().getBalance());
				return c.get(i);
			}
		return null;
	}
}
