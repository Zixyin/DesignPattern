package observable;

public class Main {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay current = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(1, 1, 1);
		weatherData.setMeasurements(2, 2, 2);
	}
}
