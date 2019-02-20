package com.cg.ems.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "dept_master")
public class Department {
	@Id
	@Column(name = "dept_code", length = 10)
	private int deptcode;

	@Column(name = "dept_name", length = 25)
	private String deptName;

	@OneToMany(cascade = CascadeType.ALL, mappedBy ="empDept")
	private Set<Employee> empSet = new HashSet<Employee>();

	public Set<Employee> getEmpSet() {
		return empSet;
	}

	public void setEmpSet(Set<Employee> empSet) {
		this.empSet = empSet;
	}

	public Department(int deptcode, String deptName) {
		super();
		this.deptcode = deptcode;
		this.deptName = deptName;
	}

	public Department() {
		super();

	}

	public int getDeptcode() {
		return deptcode;
	}

	public void setDeptcode(int deptcode) {
		this.deptcode = deptcode;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [deptcode=" + deptcode + ", deptName=" + deptName + "]";
	}

}
