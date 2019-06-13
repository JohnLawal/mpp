package day2.prob2;

import java.util.function.Supplier;

public class Class3 {
	// instance method of the outer class
	double getRadom() {
		// local inner class
		class MySupplier implements Supplier<Double> {

			@Override
			public Double get() {
				return Math.random();
			}

		}
		// Accessing the inner class
		MySupplier inner = new MySupplier();
		return inner.get();
	}

	public static void main(String args[]) {
		Class3 outer = new Class3();
		System.out.println("Random number is: " + outer.getRadom());

	}
}