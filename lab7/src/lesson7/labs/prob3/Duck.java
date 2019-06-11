package lesson7.labs.prob3;

import lesson7.labs.prob3.behavior.Flyable;
import lesson7.labs.prob3.behavior.Quackable;

public abstract class Duck implements Flyable, Quackable{

	public void swim() {
		System.out.println(" swimming");
	}
	

	public abstract void display();


}
