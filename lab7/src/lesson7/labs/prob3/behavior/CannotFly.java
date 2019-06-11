package lesson7.labs.prob3.behavior;

public interface CannotFly extends Flyable {

	@Override
	public default void fly() {
		System.out.println(" cannot fly");

	}

}
