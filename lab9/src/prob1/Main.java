package prob1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
//		You have a Stream of Strings called stringStream consisting of the values “Bill”, “Thomas”,
//		and “Mary”. Write the one line of code necessary to print this stream to the console so that the
//		output looks like this:

		
		Stream<String> stringStream = Arrays.asList("Bill", "Thomas", "Mary").stream();
		System.out.println(stringStream.collect(Collectors.joining(", ")));
	}

}
