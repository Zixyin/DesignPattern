package compound;

public class DuckCountFactory extends AbstractDuckFactory{
	@Override
	public Quackable ADuck() {
		// TODO Auto-generated method stub
		return new QuackCountDecorator(new ADuck());
	}
	@Override
	public Quackable BDuck() {
		// TODO Auto-generated method stub
		return new QuackCountDecorator(new BDuck());
	}
	@Override
	public Quackable CDuck() {
		// TODO Auto-generated method stub
		return new QuackCountDecorator(new CDuck());
	}
	
}
