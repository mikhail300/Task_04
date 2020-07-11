package by.htp.les14.main;

import by.htp.les14.enity.Point;
import by.htp.les14.enity.Triangle;

// 7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.
public class Mian {

	public static void main(String[] args) {
		Point a = new Point (2, 0);
		Point b = new Point (2, 3);
		Point c = new Point (6, 0);
		Triangle triangle = new Triangle(a, b, c);
		
		
	}
	
	
	
}
