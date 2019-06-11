package lesson7.labs.prob3.behavior;

public interface Squeak extends Quackable {

	@Override
	public default void quack() {
		System.out.println(" squeaking");

	}

}
