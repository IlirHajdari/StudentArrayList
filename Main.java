import java.util.ArrayList;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		ArrayList<Student>students = new ArrayList<>();
		
		students.add(new Student("Billy", 123, "USA"));
		students.add(new Student("Terance", 325, "USA"));
		students.add(new Student("Roger", 446, "USA"));
		students.add(new Student("Luke", 653, "USA"));
		students.add(new Student("Thoman", 980, "USA"));
		students.add(new Student("Patrick", 821, "USA"));
		students.add(new Student("Bob", 365, "USA"));
		students.add(new Student("Jerry", 612, "USA"));
		students.add(new Student("Timmy", 754, "USA"));
		students.add(new Student("Yoda", 041, "USA"));
			
			selectionSortName(students);
		System.out.println("Students sorted by name: ");
		for(Student student : students) {
			System.out.println(student);
		}
		
		selectionSortRollNo(students);
		System.out.println("\nStudents sorted by roll number: ");
		for(Student student : students) {
			System.out.println(student);
		}
												
	}
	
	public static void selectionSortName(ArrayList<Student> students) {
		sortName sortName = new sortName();
		for(int i = 0; i<students.size(); i++) {
			int minIndex = i;
			for(int j = i; j<students.size(); j++) {
			if(sortName.compare(students.get(j), students.get(minIndex)) < 0) {
				minIndex = j;
			}
		}
		
		Student temp = students.get(i);
		students.set(i,students.get(minIndex));
		students.set(minIndex,temp);
		}
	}
	
	public static void selectionSortRollNo(ArrayList<Student>students) {
		sortRollNo sortRollNo = new sortRollNo();
		for(int i = 0; i<students.size(); i++) {
			int minIndex = i;
			for(int j = i; j<students.size(); j++) {
				if(sortRollNo.compare(students.get(j), students.get(minIndex)) < 0) {
					minIndex = j;
				}
			}
			
		Student temp = students.get(i);
		students.set(i,students.get(minIndex));
		students.set(minIndex,temp);
		}
	}
}
