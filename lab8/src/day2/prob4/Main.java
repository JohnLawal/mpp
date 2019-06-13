package day2.prob4;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		class SortIgnoreCase implements Comparator<String> {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		}
		String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
//		 SortIgnoreCase::new;
		Arrays.sort(names, new SortIgnoreCase());
		Arrays.stream(names).forEach(System.out::println);
	}
}
