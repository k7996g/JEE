package com.cg.ems.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TestOneToOneDemo {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntiManager();
		EntityTransaction tran = em.getTransaction();
		Address vAddress = new Address();
		vAddress.setCity("Pune");
		vAddress.setState("Maharashtra");
		vAddress.setStreet("Sinhagad Road");
		vAddress.setZipcode("411041");
		
		Address rAddress = new Address();
		rAddress.setCity("Mathura");
		rAddress.setState("UP");
		rAddress.setZipcode("281406");
		rAddress.setStreet("Choumuhah");
		
		Student vinita = new Student();
		vinita.setStuName("Vinita lalawani");
		vinita.setStuAddress(vAddress);
		
		Student rahul = new Student();
		rahul.setStuName("rahul chauhan");
		rahul.setStuAddress(rAddress);
		
		tran.begin();
		em.persist(vinita);
		em.persist(rahul);
		tran.commit();
		System.out.println("Data is inserted");

	}
}
