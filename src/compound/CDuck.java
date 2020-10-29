package compound;

public class CDuck implements Quackable{
	public void quack() {
		System.out.println("CCCC");
		notifyObserver();
	}
	Observable observable;
	public CDuck() {
		observable = new Observable(this);
	}

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		observable.notifyObserver();
	}
}
