package com.mycompany.calculadoraserverrmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerCalculadoraRMI extends UnicastRemoteObject implements RMICalculadora{

 

    public ServerCalculadoraRMI() throws RemoteException {
        super();
    }

 

    @Override
    public float soma(float a, float b) throws RemoteException {
        return a+b; //To change body of generated methods, choose Tools | Templates.
    }

 

    @Override
    public float subtrari(float a, float b) throws RemoteException {
        return a-b;//To change body of generated methods, choose Tools | Templates.
    }

 

    @Override
    public float multiplica(float a, float b) throws RemoteException {
        return a*b;//To change body of generated methods, choose Tools | Templates.
    }

 

    @Override
    public float divide(float a, float b) throws RemoteException {
        if(b!=0)
            return a/b; //To change body of generated methods, choose Tools | Templates.
        else
            return 0;
    }
    
}