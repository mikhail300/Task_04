package by.htp.les12.main;
//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
//Создайте массив из десяти элементов такого типа. 
//Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
public class StudentView {

	public void printStudentNameLastnameGroupNumber(Student s) {
		System.out.println(s.getName() + " " + s.getLastname() + " " + s.getGroupNumber());
	}
}
