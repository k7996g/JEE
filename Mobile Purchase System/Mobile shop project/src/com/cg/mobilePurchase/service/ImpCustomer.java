package com.cg.mobilePurchase.service;

import com.cg.mobilePurchase.bean.CustomerDetails;
import com.cg.mobilePurchase.bean.MobileDetails;
import com.cg.mobilePurchase.util.ImpOfMobDetails;

import java.util.LinkedList;
import java.util.Random;
import java.util.regex.Pattern;
import java.time.LocalDateTime;

public class ImpCustomer implements Customer {
	LinkedList<MobileDetails> a1 = new LinkedList<>();

	LinkedList<CustomerDetails> cusDetails = new LinkedList<CustomerDetails>();
	CustomerDetails customer = new CustomerDetails();
	int f1 = 0;

	@Override
	public void addCustName(String name) {
		if (Pattern.matches("[A-Z]{1}[a-z]{1,19}", name)) {
			customer.setCusName(name);
			f1 = 1;
		} else {
			System.out.println("Name is not in proper format");

		}

	}

	@Override
	public void addCustMailId(String mailId) {
		if (Pattern.matches("[a-zA-Z0-9]{1,}[.]{0,}[a-zA-Z0-9]{1,}[@][a-zA-Z]{1,}.com", mailId)) {
			customer.setCusMailId(mailId);
			f1 = 1;

		} else {
			System.out.println("Sir your mail id is wrong");

		}

	}

	@Override
	public void addCustMobNo(String no) {
		if (Pattern.matches("[0-9]{10}", no)) {
			customer.setCusPhoneNo(no);
			f1 = 1;
		} else {
			System.out.println("Sir your phone no is wrong");

		}

	}

	@Override
	public void addCustPurchaseDate() {
		customer.setPurchaseDate(LocalDateTime.now());

	}

	@Override
	public void addCustPurchaseId() {
		Random rand = new Random();
		customer.setPurchaseId(rand.nextInt(1000) + 1);

	}

	@Override
	public void addCustMobId(String name) {
		a1 = new ImpOfMobDetails().getMobileList();
		System.out.println(a1.size());
		int f = 0;
		for (int i = 0; i < a1.size(); i++) {
			if (a1.get(i).getMobName().equals(name)) {
				customer.setCusMobileId(a1.get(i).getMobId());
				f = 1;
				f1 = 1;
				// System.out.println(a1.get(i).getMobId());
				break;
			}
		}
		if (f == 0)
			System.out.println("There is no such mobile with this mobile name");
		if (f1 == 1) {
			cusDetails.add(customer);
		}

	}

	public void getCustomerDetails(String name) {
		//System.out.println(cusDetails.size());
		for (int i = 0; i < cusDetails.size(); i++) {
			if (cusDetails.get(i).getCusName().equals(name)) {
				System.out.println("Customer name:" + cusDetails.get(cusDetails.size() - 1).getCusName() + "\n"
						+ "Customer Mail id " + cusDetails.get(cusDetails.size() - 1).getCusMailId() + "\n"
						+ "Customer mobile id " + cusDetails.get(cusDetails.size() - 1).getCusMobileId() + "\n"
						+ "Customer phone no " + cusDetails.get(cusDetails.size() - 1).getCusPhoneNo() + "\n"
						+ "Customer purchase id " + cusDetails.get(cusDetails.size() - 1).getPurchaseId() + "\n"
						+ "Customer purchase date " + cusDetails.get(cusDetails.size() - 1).getPurchaseDate());
			}
		}
	}
}
