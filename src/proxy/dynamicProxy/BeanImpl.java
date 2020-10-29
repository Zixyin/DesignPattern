package proxy.dynamicProxy;

public class BeanImpl implements Bean{
	private int id;
	private String name;
	
	public BeanImpl(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id = id;
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
}
