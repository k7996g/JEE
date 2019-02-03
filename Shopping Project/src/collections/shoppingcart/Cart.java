package collections.shoppingcart;

import java.util.*;

public class Cart {
	List<Product> a = new LinkedList<Product>();

	Cart() {
		
		
		addItemsToCart();
	
	}

	public void addItemsToCart() {
		List<Product> a1 = new Products().getProducts();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Id of item you want to add to the cart");
		int Id = scanner.nextInt();
		for (int i = 0; i < a1.size(); i++) {
			if (a1.get(i).getPid() == Id) {
				a.add(a1.get(i));
				break;
			}
		}
	}

	public void removeItemsFromCartById(int id) {
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).getPid() == id) {
				a.remove(i);
				break;
			}
		}
	}

	public void showItemsOfCart() {
		for (Product product : a)
			System.out.println(product.getPname());
	}
}
