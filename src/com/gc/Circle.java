package com.gc;

import java.math.BigDecimal;

public class Circle {

	public double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getCircumference() {
		return Math.PI * radius * 2;
	};

	public String getFormattedCircumference() {
		return formatNumber(getCircumference(), 2);
	}

	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public String getFormattedArea() {
		return formatNumber(getArea(), 2);
	}

	@Override
	public String toString() {
		return "radius: " + radius;
	};


	@SuppressWarnings("unused")
	private static String formatNumber(double r, final int decimalPlaces) {

		BigDecimal bd = new BigDecimal(r);
		// setScale is immutable
		bd = bd.setScale(decimalPlaces, BigDecimal.ROUND_HALF_UP);
		r = bd.doubleValue();
		return Double.toString(r);
	}

}