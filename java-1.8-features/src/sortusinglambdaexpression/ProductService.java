package sortusinglambdaexpression;

import java.util.Collections;
import java.util.List;

public class ProductService {

	public List<Product> getProductsInSort() {
		List<Product> products = new ProductDAO().getProducts();

		// Using Lambda expression
		// Ascending order
		Collections.sort(products, (p1, p2) -> p1.getName().compareTo(p2.getName()));

		// Descending order
		// Collections.sort(products, (p1, p2) -> p2.getName().compareTo(p1.getName()));
		return products;
	}

	public static void main(String[] args) {
		System.out.println(new ProductService().getProductsInSort());
	}

}
