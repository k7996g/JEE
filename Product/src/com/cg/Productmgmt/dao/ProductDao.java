package com.cg.Productmgmt.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProductDao implements IProductDao {
	static Map<String, String> productDetails;
	static Map<String, Integer> salesDetails;
	static {
		productDetails = new HashMap<>();
		productDetails.put("lux", "soap");
		productDetails.put("colgate", "paste");
		productDetails.put("pears", "soap");
		productDetails.put("sony", "electronics");
		productDetails.put("samsung", "electronics");
		productDetails.put("facepack", "cosmatics");
		productDetails.put("facecream", "cosmatics");

		salesDetails = new HashMap<>();
		salesDetails.put("lux", 100);
		salesDetails.put("colgate", 50);
		salesDetails.put("pears", 70);
		salesDetails.put("sony", 10000);
		salesDetails.put("samsung", 23000);
		salesDetails.put("facepack", 100);
		salesDetails.put("facecream", 60);
	}

	@Override
	public int updateProducts(String category, int hike) {
		// TODO Auto-generated method stub
		ArrayList<String> s=new ArrayList<>();
		int f=0;
		int i = 0;
		for (Map.Entry<String, String> m : productDetails.entrySet()) {
			if (m.getValue().equals(category))
				s.add(m.getKey());
		}
        for(int j=0;j<s.size();j++)
		for (Map.Entry<String, Integer> m : salesDetails.entrySet()) {
			if (m.getKey().equals(s.get(j))) {
				i = salesDetails.get(m.getKey());
				i += hike;
				salesDetails.replace(m.getKey(), i);
				f=1;
			}
		}
		if(f==1)
			return 1;
		else
		return 0;
	}

	@Override
	public Map<String, Integer> getProductList() {
		// TODO Auto-generated method stub
		
		return salesDetails;
	}

}
