package com.cg.Productmgmt.dao;

import java.util.Map;

public interface IProductDao {
public int updateProducts(String category,int hike);
public Map<String,Integer> getProductList();
}
