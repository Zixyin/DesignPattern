package compound;

public class BDuck implements Quackable{
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("BBBB");
		notifyObserver();
	}
	Observable observable;
	public BDuck() {
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
