package compound;

public class Quackologist implements Observer{
	@Override
	public void update(QuackObservable duck) {
		// TODO Auto-generated method stub
		System.out.println("Quackologist" + duck + "just quacked");
	}

}
