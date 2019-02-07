package com.cg.paytmWallet.WalletRepo;

import java.util.LinkedList;

import com.cg.patmWallet.bean.Customer;
import com.cg.paytmWallet.WalletService.ImpWalletService;

public class ImpWalletRepo implements WalletRepo {
	LinkedList<Customer> c1 = new LinkedList<Customer>();

	public ImpWalletRepo() {
		boolean b = save();
		System.out.println(b);
	}

	@Override
	public boolean save() {
		c1 = new ImpWalletService().getList();

		if (c1.size() > 0)
			return true;
		return false;
	}

	@Override
	public Customer findByPhone(String phone) {
		System.out.println(c1.size());
		for (int i = 0; i < c1.size(); i++) {
			if (c1.get(i).getPhone().equals(phone))
				return c1.get(i);

		}
		return null;

	}
}
