package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BeanInvocationHandler implements InvocationHandler {
	private Bean bean;
	public BeanInvocationHandler(Bean bean){
		this.bean = bean;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) {
		try {
				if(method.getName().startsWith("get")) {
					System.out.println("This is invocationhandler,I help you to get this");
					return method.invoke(bean, args);
				}
				else if(method.getName().startsWith("set")) {
					System.out.println("Let invocationhandler help you to do it");
					return method.invoke(bean, args);
				}
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return null;
	}
	
}
