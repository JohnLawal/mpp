package prob10;

import java.util.Arrays;


class Human {
	String name;
	int age;
	String gender;

	public Human(String name) {
		this.name = name;
	}

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Human(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
	public static void main(String args[]) {
		Human[] list = { new Human("Joe", 35, "Male"), new Human("Jane", 45, "Female"), new Human("John", 30, "Male") };

		// Query 1 : Print only Female canditates names
		System.out.println("----Female Names-----");
		Arrays.stream(list).filter(human -> human.getGender().equals("Female")).map(human -> human.getName())
				.forEach(System.out::println);

		// Query 2 : Create an object by choosing suitable Interface to the specified
		// constructors(Totally 3 constructors)using fourth type of Method Reference
		// ClassName::new. Then print the object status
		System.out.println("\n----Object Status-----");
		Arrays.asList("Lawal").stream().map(Human::new).forEach(System.out::println);

		// Query 3 : Count the male candidates whose age is more than 30
		int count = (int) Arrays.stream(list).filter(human -> human.getGender().equals("Male"))
				.filter(human -> human.getAge() > 30).count();
		System.out.println("\nCount " + count);
	}

}
