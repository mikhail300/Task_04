package by.htp.les14.main;

import java.util.GregorianCalendar;
import by.htp.les14.entity.Depo;
import by.htp.les14.entity.Train;
import by.htp.les14.logic.TrainLogic;
import by.htp.les14.view.TrainView;

// 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
// Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов. 
// Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
// Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
	
public class Main {

	public static void main(String[] args) {
		//List<String> list = new ArrayList<String>();
		//
		Depo depo = new Depo();
		TrainLogic logic = new TrainLogic();
		TrainView view = new TrainView();
		
		depo.addTrain(new Train("Minsk",1, new GregorianCalendar(2002, 5, 28, 12, 34, 43)));
		depo.addTrain(new Train("Mogilev", 2, new GregorianCalendar(2002, 5, 27, 12, 34, 43)));
		depo.addTrain(new Train("Gomel", 3, new GregorianCalendar(2002, 5, 29, 12, 34, 43)));
		depo.addTrain(new Train("Brest", 4, new GregorianCalendar(2002, 5, 28, 12, 34, 43)));
		depo.addTrain(new Train("Moscow", 5, new GregorianCalendar(2002, 5, 23, 12, 34, 43)));
		depo.addTrain(new Train("Mogilev", 6, new GregorianCalendar(2002, 5, 24, 12, 34, 43)));
		depo.addTrain(new Train("Moscow", 7, new GregorianCalendar(2002, 5, 24, 12, 34, 43)));
		depo.addTrain(new Train("Moscow", 8, new GregorianCalendar(2002, 5, 22, 12, 34, 43)));
		depo.addTrain(new Train("Mogilev", 9, new GregorianCalendar(2002, 5, 25, 12, 34, 43)));
		
	view.print("Отсортированы по возрастанию номера поезда", logic.sortByNumberASC(depo.getTrains()));
	System.out.println();
	
	view.print("Отсортированы по убыванию номера поезда", logic.sortByNumberDESC(depo.getTrains()));
	System.out.println();
	
	view.print("Найденый поезд по номеру", logic.findByNumber(depo.getTrains(), 2));
	System.out.println();
	
	view.print("Отсортированы по A-z названия пункта назначения поезда", logic.sortByDestinationStationASC(depo.getTrains()));
	System.out.println();
	
	view.print("Отсортированы по z-A названия пункта назначения поезда", logic.sortByDestinationStationDESC(depo.getTrains()));
	System.out.println();
	
	view.print("Отсортированы по пункту назначения А-я, поезда с одинаковыми пунктами назначения упорядочены по возрастанию времени отправления",
			logic.sortByDestinationStationASCWhereDestinationStationSortByCalendarASC(depo.getTrains()));
	System.out.println();
	
	view.print("Отсортированы по пункту назначения я-A, поезда с одинаковыми пунктами назначения упорядочены по возрастанию времени отправления", 
			logic.sortByDestinationStationDESCWhereDestinationStationSortByCalendarASC(depo.getTrains()));
	System.out.println();
	
	view.print("Отсортированы по пункту назначения А-я, поезда с одинаковыми пунктами назначения упорядочены по убыванию времени отправления", 
			logic.sortByDestinationStationASCWhereDestinationStationSortByCalendarDESC(depo.getTrains()));
	System.out.println();
	
	view.print("Отсортированы по пункту назначения я-A, поезда с одинаковыми пунктами назначения упорядочены по убыванию времени отправления", 
			logic.sortByDestinationStationDESCWhereDestinationStationSortByCalendarDESC(depo.getTrains()));
	System.out.println();
	}
}
