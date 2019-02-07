package com.cg.mra.ui;

import java.util.Scanner;

import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;

public class Main {

	public static void main(String[] args) {
		showMenu();

	}

	public static void showMenu() {
		System.out.println("Enter 1 for Account Balance Enquiry");
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
		}
	}

	public static void accountBalanceEnquiry() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your mobile no");
		String mobileNo = scanner.next();
		AccountService accountService = new AccountServiceImpl(mobileNo);
	}

	public static void rechargeMobile() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your mobile no");
		String mobileNo = scanner.next();
		System.out.println("Enter the amount");
		double amount = scanner.nextDouble();
		AccountService accountService = new AccountServiceImpl(mobileNo);
		accountService.rechargeAccount(mobileNo, amount);
	}
}
