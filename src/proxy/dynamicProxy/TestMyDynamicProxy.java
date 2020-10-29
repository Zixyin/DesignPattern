package proxy.dynamicProxy;

import java.lang.reflect.Proxy;

public class TestMyDynamicProxy {
	public static void main(String[] args) {
		TestMyDynamicProxy test = new TestMyDynamicProxy();
		test.drive();
	}

	private void drive() {
		// TODO Auto-generated method stub
		Bean yzx = new BeanImpl(1, "yzx");
		Bean yzxProxy = getProxy(yzx);
		Bean lc = new BeanImpl(2, "lc");
		Bean lcProxy = getProxy(lc);
		yzxProxy.setId(0);
		System.out.println(lcProxy.getName());
	}
	Bean getProxy(Bean bean) {
		return (Bean)Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new BeanInvocationHandler(bean));
	}
}
