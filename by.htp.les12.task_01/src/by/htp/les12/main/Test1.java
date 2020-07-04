package by.htp.les12.main;
// 1. Создайте класс Test1 двумя переменными. 
// Добавьте метод вывода на экран и методы изменения этих переменных. 
// Добавьте метод, который находит сумму значений этих переменных, 
// и метод, который находит наибольшее значение из этих двух переменных.
public class Test1 {
	private int a;
	private int b;
	
	public void print () {
		System.out.println (a);
		System.out.println (b);
	}
	
	public void setA (int a) {
		this.a = a;
	}
	
	public void setB (int b) {
		this.b = b;
	}
	
	public int sumAB () {
		int sum = this.a + this.b;
		return sum;
	}
	public int maxAB () {
		if (this.a > this.b) {
			return this.a;
		}
		if (this.a < this.b) {
			return this.b;
		}
		return this.b;
	}
}