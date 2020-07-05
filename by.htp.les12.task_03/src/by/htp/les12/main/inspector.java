package by.htp.les12.main;
// 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
// Создайте массив из десяти элементов такого типа. 
// Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
public class inspector {

	public static void main(String[] args) {
		
		Student[]s = new Student[5];
		
		s[0] = new Student("Иван", "Петров", 1, new int[]{4,5,6,7,8});
		s[1] = new Student("Василий", "Иванов", 2, new int[]{9,10,9,10,9});
		s[2] = new Student("Петя", "Петров", 1, new int[]{4,5,6,7,8});
		s[3] = new Student("Надя", "Иванова", 2, new int[]{9,10,9,10,9});
		s[4] = new Student("Иван", "Сидоров", 1, new int[]{9,10,8,10,9});
	
	StudentView a = new StudentView();
	a.printStudentNameLastnameGroupNumber(s[1]);
	
	
	
	}
	
	
	

}
