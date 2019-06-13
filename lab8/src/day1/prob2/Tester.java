package day1.prob2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Tester {
	private enum SortMethod {
		SORT_BY_PRICE, SORT_BY_TITLE
	};

	private void sort(List<Product> products, SortMethod sortMethod) {
		class ProductsSorter implements Comparator<Product> {
			@Override
			public int compare(Product product1, Product product2) {
				if (sortMethod == SortMethod.SORT_BY_PRICE) {
					return ((Double) product1.getPrice()).compareTo((Double) product2.getPrice());
				} else {
					return product1.getTitle().compareTo(product2.getTitle());
				}

			}
		}
		Collections.sort(products, new ProductsSorter());
	}
	

	public static void main(String[] args) {
		List<Product> prodList = new ArrayList<>();
		prodList.add(new Product("Product A", 55.75, 85));
		prodList.add(new Product("Product A", 45.75, 81));
		prodList.add(new Product("Product C", 55.74, 80));

//		A
		Collections.sort(prodList, new SortByPrice());
		System.out.println("Sorted By Price: " + prodList);
//		B
		Collections.sort(prodList, new SortByTitle());
		System.out.println("Sorted By Title: " + prodList);
// 		C
		Tester t1 = new Tester();
		t1.sort(prodList, SortMethod.SORT_BY_PRICE);
		System.out.println("Sorted By Price using Closure: " + prodList);
		t1.sort(prodList, SortMethod.SORT_BY_TITLE);
		System.out.println("Sorted By Title using Closure: " + prodList);
//		D
		prodList.sort((p1,p2)-> {
			if (p1.getTitle().equals(p2.getTitle())) {
				return ((Integer) p1.getModel()).compareTo(((Integer) p2.getModel()));
			}else {
				return p1.getTitle().compareTo(p2.getTitle());
			}
		});
		System.out.println("Sorted Using Lambdas: " + prodList);

	}

}
