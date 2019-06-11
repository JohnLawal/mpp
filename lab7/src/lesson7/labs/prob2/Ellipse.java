package lesson7.labs.prob2;

public class Ellipse implements ClosedCurve {
	private double semiMajorAxis;
	private double ellipticIntegralAtEccentricity;


	public Ellipse(double semiMajorAxis, double ellipticIntegralAtEccentricity) {
		super();
		this.semiMajorAxis = semiMajorAxis;
		this.ellipticIntegralAtEccentricity = ellipticIntegralAtEccentricity;
	}


	public double getSemiMajorAxis() {
		return semiMajorAxis;
	}


	public void setSemiMajorAxis(double semiMajorAxis) {
		this.semiMajorAxis = semiMajorAxis;
	}


	public double getEllipticIntegralAtEccentricity() {
		return ellipticIntegralAtEccentricity;
	}


	public void setEllipticIntegralAtEccentricity(double ellipticIntegralAtEccentricity) {
		this.ellipticIntegralAtEccentricity = ellipticIntegralAtEccentricity;
	}


	@Override
	public double computePerimeter() {
		return 4 * semiMajorAxis * ellipticIntegralAtEccentricity;
	}

}
