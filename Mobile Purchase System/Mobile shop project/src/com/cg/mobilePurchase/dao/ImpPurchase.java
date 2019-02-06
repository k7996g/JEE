package com.cg.mobilePurchase.dao;

import com.cg.mobilePurchase.bean.MobileDetails;
import com.cg.mobilePurchase.service.ImpCustomer;
import com.cg.mobilePurchase.util.ImpOfMobDetails;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ImpPurchase implements Purchase {
	LinkedList<MobileDetails> mobDetails = new LinkedList<>();

	@Override
	public void showMobileByRange(int startingRange, int maxRange) {
		mobDetails = new ImpOfMobDetails().getMobileList();
		// System.out.println(mobDetails.get(0).getMobPrice());
		//System.out.println(mobDetails.size());
		ArrayList<String> mobName = new ArrayList<String>();
		ArrayList<Double> mobPrice = new ArrayList<Double>();
		ArrayList<Integer> mobStock = new ArrayList<Integer>();
		int f = 0;
		for (int i = 0; i < mobDetails.size(); i++)

		{
			if (mobDetails.get(i).getMobPrice() >= startingRange && mobDetails.get(i).getMobPrice() <= maxRange) {
				mobName.add(mobDetails.get(i).getMobName());
				mobPrice.add(mobDetails.get(i).getMobPrice());
				mobStock.add(mobDetails.get(i).getStock());

				f = 1;
			}
		}
		if (f == 1) {
			System.out.println("Mobile names are: " + mobName);
			System.out.println("Mobile prices respectively are: " + mobPrice);
			System.out.println("Mobile Stocks respectively are: " + mobStock);
		} else
			System.out.println("Sorry sir we dont have mobile in this range");
	}

	@Override
	public int purchase(String mobname) {
		LinkedList<MobileDetails> a1 = new ImpOfMobDetails().getMobileList();

		ImpCustomer customer = new ImpCustomer();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < a1.size(); i++) {
			if (a1.get(i).getMobName().equals(mobname)) {

				if (a1.get(i).getStock() > 0) {
					System.out.println("Stock is available");

					System.out.println("Do you want to purchase it if yes then enter 1 and if no then enter 0");
					int choice = scanner.nextInt();
					if (choice == 1) {
						a1.get(i).setStock(a1.get(i).getStock() - 1);
						return 1;
					} else {
						System.out.println("Thank you for visiting");
						break;
					}

				} else {
					System.out.println("Stock is not available");

				}
			}
		}
		return 0;
	}

}
