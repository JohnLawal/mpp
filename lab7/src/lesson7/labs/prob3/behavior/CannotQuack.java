package lesson7.labs.prob3.behavior;

public interface CannotQuack extends Quackable {

	@Override
	public default void quack() {
		System.out.println(" cannot quack");

	}

}
