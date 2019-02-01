package com.cg.bank.bean;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ICICI bank=new ICICI();
	      try{
	    	  bank.createAccount(100,1000);
	    	  bank.createAccount(101, 1000);
	    	  bank.deposit(100, 5000);
	    	  bank.fundTransfer(500, 101, 100);
	      }
	      catch(InsufficientBalanceException e)
	      {System.out.println("Insufficient opening balance");}
	      catch(InvalidAccountNumber e)
	      {System.out.println("Invalid account number");}
	      catch(Exception e)
	      {System.out.println("Insufficient remaining balance");}
	}

}
