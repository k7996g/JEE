package collections.shoppingcart;

import java.util.*;

public class Products {
	final List<Product> a = new LinkedList<Product>();

	Products() {
		storeItems();
	}

	public void storeItems() {
		String[] productNames = { "Samsung", "MI", "Moto" };
		int[] productId = { 100, 101, 102 };
		int[] productPrice = { 15000, 12000, 13000 };
		int[] stock = { 6, 2, 4 };
		for (int i = 0; i < 3; i++)
			a.add(new Product(productId[i], productNames[i], productPrice[i], stock[i]));
	}

	public void getItemsById(int id) {
		int n = a.size();
		for (int i = 0; i < n; i++) {
			if (a.get(i).getPid() == id) {
				System.out.println("Product Name is: " + a.get(i).getPname());
				System.out.println("Product Price is: " + a.get(i).getPrice());
				System.out.println("The stock for this Product is: " + a.get(i).getStock());
			}
		}
	}
	public List<Product>getProducts()
	{return a;}
}
