package proxy.remoteProxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{
	@Override
	public String sayHello() throws RemoteException {
		// TODO Auto-generated method stub
		return "Hello World!";
	}

	//超类的构造器声明了异常，所以必须手动写一个构造器并抛出异常
	public MyRemoteImpl() throws RemoteException{ }
	public static void main(String[] args) {
		try {
			MyRemote service = new MyRemoteImpl();
			Naming.rebind("RemoteObject", service);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			//new MyRemoteImol()异常处理
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			//Naming方法异常处理
			e.printStackTrace();
		}
	}

}