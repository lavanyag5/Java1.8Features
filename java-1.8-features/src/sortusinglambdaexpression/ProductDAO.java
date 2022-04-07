package sortusinglambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

	public List<Product> getProducts() {

		List<Product> products = new ArrayList<>();
		products.add(new Product(101, "Laptop", "HP"));
		products.add(new Product(113, "Desktop", "Dell"));
		products.add(new Product(104, "Earphones", "JBL"));
		products.add(new Product(142, "TV", "MicroMax"));
		products.add(new Product(111, "Mobile", "RedMi"));
		products.add(new Product(109, "Tab", "Samsung"));
		return products;

	}

}
