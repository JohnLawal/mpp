package prob2;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Double> list = Arrays.asList(1.1, 1.2, 3.2);
		System.out.println(secondSmallest(list));
	}

	@SuppressWarnings("unchecked")
	public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {
		//assumes that there will be at least two distinct elements in the list
		return (T) list.stream().sorted(T::compareTo).distinct().toArray()[1];
	}

}
