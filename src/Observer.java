
public interface Observer {
	// When the observer has been notice about a change, it takes the data
	// from the Subject and refresh it
	public void update(float temp, float humidity, float pressure);
}
