package com.prj1.employee.bean;

public class Account {
	private int empno;
	private String empname;
	private String joindate;
	private char descode;
	private String dep;
	private int basic;
	private int hra;
	private int it;
	private String des;
	private int da;
	private int  salary;

	public Account(int empno, String empname, String joindate, char descode, String dep, int basic, int hra, int it) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.joindate = joindate;
		this.descode = descode;
		this.dep = dep;
		this.basic = basic;
		this.hra = hra;
		this.it = it;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getJoindate() {
		return joindate;
	}

	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}

	public char getDescode() {
		return descode;
	}

	public void setDescode(char descode) {
		this.descode = descode;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public int getBasic() {
		return basic;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	public int getHra() {
		return hra;
	}

	public void setHra(int hra) {
		this.hra = hra;
	}

	public int getIt() {
		return it;
	}

	public void setIt(int it) {
		this.it = it;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public int getDa() {
		return da;
	}

	public void setDa(int da) {
		this.da = da;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
