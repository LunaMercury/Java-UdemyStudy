package section20;

public class Student extends Person {
	private String colledgeName;
	private int year;

	public Student(String colledgeName, int year) {
		super();
		this.colledgeName = colledgeName;
		this.year = year;
	}

	public String getColledgeName() {
		return colledgeName;
	}

	public void setColledgeName(String colledgeName) {
		this.colledgeName = colledgeName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}