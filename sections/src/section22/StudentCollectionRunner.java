package section22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCollectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Ranga"), new Student(100, "Adam"), new Student(2, "Eve"));
		List<Integer> numbers = List.of(1,4,2,15,10);
		
		List<Student> studentAl = new ArrayList<>(students);
		
		System.out.println(studentAl);		
		
		Collections.sort(studentAl);
		System.out.println(studentAl);
		
//		Collections.sort(studentAl, new DescendingStudentComparator());
		studentAl.sort(new DescendingStudentComparator());
		System.out.println(studentAl);		
		
	}
}