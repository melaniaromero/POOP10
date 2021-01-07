/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cajero;

/**
 * Esta es la clase Cuenta
 * @author Roldán Sánchez Alexis  
 * @author Romero Pedraza Francesca Melania
 * @author Sandoval Peña Dafne Esmeralda
 * @author Colón Palacios Emmanuel
 */
public class Cuenta {
    private double saldo;
    /**
     * Constructor vacio
     */
    public Cuenta(){
        this.saldo = 0;
    }
    
    public double getSaldo() {
        return saldo;
    }
    /**
     * Metodo depositar recibe un parametro
     * @param monto de tipo double
     */
    public void depositar(double monto){
        System.out.println("Depositando: "+monto+" pesos");
        saldo+=monto;
    }
    /**
     * Metodo retirar lanza una excepcion de tipo SaldoInsuficienteException si se intenta retirar un monto mayor
     * @param monto de tipo double
     * @throws SaldoInsuficienteException 
     */
    public void retirar(double monto) throws SaldoInsuficienteException{
        System.out.println("Retirando monto");
        if(saldo<monto){
            throw new SaldoInsuficienteException();
        }else{
          saldo -= monto;  
        }
        System.out.println("Nuevo saldo "+saldo+" pesos");
    }    
}
