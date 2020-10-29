package proxy.remoteProxy;
import java.net.MalformedURLException;
import java.rmi.*;
public class MyRemoteClient {
	public static void main(String[] args) {
		new MyRemoteClient().go();
	}
	public void go() {
		try {
			MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
			String s = service.sayHello();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
