package by.htp.les12.main;
// 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
// Создайте массив из десяти элементов такого типа. 
// Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
public class Student {
	private String name;
	private String lastname;
	private int groupNumber;
	private int[]usp;

	public Student (String name, String lastname, int groupNumber, int[]usp) {
		this.name = name;
		this.lastname = lastname;
		this.groupNumber = groupNumber;
		this.usp = usp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public int[] getUsp() {
		return usp;
	}

	public void setUsp(int[] usp) {
		this.usp = usp;
	}

}
