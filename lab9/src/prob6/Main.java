package prob6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	// by creating a stream pipeline that transforms
//	a list of sets (of type String) into the union of those
	// sets. Make use of the reduce method for streams.
	// Example: The union method should transform the list [{“A”, “B”}, {“D”}, {“1”,
	// “3”, “5”}]
//	to the set	{“A”, “B”, “D”, “1”, “3”, “5”}.

	public static void main(String[] args) {
		Set<String> mySet1 = new HashSet<String>();
		Set<String> mySet2 = new HashSet<String>();
		Set<String> mySet3 = new HashSet<String>();
		mySet1.add("A");
		mySet1.add("B");
		//
		mySet2.add("D");
		//
		mySet3.add("1");
		mySet1.add("3");
		mySet1.add("5");
		//
		List<Set<String>> sets = new ArrayList<Set<String>>();
		sets.add(mySet1);
		sets.add(mySet2);
		sets.add(mySet3);
		//
		System.out.println(union(sets));
	}

	public static Set<String> union(List<Set<String>> sets) {
		return sets.stream().flatMap(set -> Stream.of(set)).reduce(new HashSet<String>(),
				(setA, setB) -> combine(setA, setB));
	}

	private static Set<String> combine(Set<String> setA, Set<String> setB) {
		setA.addAll(setB);
		return setA;
	}

}
