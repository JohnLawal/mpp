package day2.prob1;

public class Test {

	public static void main(String[] args) {
		MyClass firstClass = new MyClass(5, "John");
		MyClass secondClass = new MyClass(5, "John");
		MyClass thirdClass = new MyClass(8, "John");


		System.out.println("First is equal to second gives: " + firstClass.myMethod(secondClass));
		System.out.println("First is equal to Third gives: " + firstClass.myMethod(thirdClass));
	}

}
