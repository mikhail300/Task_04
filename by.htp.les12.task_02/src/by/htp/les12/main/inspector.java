package by.htp.les12.main;
// 2. Создйте класс Test2 двумя переменными. 
// Добавьте конструктор с входными параметрами. 
// Добавьте конструктор, инициализирующий члены класса по умолчанию. 
// Добавьте set- и get- методы для полей экземпляра класса.
public class inspector {

	public static void main(String[] args) {
		
		Test2 test_a = new Test2();
		System.out.println ("test_a поле a " + test_a.getA());
		System.out.println ("test_a поле b " + test_a.getB());
		test_a.setA(7);
		test_a.setB(12);
		System.out.println ("test_a поле a " + test_a.getA());
		System.out.println ("test_a поле b " + test_a.getB());
		
		Test2 test_b = new Test2(44, 56);
		System.out.println ("test_b поле a " + test_b.getA());
		System.out.println ("test_b поле b " + test_b.getB());
	}

}
