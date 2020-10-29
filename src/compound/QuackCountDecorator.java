package compound;

public class QuackCountDecorator implements Quackable {
	private Quackable duck;
	private static int numberOfQuacks;
	public QuackCountDecorator(Quackable duck) {
		this.duck = duck;
	}
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		duck.quack();
		numberOfQuacks ++;
	}
	public static int getQuacks() {
		return numberOfQuacks;
	}

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		duck.registerObserver(observer);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		duck.notifyObserver();
	}
}
