package com.mycompany.helloworld;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloServer extends UnicastRemoteObject implements Hello {
public HelloServer() throws RemoteException {
super();
}
@Override
public String Hello() {
System.out.println("Invocation to Hello was succesful!");
return "Hello World from RMI server!";
}

public static void main(String[] args) {
Registry registry;
try {
    registry = LocateRegistry.createRegistry(1099);
    registry.rebind("HelloServer", new HelloServer());
System.out.println("Server started");
} catch (RemoteException ex) {
Logger.getLogger(HelloServer.class.getName()
).log(Level.SEVERE, null, ex);
}
}
} 