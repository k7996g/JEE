package com.customer.service;

import com.CustomerDetails.bean.*;
import com.mobile.service.*;
import com.mobileDetails.bean.*;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.*;
import java.util.regex.Pattern;

public class CustomerService {
	LinkedList<CustomerDetails> cusDetails = new LinkedList<CustomerDetails>();
	String mobname = "";
	int x = 0;

	public void purchase(String mobname) {
		LinkedList<MobileDetails> a1 = new MobileService().getMobileList();
		int f = 0;
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < a1.size(); i++) {
			if (a1.get(i).getMobName().equals(mobname)) {
				if (a1.get(i).getStock() > 0) {
					System.out.println("Stock is available");
					x = 1;
					System.out.println("Do you want to purchase it if yes then enter 1 and if no then enter 0");
					int choice = scanner.nextInt();
					if (choice == 1) {
						if (x == 1)
							addCustDetails(mobname);
					} else {
						System.out.println("Thank you for visiting");
						break;
					}
					a1.get(i).setStock(a1.get(i).getStock() - 1);
				} else {
					System.out.println("Stock is not available");
					f = 1;
				}
				if (f == 1) {
					System.out.println("These are all the mobiles which we have so please give name from this");
					new MobileService().MobilesAvailableWithPriceAndName();
					System.out.println("Enter the mobile from the list whivh you want to purchase");

					String s = scanner.next();
					purchase(s);
				}
			}
		}

	}

	public void addCustDetails(String mobname) {
		CustomerDetails customer = new CustomerDetails();
		Scanner scanner = new Scanner(System.in);
		boolean c = true;
		int f1 = 0;
		while (c) {
			System.out.println("Customer Name: ");
			String name = scanner.next();
			if (Pattern.matches("[A-Z]{1}[a-z]{1,19}", name)) {
				customer.setCusName(name);
				f1 = 1;
			} else {
				System.out.println("Name is not in proper format");
				break;
			}
			System.out.println("Customer Mail id: ");
			String mailId = scanner.next();
			if (Pattern.matches("[a-zA-Z]{1,}[.][a-zA-Z]{1,}[@]gmail.com", mailId)) {
				customer.setCusMailId(mailId);
				f1 = 1;

			} else {
				System.out.println("Sir your mail id is wrong");
				break;
			}
			System.out.println("Customer PhoneNo: ");
			String no = scanner.next();
			if (Pattern.matches("[0-9]{10}", no)) {
				customer.setCusPhoneNo(no);
				f1 = 1;
			} else {
				System.out.println("Sir your phone no is wrong");
				break;
			}
			Random rand = new Random();
			customer.setPurchaseId(rand.nextInt(1000) + 1);
			customer.setPurchaseDate(LocalDateTime.now());
			LinkedList<MobileDetails> a1 = new MobileService().getMobileList();

			int f = 0;
			for (int i = 0; i < a1.size(); i++) {
				if (a1.get(i).getMobName().equals(mobname)) {
					customer.setCusMobileId(a1.get(i).getMobId());
					f = 1;
					break;
				}
			}
			if (f == 0)
				System.out.println("There is no such mobile with this mobile name");

			c = false;
		}
		if (f1 == 1) {
			cusDetails.add(customer);
			System.out.println("Customer details are: ");
			System.out.println("Customer name:" + cusDetails.get(cusDetails.size() - 1).getCusName() + "\n"
					+ "Customer Mail id " + cusDetails.get(cusDetails.size() - 1).getCusMailId() + "\n"
					+ "Customer mobile id " + cusDetails.get(cusDetails.size() - 1).getCusMobileId() + "\n"
					+ "Customer phone no " + cusDetails.get(cusDetails.size() - 1).getCusPhoneNo() + "\n"
					+ "Customer purchase id " + cusDetails.get(cusDetails.size() - 1).getPurchaseId() + "\n"
					+ "Customer purchase date " + cusDetails.get(cusDetails.size() - 1).getPurchaseDate());
		}
	}
}
