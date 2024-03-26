package sec01;

import java.util.ArrayList;
import java.util.List;

public class ProductStreamEx {

	public static void main(String[] args) {
		
		List<Product> products= new ArrayList<>();
		
		
		products.add(0, new Product(1,"상품1","그린", 1000));
		products.add(1, new Product(2,"상품2","그린", 2000));
		products.add(2, new Product(3,"상품3","그린", 3000));
		
		
		products.stream().forEach( (obj) -> { System.out.println(obj);});
		
		
	}

}
