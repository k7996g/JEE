package com.cg.ParallelProject.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.cg.ParallelProject.bean.Account;
import com.cg.ParallelProject.dao.AccountDao;
import com.cg.ParallelProject.dao.AccountDaoImpl;
import com.cg.ParallelProject.exception.InsufficientBalanceAfterWithdrawException;
import com.cg.ParallelProject.util.Create;

class TestParallelProject {
	Create c = new Create();
	AccountDao a = new AccountDaoImpl();

	@Before
	public void runEachTimeBeforeTest() {
		System.out.println("Testing..............................");
	}

	@Test
	void test1Deposit() {
		Account account = new Account(1000, 6000);
		assertEquals(account, a.deposit(1000, 1000));
	}

	@Test
	void test2Deposit() {
		Account account = new Account(1001, 2000);
		assertEquals(account, a.deposit(1001, 1000));
	}

	@Test
	void test3Deposit() {
		Account account = new Account(1002, 6000);
		assertEquals(account, a.deposit(1002, 5200));
	}

	@Test
	void test4Deposit() {
		Account account = new Account(1003, 40000);
		assertEquals(account, a.deposit(1003, 39500));
	}

	@Test
	void test1WithDraw() {
		Account account = new Account(1000, 1000);
		try {
			assertEquals(account, a.withDraw(1000, 4000));
		} catch (InsufficientBalanceAfterWithdrawException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void test2WithDraw() {
		Account account = new Account(1000, 6000);
		try {
			assertEquals(account, a.withDraw(1000, 4600));
		} catch (InsufficientBalanceAfterWithdrawException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void testShowBalance() {
		Account account = new Account(1000, 5000);
		assertEquals(account, a.showBalance(1000));
	}
}
