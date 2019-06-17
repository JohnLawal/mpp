package prob9;

import java.util.*;
import java.util.stream.Collectors;

public class Dish {

	private final String name;
	private final boolean vegetarian;
	private final int calories;
	private final Type type;

	public Dish(String name, boolean vegetarian, int calories, Type type) {
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public int getCalories() {
		return calories;
	}

	public Type getType() {
		return type;
	}

	public enum Type {
		MEAT, FISH, OTHER
	}

	@Override
	public String toString() {
		return name;
	}

	public static final List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
			new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
			new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
			new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
			new Dish("prawns", false, 400, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));

	public static boolean vegetarianMealAvailable() {
		Optional<Dish> vegeterianDish = Dish.menu.stream().filter(dish -> dish.isVegetarian()).findAny();
		return vegeterianDish.isPresent();
	}

	public static boolean haveCaloriesLessThan1000() {
		boolean healthyDish = Dish.menu.stream().anyMatch(dish -> dish.getCalories() < 1000);
		return healthyDish;
	}

	public static boolean haveCaloriesMoreThan1000() {
		boolean unhealthyDish = Dish.menu.stream().anyMatch(dish -> dish.getCalories() > 1000);
		return unhealthyDish;
	}

	public static Optional<Dish> firstTypeOfMeat() {
		Optional<Dish> firstMeat = Dish.menu.stream().filter(dish -> dish.getType().equals(Type.MEAT)).findFirst();
		return firstMeat;
	}

	public static int calculateTotalCalories() {
		int totalCalories = Dish.menu.stream().map(dish -> dish.getCalories()).reduce(0, (a, b) -> a + b);
		return totalCalories;
	}

	public static int calculateTotalCaloriesMethodReference() {
		return Dish.menu.stream()
				.collect(Collectors.summingInt(Dish::getCalories));		
	}
	
	public static void main(String[] args) {
		System.out.println("\nVegetarian Meal Available: " + Dish.vegetarianMealAvailable());
		System.out.println("\nHealthy menu have calories less than 1000: " + Dish.haveCaloriesLessThan1000());
		System.out.println("\nUnhealthy menu have calories greater than 1000: " + Dish.haveCaloriesMoreThan1000());
		System.out.println("\nThe first item for the type of MEAT: " + Dish.firstTypeOfMeat().orElse(null));
		System.out.println("\nTotal Calories using reduce(): " + Dish.calculateTotalCalories());
		System.out.println("\nTotal Calories using method reference: " + Dish.calculateTotalCaloriesMethodReference());

	}

}