package day1.prob1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {
		//YES, IT CAN BE  EXPRESSED AS A BIFUNCTION
		BiFunction<Double, Double, List<Double>> test = (x, y) -> {
			List<Double> list = new ArrayList<>();
			list.add(Math.pow(x, y));
			list.add(x * y);
			return list;
		};

		System.out.println("Testing with 2.0 and 3.0 gives us: "+ test.apply(2.0, 3.0));
	}

}
