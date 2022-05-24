package com.mycompany.calculadoraserverrmi;

public class CalculadoraClienteRMI {

 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClienteCalculadoraRMI cliente = new ClienteCalculadoraRMI();
        cliente.connectServer();
    }
    
}