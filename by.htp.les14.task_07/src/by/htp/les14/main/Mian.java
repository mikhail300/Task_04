package by.htp.les14.main;

import by.htp.les14.enity.Point;
import by.htp.les14.enity.Triangle;
import by.htp.les14.logic.TriangleLogic;
import by.htp.les14.view.PointView;
import by.htp.les14.view.TriangleView;

// 7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.
public class Mian {

	public static void main(String[] args) {
		Point a = new Point (2, 0);
		Point b = new Point (2, 3);
		Point c = new Point (6, 0);
		Triangle triangle = new Triangle(a, b, c);
		
		TriangleView viewTriangle = new TriangleView();
		TriangleLogic logic = new TriangleLogic();
		PointView viewPoint = new PointView();
		viewTriangle.printTriangle(triangle);
		viewTriangle.printPerimetr(triangle);
		viewTriangle.printSquare(triangle);
		viewPoint.printIntersectionOfMedians(triangle);;
		
		
	}
	
	
	
}
