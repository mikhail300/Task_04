package by.htp.les12.main;
// 1. Создайте класс Test1 двумя переменными. 
// Добавьте метод вывода на экран и методы изменения этих переменных. 
// Добавьте метод, который находит сумму значений этих переменных, 
// и метод, который находит наибольшее значение из этих двух переменных.
public class inspector {

	public static void main(String[] args) {
		Test1 test = new Test1();
		
		test.print();
		
		test.setA(5);
		test.setB(3);
		
		test.print();
		
		System.out.println ("a + b = " + test.sumAB());
		System.out.println ("Большее значание из a, b это " + test.maxAB());
		
	}

}
