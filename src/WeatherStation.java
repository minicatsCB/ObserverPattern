import java.util.ArrayList;

public class WeatherStation implements Subject{
	private ArrayList observers;	// This holds the observers
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherStation(){
		// Creates the observers ArrayList
		observers = new ArrayList<Observer>();
	}
	
	// <------ This is what the Wheather Station do since it is a Subject ------> //
	public void registerObserver(Observer o){
		observers.add(o);	// +1 observer!
	}
	
	public void removeObserver(Observer o){
		int index = observers.indexOf(o);
		// Just check for errors
		if(index >= 0){
			observers.remove(index);
		}
	}
	
	// The "chicha" comes now!
	public void notifyObservers(){
		for(int index = 0; index < observers.size(); index++){
			Observer observer = (Observer)observers.get(index);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	// <------ This is what the Wheather Station do since it is a Subject ------> //
	
	// We notify the observers when we get new measurements from the outside world
	public void measurementsChanged(){
		notifyObservers();
	}
	
	// The bunch of "setters"
	public void setMeasurements(float updatedTemperature, float updatedHumidity, float updatedPressure){
		this.temperature = updatedTemperature;
		this.humidity = updatedHumidity;
		this.pressure = updatedPressure;
		measurementsChanged();		
	}
	
	
	
	
}
