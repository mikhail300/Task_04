package by.htp.les12.main;

public class inspector {

	public static void main(String[] args) {
		Test1 test = new Test1();
		
		test.print();
		
		test.setA(5);
		test.setB(3);
		
		test.print();
		
		System.out.println ("a + b = " + test.sumAB());
		System.out.println ("Болшее значение из a, b это" + test.maxAB());
		
	}

}
