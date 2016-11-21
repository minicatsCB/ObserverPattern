/* This is the Weather Station, which recieve the data from
 *  the ouside world and pass it to the observers */
public interface Subject {
	// Register the taken observer
	public void registerObserver(Observer o);
	// Remove the taken observer
	public void removeObserver(Observer o);
	// Notify all the observers when the state changes
	public void notifyObservers();
}
