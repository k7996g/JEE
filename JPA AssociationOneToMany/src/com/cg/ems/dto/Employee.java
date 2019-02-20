package com.cg.ems.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emp_master")
public class Employee {
	@Id
	@Column(name = "emp_id", length = 10)
	private int empid;

	@Column(name = "emp_name", length = 25)
	private String empName;

	@Column(name = "emp_sal", length = 10)
	private float empSal;

	@ManyToOne
	@JoinColumn(name = "dept_code")
	private Department empDept;

	public Employee(int empid, String empName, float empSal, Department empDept) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empSal = empSal;
		this.empDept = empDept;
	}

	public Department getEmpDept() {
		return empDept;
	}

	public void setEmpDept(Department empDept) {
		this.empDept = empDept;
	}

	public Employee(int empid, String empName, float empSal) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empSal = empSal;
	}

	public Employee() {
		super();

	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

}
