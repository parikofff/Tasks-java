import java.lang.Math;

public class Circle {

	private double radius;

	public Circle (double radius) {
		this.radius = radius;
	}

	public double squsare () {
		double	pi = Math.PI;
		double	squsare = radius * pi*radius;
		return squsare;
	}
}




