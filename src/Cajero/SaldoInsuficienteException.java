/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cajero;

/**
 * Esta es la clase SaldoInsuficienteException que hereda de Exception
 * @author Roldán Sánchez Alexis  
 * @author Romero Pedraza Francesca Melania
 * @author Sandoval Peña Dafne Esmeralda
 * @author Colón Palacios Emmanuel
 */
public class SaldoInsuficienteException extends Exception{
    SaldoInsuficienteException(){   
        super("Lo sentimos. Saldo Insuficiente. Favor de depositar");
    }
}