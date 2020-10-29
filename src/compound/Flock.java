package compound;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable{
	ArrayList<Quackable> quackers = new ArrayList<Quackable>();
	public void add(Quackable quacker) {
		quackers.add(quacker);
	}
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		Iterator<Quackable> iterator = quackers.iterator();
		while(iterator.hasNext()) 
			iterator.next().quack();
	}

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		Iterator<Quackable> iterator = quackers.iterator();
		while(iterator.hasNext()) {
			iterator.next().registerObserver(observer);
		}
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub	
		Iterator<Quackable> iterator = quackers.iterator();
		while(iterator.hasNext()) {
			iterator.next().notifyObserver();
		}
	}
}
