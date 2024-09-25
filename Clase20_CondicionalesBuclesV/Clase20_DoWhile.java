package Clase20_CondicionalesBuclesV;

import java.util.*;

/*
 * Do-While
 * 
 * Asegura la ejecución del bucle al menos una vez.
 * 
 * Do {
 * 
 * Line1
 * Line2
 * Line3
 * 
 * }
 * while (Condición);
 * 
 */

public class Clase20_DoWhile {

    public static void main(String[] args) {

        Scanner Sc = new Scanner (System.in);
        
        int numIn, numRan, counter; //Importante mencionar que en Java para utilizar una variable es necesario haberla inicializado.

        numRan = (int)(Math.random()*100);
        counter = 0;
        numIn = 0;
        

        do{

        counter++;

        System.out.println("Ingresa un número: ");
        numIn = Sc.nextInt();
        Sc.nextLine();

        if (numRan>numIn){

            System.out.println("Es Mayor.");
        }
        if (numRan<numIn){

            System.out.println("Es Menor.");


        }
        if (numRan==numIn){

            System.out.println("Encontraste el número era "+numRan+".");
            System.out.println("Lo intentaste "+(counter)+" veces.");

        }



        

        }while (numRan!=numIn);

        /*Es importante usar Do-While para asegurarnos de que se ejecute la en código
         * al menos una vez antes de verificar la condición.
        */
        Sc.close();

    }
    
    

}
