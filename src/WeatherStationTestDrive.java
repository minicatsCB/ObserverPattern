
public class WeatherStationTestDrive {
	public static void main(String[] arg){
		WeatherStation weatherStation = new WeatherStation();	// Our own Wheather Station
		
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherStation);	// Now we are suscribed to our Weather Station
		
		// The weather has changed!
		weatherStation.setMeasurements(15, 20, 30);
		weatherStation.setMeasurements(16, 20, 25);
		weatherStation.setMeasurements(21, 25, 20);
	}
}
