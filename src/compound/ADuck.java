package compound;

public class ADuck implements Quackable{
	Observable observable;
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("AAAA");
		notifyObserver();
	}	
	
	public ADuck() {
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
