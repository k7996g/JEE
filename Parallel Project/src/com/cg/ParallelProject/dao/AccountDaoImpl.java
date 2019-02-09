package com.cg.ParallelProject.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.ParallelProject.bean.Account;
import com.cg.ParallelProject.exception.InsufficientBalanceAfterWithdrawException;
import com.cg.ParallelProject.util.Create;

public class AccountDaoImpl implements AccountDao {
	HashMap<Integer, Account> hm1 = new HashMap<>();
Create c=new Create();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cg.ParallelProject.dao.AccountDao#deposit(int, int)
	 */
	@Override
	public Account deposit(int accNo, int amount) {
		
		hm1 = c.getListOfAccount();
		for (Map.Entry m : hm1.entrySet()) {
			if (((Account) m.getValue()).getAccNo() == accNo) {
				((Account) m.getValue()).setAmount(((Account) m.getValue()).getAmount() + amount);
				return (Account) m.getValue();
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cg.ParallelProject.dao.AccountDao#withDraw(int, int)
	 */
	@Override
	public Account withDraw(int accNo, int amount) throws InsufficientBalanceAfterWithdrawException {
		
		hm1 = c.getListOfAccount();
		for (Map.Entry m : hm1.entrySet()) {
			if (((Account) m.getValue()).getAccNo() == accNo) {
				if ((((Account) m.getValue()).getAmount() - amount) > 500)
					((Account) m.getValue()).setAmount(((Account) m.getValue()).getAmount() - amount);
				else
					throw new InsufficientBalanceAfterWithdrawException();

				return (Account) m.getValue();
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cg.ParallelProject.dao.AccountDao#FundTransfer(int, int, int)
	 */
	@Override
	public void FundTransfer(int accNo1, int accNo2, int amount) throws InsufficientBalanceAfterWithdrawException {
		withDraw(accNo1, amount);
		deposit(accNo2, amount);
		System.out.println("Your balance is "+showBalance(accNo1));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cg.ParallelProject.dao.AccountDao#showBalance(int, int)
	 */
	@Override
	public Account showBalance(int accNo) {
		
		hm1 = c.getListOfAccount();
		for (Map.Entry m : hm1.entrySet()) {
			if (((Account) m.getValue()).getAccNo() == accNo) {
				return (Account) m.getValue();
			}
		}
		return null;
	}
}
