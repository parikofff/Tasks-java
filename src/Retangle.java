import java.lang.Math;

public class Retangle extends Figure {

	private double shirina;
	private double dlina;

	public Retangle (double shirina, double dlina) {
		this.dlina = dlina;
		this.shirina = shirina;
	}

	@Override
	public double getSquere() {
		// TODO Auto-generated method stub
		double	ploscha = dlina * shirina;
		return ploscha;
	}
}




