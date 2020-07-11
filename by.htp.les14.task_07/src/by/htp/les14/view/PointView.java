package by.htp.les14.view;



import by.htp.les14.enity.Triangle;
import by.htp.les14.logic.TriangleLogic;

public class PointView {
	public void printIntersectionOfMedians(Triangle triangle) {
		TriangleLogic logic = new TriangleLogic();
		System.out.println ("Точка пересечения медиан треугольника " + "(" + logic.intersectionOfMedians(triangle).getX() + ", " + logic.intersectionOfMedians(triangle).getY() + " )");
		//System.out.println (triangle.getA().toString());
		//System.out.println (triangle.getB().toString());
		//System.out.println (triangle.getC().toString());
		//System.out.println ("равен " + "(" + logic.intersectionOfMedians(triangle).getX() + ", " + logic.intersectionOfMedians(triangle).getY() + " )");
		System.out.println ();
	//	System.out.println ("(" + logic.intersectionOfMedians(triangle).getX() + ", " + logic.intersectionOfMedians(triangle).getY() + " )");
	}
}
