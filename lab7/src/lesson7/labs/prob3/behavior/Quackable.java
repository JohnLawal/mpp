package lesson7.labs.prob3.behavior;

public interface Quackable {
	default void quack() {
		System.out.println(" quacking");
	}
}
