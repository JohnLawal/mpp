package prob3;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
//		Implement a given method requirement using Lambdas and streams in a Java 8 way.
//		 public int countWords(List<String> words, char c, char d, int len)
//		which counts the number of words in the input list words that have length equal to len, that
//		contain the character c, and that do not contain the character d. 

		String[] words = { "waters", "waited", "wished", "only", "which" };
		System.out.println("Number of Valid words: " + countWords(Arrays.asList(words), 'w', 'r', 6));

	}

	public static int countWords(List<String> words, char c, char d, int len) {
		return (int) words.stream().filter(word -> word.length() == len).filter(word -> word.contains("" + c))
				.filter(word -> !(word.contains("" + d))).count();

	}
}
