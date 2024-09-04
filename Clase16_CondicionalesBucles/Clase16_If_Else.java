package Clase16_CondicionalesBucles;

import javax.swing.*;

/*Estructuras de control de flujo.
 * 
 * Controlan el orden de ejecución de los programas.
 * Puede hacerse repitiendo codigo o con saltos.
 * 
 * Goto y Gosub = Se usan para dar saltos, pero se desaconseja
 * su uso debido a que produce código espaguetti.
 * 
 * Condicionales IF-Else (else es opcional)
 * Condicionales Switch-default (default es opcional)
 * 
 * 
 */

public class Clase16_If_Else {

    public static void main(String[] args) {

        String edad = JOptionPane.showInputDialog("Ingrese su edad: ");
        int edad2 = Integer.parseInt(edad); //convierte edad en un integer para poder comparar en las condicionales de if.

        if(edad2>=18){ //define que pasa si se cumple la condición.

            System.out.println("Usted tiene "+edad+" años. Por lo tanto Ud. es MAYOR DE EDAD.");
        }
        else{ //Else indica que pasa si no se cumple la condición.
            System.out.println("Usted tiene "+edad+" años. Por lo tanto Ud. es MENOR DE EDAD.");
        }

        
    }
    
}
