package lesson7.labs.prob2;

public class EquilateralTriangle implements Polygon {
	private double side;

	public EquilateralTriangle(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double[] getLengths() {
		return new double[] { 3 * side };
	}

}
