package lesson7.labs.prob2;

public interface Polygon extends ClosedCurve{
	
	default double computePerimeter() {
		double sumOfSides = 0;
		double[] sides = getLengths();
		for (int i = 0; i < sides.length; i++) {
			sumOfSides += sides[i];
		}
		return sumOfSides;
	}
	
	double[] getLengths();

}
