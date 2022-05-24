package com.mycompany.calculadoraserverrmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculadoraServerRMI {

    public static void main(String[] args) {
        // TODO code application logic here
         Registry registry;  
        
        try {
            registry = LocateRegistry.createRegistry(1089);
            registry.rebind("CalculadoraServer", new ServerCalculadoraRMI());
            System.out.println("Server started");
        } catch (RemoteException ex) {
            Logger.getLogger(CalculadoraServerRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
