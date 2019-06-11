package lesson7.labs.prob3.behavior;

public interface Flyable {
	 default void fly() {
		System.out.println(" flying with wings");
	}
}
