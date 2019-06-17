package prob2;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
//		2. You have a Stream of Integers called myIntStream and you need to output both
//		the	maximum and minimum values. Write compact code that efficiently accomplishes this. 
		
		Optional<Integer> max = getStream().max(Integer::compareTo);
		Optional<Integer> min = getStream().min(Integer::compareTo);

		System.out.println("Maximum Integer is: " + max.orElse(null));
		System.out.println("Minimum Integer is: " + min.orElse(null));
	}

	private static Stream<Integer> getStream() {
		Stream<Integer> myIntStream = Arrays.asList(2, 3, 4, 6, 1, 8, 20).stream();
		return myIntStream;
	}

}
