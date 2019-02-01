package com.cg.bank.bean;
import com.cg.bank.bean.*;
import java.util.*;
public class ICICI {
       
	LinkedList<Account> a=new LinkedList<Account>();
	Account account[]=new Account[2];
	
	int index=0;
	int x=0;
	public void createAccount(int accNumber,int amount) throws InsufficientBalanceException
	{if(amount<500)
		throw new InsufficientBalanceException("Insufficient balance");
	else
		{account[index]=new Account(accNumber,amount);
		x=index;index++;
		
		a.add(account[x]);}
		
	
	}
	public Account searchAccount(int accNumber) throws InvalidAccountNumber
	{for(int i=0;i<index;i++)
	{if(a.get(i).getAccNumber()==accNumber)
	{return a.get(i);
	}
	}
		throw new InvalidAccountNumber("Invalid Account Number");}
		
	public void deposit(int accNumber,int amount) throws InvalidAccountNumber
	{ Account account=searchAccount(accNumber);
	int x=account.getAmount()+amount;
	account.setAmount(x);
	System.out.println(x);
	}
	public void withdraw(int accNumber,int amount) throws InvalidAccountNumber,InsufficientRemainingBalanceException
	{Account account=searchAccount(accNumber);
	if(account.getAmount()-amount>0)
	{int x=account.getAmount()-amount;
	account.setAmount(x);
	return;
	}
	throw new InsufficientRemainingBalanceException("Insufficient remaining balance");
	}
    public String fundTransfer(int amount,int raccNumber,int gaccNumber) throws InvalidAccountNumber,InsufficientRemainingBalanceException
    {Account account1=searchAccount(raccNumber);
    Account account2=searchAccount(gaccNumber);
    withdraw(gaccNumber,amount);
    deposit(raccNumber,amount);
    return "Fund transfer successfully";
    }
}

