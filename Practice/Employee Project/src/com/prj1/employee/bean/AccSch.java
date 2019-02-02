package com.prj1.employee.bean;

import java.util.*;

public class AccSch {
	LinkedList<Account> a = new LinkedList<Account>();

	public String createAccount(int empno, String empname, String joindate, char descode, String dep, int basic,
			int hra, int it) {
		Account a1 = new Account(empno, empname, joindate, descode, dep, basic, hra, it);
		a.add(a1);
		return "Account for employee created successfully";
	}

	public void setDaAndDesignation(char descode) {
		int n = a.size();
		for (int i = 0; i < n; i++) {
			switch (a.get(i).getDescode()) {
			case 'e':
				a.get(i).setDes("Engineer");
				a.get(i).setDa(20000);
				break;
			case 'c':
				a.get(i).setDes("Consultant");
				a.get(i).setDa(32000);
				break;
			case 'k':
				a.get(i).setDes("Clerk");
				a.get(i).setDa(12000);
				break;
			case 'r':
				a.get(i).setDes("Receptionist");
				a.get(i).setDa(15000);
				break;
			case 'm':
				a.get(i).setDes("Manager");
				a.get(i).setDa(40000);
				break;

			}
		}
	}

	public int salary(int empno) {
		int n = a.size();
		int salary = 0;
		for (int i = 0; i < n; i++) {
			if (a.get(i).getEmpno() == empno) {
				salary = a.get(i).getBasic() + a.get(i).getDa() + a.get(i).getHra() - a.get(i).getIt();
				a.get(i).setSalary(salary);
			}
		}
		return salary;
	}

	public void showDetails(int empno) {
		int n = a.size();
		for (int i = 0; i < n; i++) {
			if (a.get(i).getEmpno() == empno) {
				System.out.print(a.get(i).getEmpno()+" ");
				System.out.print(a.get(i).getEmpname()+" ");
				System.out.print(a.get(i).getDep()+" ");
				System.out.print(a.get(i).getDes()+" ");
				System.out.print(salary(empno)+" ");
			}
		}
	}

}
