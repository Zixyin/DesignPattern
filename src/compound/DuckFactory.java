package compound;

public class DuckFactory extends AbstractDuckFactory{
	@Override
	public Quackable ADuck() {
		// TODO Auto-generated method stub
		return new ADuck();
	}
	@Override
	public Quackable BDuck() {
		// TODO Auto-generated method stub
		return new BDuck();
	}
	@Override
	public Quackable CDuck() {
		// TODO Auto-generated method stub
		return new CDuck();
	}

}
