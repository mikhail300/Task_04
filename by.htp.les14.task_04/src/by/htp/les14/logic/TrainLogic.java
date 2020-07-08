package by.htp.les14.logic;

import java.util.ArrayList;
import java.util.List;
import by.htp.les14.entity.Train;

public class TrainLogic {

	public List<Train> sortByNumberASC (List<Train> Trains) {
		List<Train> sortTrains = new ArrayList<Train>();
		sortTrains.addAll(Trains);
		Train tmpTrain = new Train();
		for (int j = 0 ; j < (sortTrains.size()) ; j ++) {
			for (int i = 0 ; i < (sortTrains.size() - 1) ; i++) {
				if (sortTrains.get(i).getNumber() > sortTrains.get(i+1).getNumber()) {
					tmpTrain = sortTrains.get(i);
					sortTrains.set(i, sortTrains.get(i+1));
					sortTrains.set(i+1, tmpTrain);
				}
			}
		}
		return sortTrains;
	}
	
	public List<Train> sortByNumberDESC (List<Train> Trains) {
		List<Train> sortTrains = new ArrayList<Train>();
		sortTrains.addAll(Trains);
		Train tmpTrain = new Train();
		for (int j = 0 ; j < (sortTrains.size()) ; j ++) {
			for (int i = 0 ; i < (sortTrains.size() - 1) ; i++) {
				if (sortTrains.get(i).getNumber() < sortTrains.get(i+1).getNumber()) {
					tmpTrain = sortTrains.get(i);
					sortTrains.set(i, sortTrains.get(i+1));
					sortTrains.set(i+1, tmpTrain);
				}
			}
		}
		return sortTrains;
	}
	
	public Train findByNumber (List<Train> trains, int number) {
		Train foundTrain = new Train();
		for (Train train : trains) {
			if (train.getNumber() == number) {
				return train;
			}
		}
		return foundTrain;
	}
	
	public List<Train> sortByDestinationStationASC (List<Train> trains) {
		List<Train> sortTrains = new ArrayList<Train>();
		sortTrains.addAll(trains);
		Train tmpTrain = new Train();
		for (int j = 0 ; j < sortTrains.size() ; j++) {
			for (int i = 0 ; i < (sortTrains.size() -1) ; i++) {
				if (sortTrains.get(i).getDestinationStation().compareTo(sortTrains.get(i+1).getDestinationStation()) > 0) {
					tmpTrain = sortTrains.get(i);
					sortTrains.set(i, sortTrains.get(i+1));
					sortTrains.set(i+1, tmpTrain);
				}
			}
		}
		return sortTrains;
	}
	
	public List<Train> sortByDestinationStationDESC (List<Train> trains) {
		List<Train> sortTrains = new ArrayList<Train>();
		sortTrains.addAll(trains);
		Train tmpTrain = new Train();
		for (int j = 0 ; j < sortTrains.size() ; j++) {
			for (int i = 0 ; i < (sortTrains.size() -1) ; i++) {
				if (sortTrains.get(i).getDestinationStation().compareTo(sortTrains.get(i+1).getDestinationStation()) < 0) {
					tmpTrain = sortTrains.get(i);
					sortTrains.set(i, sortTrains.get(i+1));
					sortTrains.set(i+1, tmpTrain);
				}
			}
		}
		return sortTrains;
	}
	
	public List<Train> sortPartByCalendarASC (List<Train> trains, int startIndex, int endIndex) {
		List<Train> sortTrains = new ArrayList<Train>();
		sortTrains.addAll(trains);
		Train tmpTrain = new Train();
		for (int j = startIndex ; j < endIndex ; j++) {
			for (int i = startIndex ; i < (endIndex - 1) ; i++) {
				if (sortTrains.get(i).getCalendar().compareTo(sortTrains.get(i+1).getCalendar()) > 0) {
					tmpTrain = sortTrains.get(i);
					sortTrains.set(i, sortTrains.get(i+1));
					sortTrains.set(i+1, tmpTrain);
				}
			}
		}
		return sortTrains;
	}
	
	public List<Train> sortPartByCalendarDESC (List<Train> trains, int startIndex, int endIndex) {
		List<Train> sortTrains = new ArrayList<Train>();
		sortTrains.addAll(trains);
		Train tmpTrain = new Train();
		for (int j = startIndex ; j < endIndex ; j++) {
			for (int i = startIndex ; i < (endIndex - 1) ; i++) {
				if (sortTrains.get(i).getCalendar().compareTo(sortTrains.get(i+1).getCalendar()) < 0) {
					tmpTrain = sortTrains.get(i);
					sortTrains.set(i, sortTrains.get(i+1));
					sortTrains.set(i+1, tmpTrain);
				}
			}
		}
		return sortTrains;
	}
	
	public List<Train> sortByDestinationStationASCWhereDestinationStationSortByCalendarASC (List<Train> trains) {
		TrainLogic logic = new TrainLogic();
		List<Train> sortTrains = new ArrayList<Train>();
		sortTrains.addAll(logic.sortByDestinationStationASC(trains));
		
		int count = 0;
		for (int j = 0 ; j < sortTrains.size()-1 ; j++) {
			
				if (sortTrains.get(j).getDestinationStation().compareTo(sortTrains.get(j+1).getDestinationStation()) == 0) {
					count++;
				}else {
					if (count > 0 ) {
						sortTrains = logic.sortPartByCalendarASC(sortTrains, j - count, j + 1);
						count = 0;
					}
				}
		}
		if (count > 0 ) {
			sortTrains = logic.sortPartByCalendarASC(sortTrains, sortTrains.size()-1 - count, sortTrains.size()-1 + 1);
		}
		return sortTrains;
	}
	
	public List<Train> sortByDestinationStationDESCWhereDestinationStationSortByCalendarASC (List<Train> trains) {
		TrainLogic logic = new TrainLogic();
		List<Train> sortTrains = new ArrayList<Train>();
		sortTrains.addAll(logic.sortByDestinationStationDESC(trains));
		
		int count = 0;
		for (int j = 0 ; j < sortTrains.size()-1 ; j++) {
			
				if (sortTrains.get(j).getDestinationStation().compareTo(sortTrains.get(j+1).getDestinationStation()) == 0) {
					count++;
				}else {
					if (count > 0 ) {
						sortTrains = logic.sortPartByCalendarASC(sortTrains, j - count, j + 1);
						count = 0;
					}
				}
		}
		if (count > 0 ) {
			sortTrains = logic.sortPartByCalendarASC(sortTrains, sortTrains.size()-1 - count, sortTrains.size()-1 + 1);
		}
		return sortTrains;
	}
	
	public List<Train> sortByDestinationStationASCWhereDestinationStationSortByCalendarDESC (List<Train> trains) {
		TrainLogic logic = new TrainLogic();
		List<Train> sortTrains = new ArrayList<Train>();
		sortTrains.addAll(logic.sortByDestinationStationASC(trains));
		
		int count = 0;
		for (int j = 0 ; j < sortTrains.size()-1 ; j++) {
			
				if (sortTrains.get(j).getDestinationStation().compareTo(sortTrains.get(j+1).getDestinationStation()) == 0) {
					count++;
				}else {
					if (count > 0 ) {
						sortTrains = logic.sortPartByCalendarDESC(sortTrains, j - count, j + 1);
						count = 0;
					}
				}
		}
		if (count > 0 ) {
			sortTrains = logic.sortPartByCalendarDESC(sortTrains, sortTrains.size()-1 - count, sortTrains.size()-1 + 1);
		}
		return sortTrains;
	}
	
	public List<Train> sortByDestinationStationDESCWhereDestinationStationSortByCalendarDESC (List<Train> trains) {
		TrainLogic logic = new TrainLogic();
		List<Train> sortTrains = new ArrayList<Train>();
		sortTrains.addAll(logic.sortByDestinationStationDESC(trains));
		
		int count = 0;
		for (int j = 0 ; j < sortTrains.size()-1 ; j++) {
			
				if (sortTrains.get(j).getDestinationStation().compareTo(sortTrains.get(j+1).getDestinationStation()) == 0) {
					count++;
				}else {
					if (count > 0 ) {
						sortTrains = logic.sortPartByCalendarDESC(sortTrains, j - count, j + 1);
						count = 0;
					}
				}
		}
		if (count > 0 ) {
			sortTrains = logic.sortPartByCalendarDESC(sortTrains, sortTrains.size()-1 - count, sortTrains.size()-1 + 1);
		}
		return sortTrains;
	}
}
