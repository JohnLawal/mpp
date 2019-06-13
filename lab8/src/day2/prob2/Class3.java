package day2.prob2;

import java.util.function.Supplier;

public class Class3 {
	public static void main(String args[]) {
		class MySupplier implements Supplier<Double> {
			@Override
			public Double get() {
				return Math.random();
			}
		}
		MySupplier inner = new MySupplier();
		System.out.println("Random number is: " + inner.get());
	}
}