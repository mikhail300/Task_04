package by.htp.les14.view;

import by.htp.les14.enity.Triangle;
import by.htp.les14.logic.TriangleLogic;

public class TriangleView {

	public void printPerimetr(Triangle triangle) {
		TriangleLogic logic = new TriangleLogic();
		
		System.out.println ("Периметр треугольника ");
		//System.out.println (triangle.getA().toString());
		//System.out.println (triangle.getB().toString());
		//System.out.println (triangle.getC().toString());
		System.out.println ("равен " + logic.perimeter(triangle));
		System.out.println ();
		
	}
	
	public void printSquare(Triangle triangle) {
		TriangleLogic logic = new TriangleLogic();
		
		System.out.println ("Площадь треугольника ");
		//System.out.println (triangle.getA().toString());
		//System.out.println (triangle.getB().toString());
		//System.out.println (triangle.getC().toString());
		System.out.println ("равна " + logic.square(triangle));
		System.out.println ();
	}
	
	public void printTriangle(Triangle triangle) {
		TriangleLogic logic = new TriangleLogic();
		
		System.out.println ("Треугольник");
		System.out.println ("A " + triangle.getA());
		System.out.println ("B " + triangle.getB());
		System.out.println ("C " + triangle.getC());
		
		System.out.println ();
		
	}
}
