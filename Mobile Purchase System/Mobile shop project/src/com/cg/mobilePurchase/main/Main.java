package com.cg.mobilePurchase.main;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.cg.mobilePurchase.dao.ImpPurchase;
import com.cg.mobilePurchase.service.ImpCustomer;
import com.cg.mobilePurchase.util.ImpOfMobDetails;
import com.cg.mobilePurchase.util.MobDetails;

public class Main {

	public static void main(String[] args) {
		ImpOfMobDetails c = new ImpOfMobDetails();
		// ImpCustomer customer = new ImpCustomer();

		System.out.println("Enter 1 for getting list of mobile by range");
		System.out.println("Enter 2 for getting list of all mobiles");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			showMobilebyRange();
			break;
		case 2:
			gettingList();
		}

	}

	public static void showMobilebyRange() {
		System.out.println("Enter your starting range");
		Scanner scanner = new Scanner(System.in);

		int startingRange = scanner.nextInt();
		System.out.println("Enter your maximum range");
		int maxRange = scanner.nextInt();
		new ImpPurchase().showMobileByRange(startingRange, maxRange);
		System.out.println("Give name of the mobile which you want to purchase");
		String mobname = scanner.next();
		int n = new ImpPurchase().purchase(mobname);
		if (n == 1) {
			System.out.println("Please give your details");
			ImpCustomer impcustomer = new ImpCustomer();
			System.out.println("Enter your name");
			String name = scanner.next();
			impcustomer.addCustName(name);
			System.out.println("Enter the mail Id");
			String mailId = scanner.next();
			impcustomer.addCustMailId(mailId);
			System.out.println("Enter the mob no");
			String mobNo = scanner.next();
			impcustomer.addCustMobNo(mobNo);
			impcustomer.addCustPurchaseDate();
			impcustomer.addCustPurchaseId();
			impcustomer.addCustMobId(mobname);
			System.out.println("Do you want to see your details if yes then enter 1 ");
			int x = scanner.nextInt();
			if (x == 1)
				impcustomer.getCustomerDetails(name);
		}
	}

	public static void gettingList() {
		System.out.println("These are all the mobiles which we have so please give name from this");
		MobDetails obj = new ImpOfMobDetails();
		obj.availableMobiles();
		System.out.println("Enter the mobile name from the list which you want to purchase");
		Scanner scanner = new Scanner(System.in);
		String mobname = scanner.next();
		int n = new ImpPurchase().purchase(mobname);
		if (n == 1) {
			System.out.println("Please give your details");
			ImpCustomer impcustomer = new ImpCustomer();
			System.out.println("Enter your name");
			String name = scanner.next();
			impcustomer.addCustName(name);
			System.out.println("Enter the mail Id");
			String mailId = scanner.next();
			impcustomer.addCustMailId(mailId);
			System.out.println("Enter the mob no");
			String mobNo = scanner.next();
			impcustomer.addCustMobNo(mobNo);
			impcustomer.addCustPurchaseDate();
			impcustomer.addCustPurchaseId();
			impcustomer.addCustMobId(name);
			System.out.println("Do you want to see your details if yes then enter 1 ");
			int x = scanner.nextInt();
			if (x == 1)
				impcustomer.getCustomerDetails(name);
		}
	}
}
