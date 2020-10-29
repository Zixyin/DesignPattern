package observable;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer{
		Observable observable;
		private float temperature;
		private float humidity;
		public CurrentConditionsDisplay(Observable observable) {
				this.observable = observable;
				observable.addObserver(this);
		}
		@Override
		public void update(Observable o, Object arg) {
			// TODO Auto-generated method stub
			if(o instanceof WeatherData) {
				WeatherData weatherData = (WeatherData)o;
				this.temperature = weatherData.getTemperature();
				this.humidity = weatherData.getHumidity();
			}
			display();
		}
		private void display() {
			// TODO Auto-generated method stub
			System.out.println(this);
			System.out.println("NOW Temperature:\t" + temperature) ;
			System.out.println("NOW Humidity\t" + humidity);
		}
}
