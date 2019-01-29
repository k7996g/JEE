package com.cg.eis.bean;

public class Employee {
     private int empid;
     private String ename;
     private int salary;
     private String designation;
     private String insurancescheme;
	public Employee(int empid, String ename, int salary, String designation,String insurancescheme) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.designation = designation;
		this.insurancescheme=insurancescheme;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsurancescheme() {
		return insurancescheme;
	}
	public void setInsurancescheme(String insurancescheme) {
		this.insurancescheme = insurancescheme;
	}
     
}
