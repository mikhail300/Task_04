package by.htp.les14.enity;

public class Triangle {
	private Point a;
	private Point b;
	private Point c;
	
	public Triangle () {
		a = new Point(0, 0);
		b = new Point(0, 3);
		c = new Point(4, 0);
	}
	
	public Triangle (Point a, Point b, Point c) {
		if (isReal(a, b, c)) {
			this.a = a;
			this.b = b;
			this.c = c;
		}else {
			this.a = new Point(0, 0);
			this.b = new Point(0, 3);
			this.c = new Point(4, 0);
		}
	}
	private boolean isReal(Point a, Point b, Point c) {
		if (a.equals(b) || b.equals(c) || c.equals(a)) {
			return true;
		} else {
			return false;
		}
	}
	
	public Point getA() {
		return a;
	}

	public Point getB() {
		return b;
	}

	public Point getC() {
		return c;
	}

	
	
	
}
