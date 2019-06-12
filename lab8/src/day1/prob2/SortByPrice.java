package day1.prob2;

import java.util.Comparator;

public class SortByPrice implements Comparator<Product> {

	@Override
	public int compare(Product product1, Product product2) {
		return ((Double) product1.getPrice()).compareTo((Double) product2.getPrice());
	}
}