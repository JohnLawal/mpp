package prob5;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Create a method
//Stream<String> streamSection(Stream<String> stream, int m, int n) which
//extracts a substream from the input stream consisting of all elements from position m to
//position n, inclusive; you must use only Stream operations to do this. You can assume 0 <= m <= n.

public class Section {
	public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
		return stream.limit(n+1).skip(m);
	}

	public static void main(String[] args) {
// Make three calls for the streamSection() method with different inputs 
		// use nextStream() method to supply the
//		Stream input as a first argument in streamSection() method
		
		System.out.println("\nFirst Call");
		streamSection(nextStream(), 0, 5).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("\nSecond Call");
		streamSection(nextStream(), 2, 7).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("\nThird Call");
		streamSection(nextStream(), 5, 9).collect(Collectors.toList()).forEach(System.out::println);
	
	}

//support method for the main method -- for testing
	private static Stream<String> nextStream() {
		return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();
	}
}
