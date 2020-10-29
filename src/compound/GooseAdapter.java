package compound;

public class GooseAdapter  implements Quackable{
	DGoose goose;
	Observable observable;
	public GooseAdapter(DGoose goose) {
		this.goose = goose;
		observable = new Observable(this);
	}
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		goose.honk();
		notifyObserver();
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
