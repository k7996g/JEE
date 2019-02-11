package com.cg.Productmgmt.dao;

public class Main {
public static void main(String args[])
{IProductDao a=new ProductDao();
a.updateProducts("soap",10);
System.out.println(a.getProductList());
}
}
