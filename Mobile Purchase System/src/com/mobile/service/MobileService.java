package com.mobile.service;

import com.mobileDetails.bean.*;
import java.util.*;

public class MobileService {
	LinkedList<MobileDetails> mobDetails = new LinkedList<MobileDetails>();

	public MobileService() {
		addMobileDetails();
	}

	Random rand = new Random();

	public void addMobileDetails() {
		String mobNames[] = { "Samsung", "MI", "Moto", "Apple", "OnePlus+" };
		int x = rand.nextInt(9999) + 1000;
		int mobStock[] = { 10, 4, 6, 15, 14 };
		double mobPrice[] = { 15000, 12000, 14000, 50000, 30000 };
		for (int i = 0; i < 5; i++)
			mobDetails.add(new MobileDetails(x, mobNames[i], mobPrice[i], mobStock[i]));
	}

	public void deleteMobById(int id) {
		for (int i = 0; i < mobDetails.size(); i++) {
			if (mobDetails.get(i).getMobId() == id) {
				int j = mobDetails.get(i).getStock();
				mobDetails.get(i).setStock(j - 1);
			}
		}
	}

	public void showMobileByRange(int startingRange, int MaxRange) {
		ArrayList<String> mobName = new ArrayList<String>();
		ArrayList<Double> mobPrice = new ArrayList<Double>();
		ArrayList<Integer> mobStock = new ArrayList<Integer>();
		int f = 0;
		for (int i = 0; i < mobDetails.size(); i++)

		{
			if (mobDetails.get(i).getMobPrice() >= startingRange && mobDetails.get(i).getMobPrice() <= MaxRange) {
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

	public void MobilesAvailableWithPriceAndName() {
		for (MobileDetails m : mobDetails)
			System.out.println(m);
	}

	public LinkedList<MobileDetails> getMobileList() {
		return mobDetails;
	}
}
