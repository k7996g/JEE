package com.cg.lab42.bean;

public class SavingAccount extends Account {
    final int MINBALANCE=100;
    boolean withdraw(int balance)
    {if(balance<MINBALANCE)
    	return false;
    else
    	{this.balance-=balance;
        System.out.println("After Withdraw: "+this.balance);
        return true;}
    }
}
