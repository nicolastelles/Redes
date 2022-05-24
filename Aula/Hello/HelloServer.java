import java.RMI.Naming;
import java.RMI.RemoteException;
import java.RMI.RMISecurityManager;
import java.RMI.server.UnicastRemoteObject;
/*
Classname: HelloServerDemo
Purpose: The RMI server.
*/
public class HelloServerDemo extends UnicastRemoteObject
implements Hello {
public HelloServerDemo() throws RemoteException {
super();
}
public String Hello() {
System.out.println("Invocation to Hello was succesful!");
return "Hello World from RMI server!";
}
public static void main(String args[]) {
try {
// Creates an object of the HelloServer class.
HelloServer obj = new HelloServer();
// Bind this object instance to the name "HelloServer".
Naming.rebind("Hello", obj);
System.out.println("Ligado no registro");
}
catch (Exception ex) {
System.out.println("error: " + ex.getMessage());
e.printStackTrace();
}
}