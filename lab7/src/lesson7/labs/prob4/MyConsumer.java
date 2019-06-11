package lesson7.labs.prob4;

public interface MyConsumer<T> {
	public default void accept(String s) {
		System.out.println(s.toUpperCase());
	}
}
