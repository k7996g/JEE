package com.cg.paytmWallet.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.cg.patmWallet.bean.Customer;
import com.cg.patmWallet.bean.Wallet;
import com.cg.paytmWallet.WalletService.PaytmWalletService;
import com.cg.paytmWallet.WalletService.PaytmWalletServiceImpl;
import com.cg.paytmWallet.repo.PaytmWalletRepo;
import com.cg.paytmWallet.repo.PaytmWalletRepoImpl;

class TestMethods {
	@Before
	public void runEveryTimeBeforeTest() {
		System.out.println("test run before create account");

	}

	@Test
	void test() {
		Wallet wallet = new Wallet();
		wallet.setBalance(1000);
		Customer customer = new Customer("kaushal", "7895764776", wallet);
		PaytmWalletService p = new PaytmWalletServiceImpl();
		assertEquals(customer, p.createAccount("kaushal", "7895764776", 1000));
	}

	@Test
	void test2() {
		Wallet wallet = new Wallet();
		wallet.setBalance(2000);
		Customer customer = new Customer("keshav", "8979875795", wallet);
		PaytmWalletService p = new PaytmWalletServiceImpl();
		assertEquals(customer, p.createAccount("keshav", "8979875795", 2000));
	}

	@Test
	void test3() {
		Wallet wallet = new Wallet();
		wallet.setBalance(1000);
		Customer customer = new Customer("kaushal", "7895764776", wallet);
		PaytmWalletService p = new PaytmWalletServiceImpl();
		p.createAccount("kaushal", "7895764776", 1000);
		assertEquals(customer, p.showBalance("7895764776"));
	}

	@Test
	void test4() {
		Wallet wallet = new Wallet();
		wallet.setBalance(1000);
		Customer customer = new Customer("kaushal", "7895764776", wallet);
		PaytmWalletService p = new PaytmWalletServiceImpl();
		p.createAccount("kaushal", "7895764776", 1000);
		PaytmWalletRepo p1 = new PaytmWalletRepoImpl();
		assertEquals(true, p1.save(customer));
	}

	@Test
	void test5() {
		Wallet wallet = new Wallet();
		wallet.setBalance(1000);
		Customer customer = new Customer("kaushal", "7895764776", wallet);
		PaytmWalletService p = new PaytmWalletServiceImpl();
		p.createAccount("kaushal", "7895764776", 1000);

		assertEquals(customer, p.find("7895764776"));
	}
}
