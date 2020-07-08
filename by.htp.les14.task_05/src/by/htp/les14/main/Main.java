package by.htp.les14.main;

public class Main {

	public static void main(String[] args) {
		Counter counter1 = new Counter(5, 8, -2);
		Counter counter2 = new Counter();

		for (int i = 0 ; i < 12 ; i ++) {
			System.out.printf("%4d%4d%n", counter1.getCount(), counter2.getCount());
			counter1.inc();
			counter2.dec();
		}
		System.out.println("");
		for (int i = 0 ; i < 22 ; i ++) {
			System.out.printf("%4d%4d%n", counter1.getCount(), counter2.getCount());
			counter1.dec();
			counter2.inc();
		}
	}

}
