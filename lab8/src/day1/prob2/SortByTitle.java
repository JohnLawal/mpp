package day1.prob2;

import java.util.Comparator;

public class SortByTitle implements Comparator<Product> {

	@Override
	public int compare(Product product1, Product product2) {
		return product1.getTitle().compareTo(product2.getTitle());
	}
}