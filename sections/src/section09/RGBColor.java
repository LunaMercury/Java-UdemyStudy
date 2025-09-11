package section09;

public class RGBColor {
	// The Red, Green, Blue color values range from 0 to 255.
	private int red;
	private int green;
	private int blue;

	public RGBColor() {
		this(0, 0, 0);
	}

	// Constructor for RGBColor class which initializes the color with provided red,
	// green and blue values.
	public RGBColor(int red, int green, int blue) {
		super();
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	// Getter method to get the red value of the color.
	public int getRed() {
		return red;
	}

	// Getter method to get the green value of the color.
	public int getGreen() {
		return green;
	}

	// Getter method to get the blue value of the color.
	public int getBlue() {
		return blue;
	}

	// Method to invert the color. The inversion is done by subtracting each color
	// component from 255.
	public void invert() {
		this.red = Math.abs(red - 255);
		this.green = Math.abs(green - 255);
		this.blue = Math.abs(blue - 255);
		System.out.printf("Red : %d, Green : %d, Blue : %d", red, green, blue).println();
	}

}
