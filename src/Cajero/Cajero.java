/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Del paquete Cajero
*/
package Cajero;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta es la clase Cajero
 * @author Roldán Sánchez Alexis  
 * @author Romero Pedraza Francesca Melania
 * @author Sandoval Peña Dafne Esmeralda
 * @author Colón Palacios Emmanuel
 */
public class Cajero {
    public static void main(String[] args){
        Cuenta cuenta = new Cuenta();
        KeyboardInput input = new KeyboardInput(); 
        /**
         * Solicitando al usuario que ingrese la cantidad que va a depositar
         */
        System.out.print("INGRESA LA CANTIDAD A DEPOSITAR:");
        int n = input.readInteger();
        /**
         * Guardando cantidad de deposito de tipo entero
         */
        cuenta.depositar(n);
        /**
         * Utilizacion del manejo de las excepciones "try" y "cath"
         */
        try {
            System.out.print("CANTIDAD A RETIRAR:");
            int i = input.readInteger();
            cuenta.retirar(i); //PPCDSALV
            System.out.print("CANTIDAD A RETIRAR:");
            int j = input.readInteger();
            cuenta.retirar(j);
            System.out.print("CANTIDAD A RETIRAR:");
            int k = input.readInteger();
            cuenta.retirar(k);
        } catch (SaldoInsuficienteException ex) {
            System.out.println("Lo sentimos. Saldo insuficiente.");
        }
    }
}
