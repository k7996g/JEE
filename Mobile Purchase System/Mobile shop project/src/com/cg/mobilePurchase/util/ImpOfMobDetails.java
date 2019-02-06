package com.cg.mobilePurchase.util;

import java.util.LinkedList;
import com.cg.mobilePurchase.bean.MobileDetails;
import java.util.Random;

public class ImpOfMobDetails implements MobDetails {

	LinkedList<MobileDetails> mobDetails = new LinkedList<MobileDetails>();
	Random rand = new Random();

	public ImpOfMobDetails() {
		addMobileDetails();
	}

	public void addMobileDetails() {
		String mobNames[] = { "Samsung", "MI", "Moto", "Apple", "One+" };

		int mobStock[] = { 10, 4, 6, 15, 14 };
		double mobPrice[] = { 15000, 12000, 14000, 50000, 30000 };
		int x = 0;
		for (int j = 0; j < 5; j++)
			for (int i = 0; i < mobStock[j]; i++) {
				x = rand.nextInt(9999) + 1000;
				mobDetails.add(new MobileDetails(x, mobNames[j], mobPrice[j], 1));

			}

	}

	public LinkedList<MobileDetails> getMobileList() {

		return mobDetails;

	}

	public void deleteMobById(int id) {
		for (int i = 0; i < mobDetails.size(); i++) {
			if (mobDetails.get(i).getMobId() == id) {
				int j = mobDetails.get(i).getStock();
				mobDetails.get(i).setStock(j - 1);
			}
		}
	}

	public void availableMobiles() {
		for (MobileDetails m : mobDetails)
			System.out.println("Mob name is: " + m.getMobName() + "Mob price is: " + m.getMobPrice() + "Mob stock is: "
					+ m.getStock());
	}
}
