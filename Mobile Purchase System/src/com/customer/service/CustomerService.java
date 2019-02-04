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

	public void addCustDetails() {
		CustomerDetails customer = new CustomerDetails();
		Scanner scanner = new Scanner(System.in);
		boolean c = true;
		while (c) {
			System.out.println("Customer Name: ");
			String name = scanner.next();
			if (Pattern.matches("[A-Z]{1}[a-z]{1,19}", name))
				customer.setCusName(name);
			else
				System.out.println("Name is in proper format");
			System.out.println("Customer Mail id: ");
			String mailId = scanner.next();
			if (Pattern.matches("[a-zA-Z]{1,}[.][a-zA-Z]{1,}[@]gmail.com", mailId)) {
				customer.setCusMailId(mailId);

			} else
				System.out.println("Sir your mail id is wrong");
			System.out.println("Customer PhoneNo: ");
			String no = scanner.next();
			if (Pattern.matches("[0-9]{10}", no))
				customer.setCusPhoneNo(no);
			else
				System.out.println("Sir your phone no is wrong");
			Random rand = new Random();
			customer.setPurchaseId(rand.nextInt(1000) + 1);
			customer.setPurchaseDate(LocalDateTime.now());
			LinkedList<MobileDetails> a1 = new MobileService().getMobileList();
			System.out.println("Enter the mobile which you want to purchase");
			String mobname = scanner.next();
			for (int i = 0; i < a1.size(); i++) {
				if (a1.get(i).getMobName().equals(mobname))
					customer.setCusMobileId(a1.get(i).getMobId());
				else if (a1.get(i).getMobName().equals(mobname))
					customer.setCusMobileId(a1.get(i).getMobId());
				else if (a1.get(i).getMobName().equals(mobname))
					customer.setCusMobileId(a1.get(i).getMobId());
				else if (a1.get(i).getMobName().equals(mobname))
					customer.setCusMobileId(a1.get(i).getMobId());
				else if (a1.get(i).getMobName().equals(mobname))
					customer.setCusMobileId(a1.get(i).getMobId());
				else
					System.out.println("There is no such mobile with this mobile name");
			}
			c = false;
		}
	}
}
