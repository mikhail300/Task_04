package by.htp.les14.main;

public class Counter {

	private int count;
	private int max;
	private int min;
	
	public Counter () {
		count = 0;
		max = 10;
		min = -10;
	}
	
	public Counter (int count, int max, int min) {
		if (min <= count && count <= max &&  min <= max ) {
		this.count = count;
		this.max = max;
		this.min = min;
		}else {
			this.count = 0;
			this.max = 10;
			this.min = -10;
		}
	}
	
	public void inc() {
		if (count != max) {
			count ++;
		}
	}
	
	public void dec() {
		if (count != min) {
			count --;
		}
	}
	
	public int getCount() {
		return count;
	}
	
	
	
	
}
