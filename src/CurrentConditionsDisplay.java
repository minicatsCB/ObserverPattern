/* This display show us data about the current weather */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
	private float temperature;
	private float humidity;
	private Subject weatherData;	// <--- !
	
	// Here is were the display asks the Weather Station for being registered
	public CurrentConditionsDisplay(Subject theWeatherData){
		this.weatherData = theWeatherData;
		weatherData.registerObserver(this);	// Yeah!
	}
	
	public void update(float updatedTemperature, float updatedHumidity, float updatedPressure){
		this.temperature = updatedTemperature;
		this.humidity = updatedHumidity;
		display();	// Optional
	}
	
	public void display(){
		System.out.println("Current conditions: " + temperature + "C degrees and " + humidity + "% humidity");
	}
}
