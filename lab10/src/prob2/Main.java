package prob2;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 12, 3, 4, 5);
		System.out.println(secondSmallest(list));
	}

	@SuppressWarnings("unchecked")
	public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {	
		return (T) list.stream().sorted(T::compareTo).distinct().toArray()[1];
	}

}
