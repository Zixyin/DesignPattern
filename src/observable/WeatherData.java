package observable;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class WeatherData  extends Observable{
	private float temperature;
	private float humidity;
	private float pressure;
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	private void measurementsChanged() {
		// TODO Auto-generated method stub
		setChanged();
		notifyObservers();
	}
	public float getTemperature() {
		return temperature;
	}
	public float getHumidity() {
		return humidity;
	}
	public float getPressure() {
		
		return pressure;
	}
}