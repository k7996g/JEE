package com.cg.ems.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.cg.ems.dto.Employee;
import com.cg.ems.util.JPAUtil;

public class EmployeeDaoImpl implements EmployeeDao {
	EntityManager em = null;
	EntityTransaction entityTran = null;

	public EmployeeDaoImpl() {
		em = JPAUtil.getEntiManager();
		entityTran = em.getTransaction();
	}

	@Override
	public Employee addEmp(Employee emp) {
		entityTran.begin();
		em.persist(emp);
		entityTran.commit();
		return emp;
	}

	@Override
	public ArrayList<Employee> fetchAllEmp() {
		String selAllQry = "select emps from Employee emps";
		TypedQuery<Employee> tq = em.createQuery(selAllQry, Employee.class);
		ArrayList<Employee> empList = (ArrayList<Employee>) tq.getResultList();
		return empList;
	}

	@Override
	public Employee deleteEmp(int empId) {
		Employee e1 = em.find(Employee.class, empId);
		entityTran.begin();
		em.remove(e1);
		entityTran.commit();
		return e1;
	}

	@Override
	public Employee getEmpbyEid(int empId) {
		Employee e = em.find(Employee.class, empId);
		return e;
	}

	@Override
	public Employee updateEmp(int empId, String empName, float empSal) {
		Employee e = em.find(Employee.class, empId);
		entityTran.begin();
		e.setEmpName(empName);
		e.setEmpSal(empSal);
		em.merge(e);
		entityTran.commit();
		return e;
	}

}
