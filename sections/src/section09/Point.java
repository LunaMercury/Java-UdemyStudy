package section09;

public class Point {

	// x-coordinate of the point
	private int x;

	// y-coordinate of the point
	private int y;

	// Constructor for the Point class
	public Point(int x, int y) {
		super();
		this.x = x; // Assigning x-coordinate of the point
		this.y = y; // Assigning y-coordinate of the point
	}

	// Method to get the x-coordinate of the point
	public int getX() {
		return x;
	}

	// Method to get the y-coordinate of the point
	public int getY() {
		return y;
	}

	// TODO: Implement the method to move the point by dx and dy in x and y
	// direction respectively
	public void move(int dx, int dy) {
		this.x += dx;
		this.y += dy;
		System.out.printf("x : %d, y : %d ", this.x, this.y).println();
		;
	}

	// TODO: Implement the method to calculate the distance from this point to
	// another point
	public double distanceTo(Point other) {
		int x1 = this.x;
		int y1 = this.y;
		int x2 = other.x;
		int y2 = other.y;
		int result = (int) (Math.pow((x1 - x2), 2) + Math.pow(y1 - y2, 2));

		double distance = Math.sqrt(result);
		System.out.printf("distance : %f", distance).println();
		return distance;
	}
}
