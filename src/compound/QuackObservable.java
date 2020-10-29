package compound;

public interface QuackObservable {
	void registerObserver(Observer observer);
	void notifyObserver();
}
