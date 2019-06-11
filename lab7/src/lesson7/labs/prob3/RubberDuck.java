package lesson7.labs.prob3;

import lesson7.labs.prob3.behavior.CannotFly;
import lesson7.labs.prob3.behavior.Squeak;

public class RubberDuck extends Duck implements CannotFly, Squeak {

	@Override
	public void display() {
		System.out.println(" displaying");
	}
}
