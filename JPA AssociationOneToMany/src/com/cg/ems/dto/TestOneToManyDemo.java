package com.cg.ems.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TestOneToManyDemo {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntiManager();
		EntityTransaction tran = em.getTransaction();
		Department d1 = new Department();
		d1.setDeptcode(10);
		d1.setDeptName("Admin");

		Department d2 = new Department();
		d2.setDeptcode(20);
		d2.setDeptName("Sales");

		Employee e1 = new Employee();
		e1.setEmpid(111);
		e1.setEmpName("Kaushal Garg");
		e1.setEmpSal(90000.0f);
		e1.setEmpDept(d1);
		Set<Employee> adminEmpSet = new HashSet<Employee>();
		Set<Employee> salesEmpSet = new HashSet<Employee>();
		adminEmpSet.add(e1);

		Employee e2 = new Employee();
		e2.setEmpid(222);
		e2.setEmpName("Bhawana Singh");
		e2.setEmpSal(50000.0f);
		e2.setEmpDept(d2);
		adminEmpSet.add(e2);

		Employee e3 = new Employee();
		e3.setEmpid(333);
		e3.setEmpName("VaishaliS");
		e3.setEmpSal(90000.0f);
		e3.setEmpDept(d1);
		salesEmpSet.add(e3);

		d1.setEmpSet(adminEmpSet);
		d2.setEmpSet(salesEmpSet);

		tran.begin();
		em.persist(d1);
		em.persist(d2);
		// em.persist(e3);
		tran.commit();
		System.out.println("Department Persisted");
	}

}
