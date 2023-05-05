import java.util.Iterator;
import java.util.LinkedHashSet;

public class ProductCart {
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setId(12);
		p1.setName("Mobile");
		p1.setPrice(34444);
		p1.setQuantity(1);
		
		Product p2 = new Product();
		p2.setId(121);
		p2.setName("Headphone");
		p2.setPrice(344);
		p2.setQuantity(2);
		
		
		LinkedHashSet<Product> cart = new LinkedHashSet<Product>();
		cart.add(p1);
		cart.add(p2);
		
		//System.out.println(cart);
		
		/*
		Iterator<Product> it = cart.iterator();
		while(it.hasNext()) {
			Product obj = it.next();
			System.out.println("Id " + obj.getId());
			System.out.println("Name " + obj.getName());
			System.out.println("Price " + obj.getPrice());
			System.out.println("Quantity " + obj.getQuantity());
			System.out.println("---------------------------------------");
		}
		*/
		
		for(Product obj : cart) {
			System.out.println("Id " + obj.getId());
			System.out.println("Name " + obj.getName());
			System.out.println("Price " + obj.getPrice());
			System.out.println("Quantity " + obj.getQuantity());
			System.out.println("---------------------------------------");
		}
	}
}
























