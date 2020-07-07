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
	
}
