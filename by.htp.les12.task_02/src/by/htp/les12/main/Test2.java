package by.htp.les12.main;
// 2. Создйте класс Test2 двумя переменными. 
// Добавьте конструктор с входными параметрами. 
// Добавьте конструктор, инициализирующий члены класса по умолчанию. 
// Добавьте set- и get- методы для полей экземпляра класса.
public class Test2 {
	public int a;
	public int b;
	
	public Test2 () {
		this.a = 0;
		this.b = 0;
	}
	public Test2 (int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	
}
