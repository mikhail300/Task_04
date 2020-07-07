package by.htp.les14.main;

import by.htp.les14.entity.Depo;
import by.htp.les14.entity.Train;
import by.htp.les14.logic.TrainLogic;
import by.htp.les14.view.TrainView;

//4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов. 
//Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
	
public class Main {

	public static void main(String[] args) {
		//List<String> list = new ArrayList<String>();
		//
		Depo depo = new Depo();
		TrainLogic logic = new TrainLogic();
		TrainView view = new TrainView();
		
		depo.addTrain(new Train("Minsk",4, null));
		depo.addTrain(new Train("Gomel", 2, null));
		depo.addTrain(new Train("Brest", 5, null));
		depo.addTrain(new Train("Moscow", 3, null));
		depo.addTrain(new Train("Mogilev", 1, null));
	
	view.print("Отсортированы по возрастанию номера презда", logic.sortByNumberASC(depo.getTrains()));
	System.out.println();
	
	view.print("Отсортированы по убыванию номера презда", logic.sortByNumberDESC(depo.getTrains()));
	System.out.println();
	
	view.print("Найденый поезд", logic.findByNumber(depo.getTrains(), 2));
	System.out.println();
	}

}
