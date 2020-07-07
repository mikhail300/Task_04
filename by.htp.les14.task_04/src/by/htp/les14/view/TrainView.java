package by.htp.les14.view;

import java.util.List;

import by.htp.les14.entity.Train;

public class TrainView {

	public void print (String message, List<Train> trains) {
		System.out.println (message);
		for (Train train : trains) {
			System.out.println(train.getDestinationStation() + " " + train.getNumber() + " " + train.getCalendar());
			
		}
	}
	
	public void print (String message, Train train) {
		System.out.println (message);
		System.out.println(train.getDestinationStation() + " " + train.getNumber() + " " + train.getCalendar());
	}
}
