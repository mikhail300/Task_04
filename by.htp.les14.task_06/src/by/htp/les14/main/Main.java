package by.htp.les14.main;

public class Main {

	public static void main(String[] args) {
		Time time = new Time(12, 55,30);
		TimeView view = new TimeView();
		view.printTime(time);
		
		System.out.println();
		
		time.setHour(22);
		view.printTime(time);
		
		System.out.println();
		
		time.setHour(24);
		view.printTime(time);
		
		System.out.println();
		
		time.setSecond(-3);
		view.printTime(time);
		
		System.out.println();
		
		time.setTime(15, 24, 15);
		view.printTime(time);
		
		System.out.println();
		
		time.setTime(151, 241, -15);
		view.printTime(time);
		
		System.out.println();
		
	}

}
