package com.cg.paytmWallet.repo;

import java.util.LinkedList;

import com.cg.patmWallet.bean.Customer;

public class PaytmWalletRepoImpl implements PaytmWalletRepo {
	LinkedList<Customer> c = new LinkedList<Customer>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cg.paytmWallet.repo.PaytmWalletRepo#save(com.cg.patmWallet.bean.Customer)
	 */
	@Override
	public boolean save(Customer c1) {
		if (c.contains(c1.getPhone())) {
			return false;
		}
		c.add(c1);
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cg.paytmWallet.repo.PaytmWalletRepo#findByPhone(java.lang.String)
	 */
	@Override
	public Customer findByPhone(String phoneNo) {
		for (Customer c1 : c) {
			if (c1.getPhone().equals(phoneNo))
				return c1;
		}
		return null;
	}
}
