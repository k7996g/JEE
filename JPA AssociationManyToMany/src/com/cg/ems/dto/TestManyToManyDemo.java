package com.cg.ems.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TestManyToManyDemo {
	public static void main(String args[]) {
		EntityManager em = JPAUtil.getEntiManager();
		EntityTransaction tran = em.getTransaction();
		Product p1 = new Product();
		p1.setProductCode(100);
		p1.setProductName("TV");
		p1.setProductPrice(35000);

		Product p2 = new Product();
		p2.setProductCode(200);
		p2.setProductName("Refrigerator");
		p2.setProductPrice(56000);

		Product p3 = new Product();
		p3.setProductCode(300);
		p3.setProductName("CD");
		p3.setProductPrice(200);

		Product p4 = new Product();
		p4.setProductCode(400);
		p4.setProductName("Laptop Bags");
		p4.setProductPrice(4500);

		Supplier sony = new Supplier();
		sony.setSupplierId(111);
		sony.setSupplyDate(new Date());

		Supplier lg = new Supplier();
		lg.setSupplierId(222);
		lg.setSupplyDate(new Date(2018, 12, 04));

		Set<Product> elecProSet = new HashSet<Product>();
		elecProSet.add(p1);
		elecProSet.add(p2);
		elecProSet.add(p3);
		elecProSet.add(p4);
		Set<Supplier> suppSet = new HashSet<Supplier>();
		suppSet.add(sony);
		suppSet.add(lg);
		sony.setProductSet(elecProSet);

		p1.setSupSet(suppSet);
		tran.begin();
		em.persist(p1);
		tran.commit();
		System.out.println("product is inserted");
	}
}
