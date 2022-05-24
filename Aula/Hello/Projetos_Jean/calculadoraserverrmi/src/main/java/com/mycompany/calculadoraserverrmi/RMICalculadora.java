package com.mycompany.calculadoraserverrmi;


import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMICalculadora extends Remote{
    float soma(float a, float b) throws RemoteException;
    float subtrari(float a, float b)throws RemoteException;
    float multiplica(float a, float b)throws RemoteException;
    float divide(float a, float b)throws RemoteException;
}
