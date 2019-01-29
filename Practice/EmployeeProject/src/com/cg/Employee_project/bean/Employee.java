package com.cg.Employee_project.bean;

public class Employee {
    private int empno;
    private String empname;
    private char desCode;
    private String depart;
    private int basic;
    private int hra;
    private int it;
    private String joindate;
	private DA o;
	
	
	public Employee(int empno, String empname, char desCode, String depart, int basic, int hra, int it,
			String joindate,DA o) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.desCode = desCode;
		this.depart = depart;
		this.basic = basic;
		this.hra = hra;
		this.it = it;
		this.joindate = joindate;
		this.o=o;
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
	public char getDesCode() {
		return desCode;
	}
	public void setDesCode(char desCode) {
		this.desCode = desCode;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
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

	public String getJoindate() {
		return joindate;
	}

	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
	
    
}
