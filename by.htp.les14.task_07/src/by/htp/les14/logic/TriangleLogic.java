package by.htp.les14.logic;

import by.htp.les14.enity.Point;
import by.htp.les14.enity.Triangle;

public class TriangleLogic {
	public double perimeter(Triangle triangle) {
		double perimeter = distanceBetween2Points(triangle.getA(),triangle.getB()) + distanceBetween2Points(triangle.getB(),triangle.getC()) + distanceBetween2Points(triangle.getC(),triangle.getA());
		return perimeter;
	}

	private static double distanceBetween2Points(Point point0, Point point1) {
		double distance;
		distance = Math.sqrt(Math.pow(point1.getX() - point0.getX(), 2) + Math.pow(point1.getY() - point0.getY(), 2));
		return distance;
	}
	
	
	public double square(Triangle triangle) {
		double a = (double) triangle.getA();
		double b = (double) triangle.getB();
		double c = (double) triangle.getC();
		double p = (a + b + c) / 2.0;
		double sqare = Math.sqrt(a * (p - a) * (p - b) * (p - c));
		return sqare;
	}
	
	
}
