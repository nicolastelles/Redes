
package com.mycompany.helloworld;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface Hello extends Remote { 
    String Hello() throws RemoteException; 
}