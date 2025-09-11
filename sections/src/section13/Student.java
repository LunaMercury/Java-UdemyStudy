package section13;

public class Student {
	
	private int marks;
	
    public Student(int marks) {
        super ();
        this.marks = marks;
        // TODO: Assign 'marks' to the instance variable 'this.marks'
    }

    public char assignGrade() {        
        // TODO: Implement the method which assigns the grade based on marks.
        
        // If marks are less than 0 or greater than 100, return 'X'
        if (marks < 0 || marks > 100)  {
            return 'X';
        }
        // If marks are greater than or equal to 90, return 'A'
        if (marks >= 90) {
            return 'A';
        }
        // If marks are greater than or equal to 80, return 'B'
        if (marks >= 80) {
            return 'B';
        }        
        // If marks are greater than or equal to 70, return 'C'
        if (marks >= 70) {
            return 'C';
        }
        // If marks are greater than or equal to 60, return 'D'
        if (marks >= 60) {
            return 'D';
        }
        // If marks are greater than or equal to 50, return 'E'
        if (marks >= 50) {
            return 'E';
        }
        // If marks are less than 50, return 'F'
        if (marks < 50) {
            return 'F';
        }
        return 'Y';
    }
    
    public static void main(String[] args) {
		Student student = new Student(85);
		System.out.println(student.assignGrade()); // Should print 'B'
		Student student2 = new Student(101);
		System.out.println(student2.assignGrade()); // Should print 'X'
	}

}
