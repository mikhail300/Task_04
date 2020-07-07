package by.htp.les14.entity;

import java.util.Calendar;

public class Train {
	private String destinationStation;
	private int number;
	private Calendar calendar;
	
	public Train () {
		
	}
	
	public Train(String destinationStation, int number, Calendar calendar) {
		this.destinationStation = destinationStation;
		this.number = number;
		this.calendar = calendar;
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

	
	//seter getter
}
