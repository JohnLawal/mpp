package prob4;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
//. Implement a method
//		public static void printSquares(int num)
//		which creates an IntStream using the iterate method. The method prints to the console the first
//		num squares. For instance, if num = 4, then your method would output 1, 4, 9, 16.
//		Note: You will need to
//		come up with a function to be used in the second argument of iterate.
		printSquares(4);
	}

	public static void printSquares(int num) {
		Stream.iterate(1l, n -> n + 1).map(n -> n * n).limit(num)
				.forEach(System.out::println);
	}

}
