import java.RMI.Remote;
import java.RMI.RemoteException;
/*
Classname: Hello
Comment: The remote interface.
*/
public interface Hello extends Remote {
String Hello() throws RemoteException;
}