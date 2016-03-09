package strupattern.proxy;

public class CalculateBeanImpl implements CalculateBean {

	@Override
	public double farenToCelcius(double faren) {
		return (faren-32)*(5.0/9.0);
	}

}
