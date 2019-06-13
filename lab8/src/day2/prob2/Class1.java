package day2.prob2;

import java.util.function.Supplier;

public class Class1 {

	public static void main(String[] args) {
		Supplier<Double> randomizer = Math::random;
		System.out.println("Random number is: "+ randomizer.get());
	}

}
