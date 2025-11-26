package com.omsri.MavenPro3;

public class Calculator implements ScitificCaluculator {

	@Override
	public double power(double m, double n) {
		return Math.pow(m, n);
	}

	@Override
	public double sqroot(double r) {
		return Math.sqrt(r);
	}

	@Override
	public double logValue(double d) {
		return Math.log10(d);
	}

}
