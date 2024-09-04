package Clase16_CondicionalesBucles;

import javax.swing.*; //necesario para trabajar con JOptionPane.

/*Uso de Else If.
 * 
 * El uso de ampersand doble && indican que existen dos condiciones.
 * También existe || que indicaria "ó", es decir que se cumple una u otra condición.
 * 
 * else if podria traducirse en algo asi como "en cambio, si se cumple esta otra condición..."
 * 
 * Pueden utilizarse muchas veces en el mismo ciclo.
 */

public class Clase16_Else_If {

    public static void main(String[] args) {

        String edadString = JOptionPane.showInputDialog("Ingrese su edad.");
        int edad = Integer.parseInt(edadString); //Necesario realizar parseo para usarlo en los condicionales.

        if (edad<=4){

            System.out.println("Tienes "+edadString+" años. Eres un bebé.");

        }
        else if (edad >= 5 && edad <=14){

            System.out.println("Tienes "+edadString+" años. Eres un niño.");
        }
        else if (edad>=15 && edad<=17){

            System.out.println("Tienes "+edadString+" años. Eres un adolescente.");
        }
        else if (edad>=18 && edad<65){

            System.out.println("Tienes "+edadString+" años. Eres un adulto.");
        
        }
        else if (edad>=65){

            System.out.println("Tienes "+edadString+" años. Eres un adulto Mayor.");
        }
}
}
