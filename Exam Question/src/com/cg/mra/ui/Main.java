package com.cg.mra.ui;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.cg.mra.exception.PhoneNumberNotFoundException;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;

public class Main {

	public static void main(String[] args) {
		showMenu();

	}

	public static void showMenu() {
		while(true)
		{System.out.println("Enter 1 for Account Balance Enquiry");
		System.out.println("Enter 2 for recharge");
		System.out.println("Enter 3 for exit");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			accountBalanceEnquiry();
			break;
		case 2:
			rechargeMobile();
			break;
		case 3:
			System.exit(0);
			break;
		default:System.out.println("Wrong Choice");		
		}
		}
	}

	public static void accountBalanceEnquiry() {
		Scanner scanner = new Scanner(System.in);

		String mobileNo;
		while (true) {
			System.out.println("Enter your mobile no");
			mobileNo = scanner.next();
			if (Pattern.matches("[0-9]{10}", mobileNo))
				break;
			else
				System.out.println("Your mobile no is wrong, please give another one!");
		}
		try {
			AccountService accountService = new AccountServiceImpl(mobileNo);
		} catch (PhoneNumberNotFoundException e) {
			System.out.println("There is no customer with this phone no");
		}
	}

	public static void rechargeMobile() {
		Scanner scanner = new Scanner(System.in);
		String mobileNo;

		while (true) {
			System.out.println("Enter your mobile no");
			mobileNo = scanner.next();
			if (Pattern.matches("[0-9]{10}", mobileNo))
				break;
			else
				System.out.println("Your mobile no is wrong, please give another one!");
		}
		System.out.println("Enter the amount");
		double amount = scanner.nextDouble();
		try {
			AccountService accountService = new AccountServiceImpl(mobileNo);

			accountService.rechargeAccount(mobileNo, amount);
		} catch (PhoneNumberNotFoundException e) {
			System.out.println("There is no customer with this phone no");

		}

	}
}
