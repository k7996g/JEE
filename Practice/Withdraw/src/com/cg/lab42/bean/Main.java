package com.cg.lab42.bean;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          SavingAccount s=new SavingAccount();
          System.out.println(s.withdraw(200));
          CurrentAccount c=new CurrentAccount();
          System.out.println(c.withdraw(2000));
	}

}
