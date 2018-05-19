import java.lang.Math;

public class CircleFigure extends Figure {

	private double radius;

	public Circle (double radius) {
		this.radius = radius;
	}

	public double getSquere () {
		double	squsare = radius *radius* Math.PI;
		return squsare;
	}
}




