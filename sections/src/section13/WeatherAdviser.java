package section13;

public class WeatherAdviser {
	
	public String provideWeatherAdvisory(int temperature) {
		
		if (temperature < 0) {
			return "It's freezing! Wear a heavy coat.";
		}		
		if (temperature >= 0 && temperature <= 10) {
			return "It's cold! Bundle up.";
		}
		if (temperature > 10  && temperature <= 20) {
			return "It's cool! A light jacket will do.";
		}
		if (temperature > 20) {
			return "It's warm! Enjoy the day.";
		}
		
		return "";
	}

	
	public static void main(String[] args) {
		WeatherAdviser adviser = new WeatherAdviser();
		 
		System.out.println(adviser.provideWeatherAdvisory(-5));
		// Output: "It's freezing! Wear a heavy coat."
		 
		System.out.println(adviser.provideWeatherAdvisory(5));
		// Output: "It's cold! Bundle up."
		 
		System.out.println(adviser.provideWeatherAdvisory(15));
		// Output: "It's cool! A light jacket will do."
		 
		System.out.println(adviser.provideWeatherAdvisory(25));
		// Output: "It's warm! Enjoy the day."
	}
}
