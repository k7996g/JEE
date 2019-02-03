package collections.shoppingcart;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Products p = new Products();
		p.getItemsById(100);
		System.out.println(p.getProducts());
		
		  Cart c = new Cart();
		  c.showItemsOfCart();
		  Cart c1=new Cart();
		  c1.showItemsOfCart();
		
		 
	}

}
