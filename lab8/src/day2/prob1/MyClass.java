package day2.prob1;

import java.util.function.Predicate;

public class MyClass {
	private int x;
	private String y;

	public MyClass(int x, String y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public String getY() {
		return y;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof MyClass))
			return false;
		return x == ((MyClass) obj).getX() && y.equals(((MyClass) obj).getY());
	}

	public boolean myMethod(MyClass cl) {
		 Predicate<MyClass> tester = this::equals;
		 return tester.test(cl);
	}

}
