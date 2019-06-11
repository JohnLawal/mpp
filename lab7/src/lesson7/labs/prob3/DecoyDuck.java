package lesson7.labs.prob3;

import lesson7.labs.prob3.behavior.CannotFly;
import lesson7.labs.prob3.behavior.CannotQuack;

public class DecoyDuck extends Duck implements CannotFly, CannotQuack{

	@Override
	public void display() {
		System.out.println(" displaying"); 
	}
	

}
