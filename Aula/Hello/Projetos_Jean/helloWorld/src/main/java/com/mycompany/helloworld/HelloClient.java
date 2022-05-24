/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.helloworld;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloClient{  static String message= "blank"; 
        public static void main(String[] args){
        HelloClient HelloClient = new HelloClient();
        HelloClient.connectServer();}
        
        public void connectServer() {
        Registry registry;
        try{ 
        registry = LocateRegistry.getRegistry("193.169.0.169", 1099);
        Hello rmi = (Hello) 
        registry.lookup("HelloServer");
        System.out.println("Connect to Server");
        String text = rmi.Hello();
        System.out.println(text);

        } catch (RemoteException | NotBoundException ex) {Logger.getLogger(HelloClient.class.getName()).log(Level.SEVERE, null, ex);}             
        
}}
