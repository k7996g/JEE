package com.prj1.employee.bean;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccSch a = new AccSch();
		AccSch b = new AccSch();
		System.out.println(a.createAccount(100, "kaushal", "12/10/2015", 'e', "Engg", 50000, 20000, 20000));
		System.out.println(b.createAccount(101, "keshav", "12/10/2016", 'm', "manager", 70000, 22000, 18000));
		a.setDaAndDesignation('e');
		b.setDaAndDesignation('m');
		a.showDetails(100);
		b.showDetails(101);
	}

}
