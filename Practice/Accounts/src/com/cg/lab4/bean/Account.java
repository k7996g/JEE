package com.cg.lab4.bean;

public class Account {
       private long accNum;
       private double balance;
       Person accHolder;
	public Account(long accNum, double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
     public void deposit(double balance)
     {this.balance+=balance;
     System.out.println("After Deposit:"+this.balance);
     }
     public void withdraw(double balance)
     {this.balance-=balance;
     System.out.println("After Withdraw:"+this.balance);
     }


	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance
				+ ", accHolder=" + accHolder + "]";
	}
     
}
