package com.gc;

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numCircles = 0;

		Scanner scan = new Scanner(System.in);
		String escape = "";
		System.out.println("Welcome to circle builder");
		System.out.println();
		do {
		System.out.println("enter a radius");

		while (scan.hasNextDouble() == false) {
				// checks if input is double
			String input = scan.next();
			System.out.println("you entered: " + input);
			System.out.println("please enter a valid number" + " ");
		}

			double rad = scan.nextDouble();

		Circle one = new Circle(rad);

		System.out.println(one);

		System.out.println("area: " + one.getFormattedArea());
		System.out.println("circumference: " + one.getFormattedCircumference());

			numCircles += 1;

			System.out.println("do you want enter another circle (yes/no) ");
			escape = scan.next();
		} while (!escape.equalsIgnoreCase("no"));
		scan.close();

		System.out.println("goodbye, you built " + numCircles + " circles");
	}

}
