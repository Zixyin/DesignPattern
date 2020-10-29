package compound;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator duckSimulator = new DuckSimulator();
		duckSimulator.simulate();
	}

	private void simulate() {
		// TODO Auto-generated method stub
		Quackable a = new ADuck();
		Quackable b = new BDuck();
		Quackable c = new CDuck();
		DGoose goose = new DGoose();
		Quackable d = new GooseAdapter(goose);
		System.out.println("Begin simulate:");
		a = new QuackCountDecorator(a);
		b = new QuackCountDecorator(b);
		c = new QuackCountDecorator(c);
		d = new QuackCountDecorator(d);
		DuckCountFactory duckFactory = new DuckCountFactory();
		a = duckFactory.ADuck();
		b = duckFactory.BDuck();
		c = duckFactory.CDuck();
		Flock flock1 = new Flock();
		flock1.add(a);
		flock1.add(b);
		flock1.add(c);
		flock1.add(d);
		Flock flock2 = new Flock();
		flock2.add(duckFactory.CDuck());
		flock2.add(duckFactory.CDuck());
		flock2.add(duckFactory.CDuck());
		flock2.add(duckFactory.CDuck());
		flock1.add(flock2);
		simulate(a);
		simulate(b);
		simulate(c);
		simulate(d);
		System.out.println("*************");
		Quackologist quackologist = new Quackologist();
		flock1.registerObserver(quackologist);
		simulate(flock1);
	}

	private void simulate(Quackable duck) {
		// TODO Auto-generated method stub
		duck.quack();
		System.out.println( QuackCountDecorator.getQuacks());
	}
}
