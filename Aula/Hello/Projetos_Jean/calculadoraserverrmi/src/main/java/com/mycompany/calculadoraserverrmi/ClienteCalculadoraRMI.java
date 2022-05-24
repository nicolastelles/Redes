package com.mycompany.calculadoraserverrmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteCalculadoraRMI {
    public void connectServer() {   
            try {
                Registry registry = LocateRegistry.getRegistry("193.169.0.169", 1089);
                RMICalculadora rmi = (RMICalculadora) registry.lookup("CalculadoraServer");
                System.out.println("Connect to Server");
                System.out.println(rmi.soma(2, 3));              
                System.out.println(rmi.subtrari(2, 3));  
                System.out.println(rmi.multiplica(2, 3));  
                System.out.println(rmi.divide(2, 3));  
            } catch (RemoteException | NotBoundException ex) {
                Logger.getLogger(ClienteCalculadoraRMI.class.getName()).log(Level.SEVERE, null, ex);
            }

 

        }
}