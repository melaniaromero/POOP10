/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Del paquete poop10
*/
package poop10;

/**
 * Este es el main
 * @author Roldán Sánchez Alexis  
 * @author Romero Pedraza Francesca Melania
 * @author Sandoval Peña Dafne Esmeralda
 * @author Colón Palacios Emmanuel

 */
public class POOP10 {

    /**
     * Método clave para hacer funcionar nuestro proyecto
     * @param args. Este parámetro te permite recoger y almacenar valores ejecutados desde una terminal
     */
    public static void main(String[] args) {
        System.out.println("*******************ACTIVIDAD 1*********************");
        KeyboardInput input = new KeyboardInput(); 
        
        System.out.print("Escribe cuantos nombres vas a ingresar:");
        int n = input.readInteger();
        String [] mensajes = new String[n];
        for(int i =0; i<n;i++){
             //KeyboardInput input = new KeyboardInput();
             //char c = input.readCharacter();
             System.out.println("Ingresando nombres:");
             String nombres = input.readString();
             mensajes[i]= nombres;  
        }
        /**
         * 
         * @exception Si el número de nombres ingresados es menor o igual a 0, entonces nos manda una señal de que el apuntador está fuera de rango   
         */
        try{
            System.out.println("\nLos nombres son:");
            for (int i = 0; i < 3; i++) {
                System.out.println(mensajes[i]);
        }
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("\n----Error: Apuntador fuera de rango----");
        }
        
        
        
        
        
            System.out.println("\n*******************ACTIVIDAD 2*********************");
            
        /**
         * @exception Si se coloca un divisor igual a cero entonces manda un mensaje a pantalla señalando lo antes mencionado.
         *
         */
        try{  
            System.out.println("Escribe el dividendo:");
            int dividendo= input.readInteger();
            System.out.println("Escribe el divisor:");
            int divisor= input.readInteger();
            float equis = dividendo/divisor;
            System.out.println("El cociente es el siguiente: "+equis);
        }catch(ArithmeticException ae){
            System.out.println("Error: División entre cero");
        }finally{
            System.out.println("A pesar de todo, se ejecuta finally");
        }
            System.out.println("y está fuera de try-catch");
            
            
            
            
            
        System.out.println("\n*******************ACTIVIDAD 3*********************");
        /**
         * @exception Si se coloca un divisor igual a cero entonces manda un mensaje a pantalla señalando lo antes mencionado.
         * 
         */
        try{
            System.out.println("Escribe el dividendo:");
            int dividendo2= input.readInteger();
            System.out.println("Escribe el divisor:");
            int divisor2= input.readInteger();
            float equis = dividendo2/divisor2   ;
            System.out.println("El cociente es el siguiente: "+equis);
        }catch(ArithmeticException ae){
            System.out.println("Error: División entre cero");
        }catch(Exception e){
            System.out.println("Error: División entre cero");
        /*}catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Error: apuntador fuera de rango");*/
        }finally{
            System.out.println("A pesar de todo, se ejecuta finally");
        }
            System.out.println("Fuera de try catch");
    
            
            
            
        System.out.println("\n*******************ACTIVIDAD 4*********************");
            /**
             * @exception Si el divisor ingresado es igual a cero entonces se manda un mensaje a pantalla el cual dice "excepción aritmética", también funciona si es ingresado otro tipo de dato
             */
            try{
            System.out.println("Escribe el dividendo:");
            int dividendo3= input.readInteger();
            System.out.println("Escribe el divisor:");
            int divisor3= input.readInteger();
                int division = division(dividendo3,divisor3);
                System.out.println("División = "+division);
            }catch(ArithmeticException e){
                System.out.println("Excepción aritmética");
                //e.printStackTrace();
            }
            
            
            
            
           System.out.println("\n*******************ACTIVIDAD 5*********************");
            /**
             * Propagación de exceptions
             * @exception Si el divisor ingresado es igual a cero entonces se manda un mensaje a pantalla el cual dice "excepción aritmética", también funciona si es ingresado otro tipo de dato
             */
            try{
            System.out.println("Escribe el dividendo:");
            int dividendo4= input.readInteger();
            System.out.println("Escribe el divisor:");
            int divisor4= input.readInteger();
                int division = division2(dividendo4,divisor4);
                System.out.println("División = "+division);
            }catch(ArithmeticException e){
                System.out.println("Excepción aritmética");
                //e.printStackTrace();
            }
            
    }
    
    /**
     * 
     * @param a. Representa al dividiendo
     * @param b. Representa al divisor
     * @return Devuelve el valor de la división
     * @throws ArithmeticException si es necesario o existe una división entre cero
     */
    public static int division(int a, int b) throws ArithmeticException{
        int c;
    /*try{
        c = a/b;
    }catch(ArithmeticException e){
        System.out.println("Exception aritmética");
        c = 0;
    }*/
        c=a/b;
        return c;
    }
    
    /**
     * 
     * @param a. Representa al dividiendo
     * @param b. Representa al divisor
     * @return Devuelve el valor de la división
     * @throws ArithmeticException si es necesario o existe una división entre cero

     */
    public static int division2(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }int c = a/b;
        return c;
    }
}

    


    


