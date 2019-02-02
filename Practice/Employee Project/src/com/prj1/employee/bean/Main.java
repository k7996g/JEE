package com.prj1.employee.bean;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccSch a[] = new AccSch[4];
		a[0] = new AccSch();
		a[1] = new AccSch();
		System.out.println(a[0].createAccount(Integer.parseInt(args[0]), "kaushal", "12/10/2015", 'e', "Engg", 50000,
				20000, 20000));

		a[0].setDaAndDesignation('e');
		a[0].showDetails(Integer.parseInt(args[0]));
		System.out.println(
				a[1].createAccount(Integer.parseInt(args[1]), "keshav", "12/10/2016", 'm', "Man", 70000, 22000, 18000));
		a[1].setDaAndDesignation('m');
		a[1].showDetails(Integer.parseInt(args[1]));
		System.out.println(a[1].salary(Integer.parseInt(args[1])));
		new AccSch().showDetails(102);
	}

}
