package day2.prob3;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Cherries", "blums");
		System.out.println("Using lamdas");
		fruits.forEach(f -> System.out.println(f));
		System.out.println("\nUsing method reference");
		fruits.forEach(System.out::println);
	}

}
