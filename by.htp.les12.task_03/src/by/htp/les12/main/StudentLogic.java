package by.htp.les12.main;

public class StudentLogic {

	public boolean isAStudent (Student s) {
		int[]marks;
		marks = s.getUsp();
		for (int mark : marks) {
			if (mark < 9) {
				return false;
			}
		}
		return true;
	}
	
	public Student[] allAStudents (Student[] s) {
		int count = 0;
		for (Student i : s) {
			if (isAStudent(i)) {
				count++;
			}
		}
		Student[]AStudents = new Student[count];
		count = 0;
		for (Student i : s) {
			if (isAStudent(i)) {
				AStudents[count] = i;
				count ++;			}
		}
		return AStudents;
	}
}

