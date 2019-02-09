package com.cg.ParallelProject.util;

import java.util.HashMap;

import com.cg.ParallelProject.bean.Account;

public class Create  {
	static HashMap<Integer, Account> hm = new HashMap<>();



	public Create() {
		super();
		
		
		hm.put(1, new Account(1000, 5000));
		hm.put(2, new Account(1001, 1000));
		hm.put(3, new Account(1002, 800));
		hm.put(4, new Account(1003, 500));
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cg.ParallelProject.util.InterfaeCreateAccount#createAccount(int,
	 * int)
	 */
	

	public HashMap<Integer, Account> getListOfAccount() {
		return hm;
	}
}
