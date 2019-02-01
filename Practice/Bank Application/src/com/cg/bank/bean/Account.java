package com.cg.bank.bean;

public class Account {
     private int accNumber;
     private int amount;
	public Account(int accNumber, int amount) {
		super();
		this.accNumber = accNumber;
		this.amount = amount;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
     
}
