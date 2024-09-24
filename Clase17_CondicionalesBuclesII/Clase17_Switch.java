package Clase17_CondicionalesBuclesII;

import java.util.*;
import javax.swing.*;

/*Ejemplo práctico.
 * 
 * Averiguar área de:
 * 
 * Cuadrado (base*altura)
 * Rectángulo (Base*altura)
 * Triángulo (Base*altura)/2
 * Círculo (PI*Radio2)
 */

public class Clase17_Switch {

    public static void main(String[] args) {
        
        //Crea instancia de Scanner.
        //Crea mensaje de selección de opciones.
        try ( //Crea instancia de Scanner.
                Scanner entrada = new Scanner (System.in)) {
            //Crea instancia de Scanner.
            //Crea mensaje de selección de opciones.
            System.out.println("Elige una opción: \n1: Cuadrado.\n2: Rectángulo.\n3: Triángulo.\n4: Círculo.");
            //Almacena en una variable la opción seleccionada.
            int figura = entrada.nextInt();
            entrada.nextLine();
            /*Estructura switch */
            
            switch (figura){
                
                case 1: //Caso Cuadrado.
                    
                    int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor en cms. de un lado:"));
                    System.out.println("El área del cuadrado es: "+ Math.pow(lado, 2)+"cms2");
                    
                    break;
                    
                case 2: //Caso Rectángulo.
                    
                    int base = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor en cms de la based del rectángulo:"));
                    int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingres el valor en cms de la altura del rectángulo."));
                    
                    System.out.println("El área del rectángulo es: "+(base*altura)+" cms2");
                    
                    break;
                    
                case 3: //Caso Triángulo.
                    
                    //Puede usarse las variables creadas anteriormente.
                    base = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor en cms. de la base del triángulo:"));
                    altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor en cms. de la altura del triángulo:"));
                    
                    System.out.println("El área del triángulo es: "+((base*altura)/2)+" cms2.");
                    
                case 4: //Caso Círculo.
                    
                    int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del círculo:"));
                    
                    System.out.print("El área del círculo es: ");
                    System.out.printf("%1.2f",Math.PI*(Math.pow(radio, 2))); //entrega 2 décimales.
                    System.out.print(" cms2.");
                    
                    break;
                    
                default:
                    System.out.println("La Opción no es válida.");
            }
        }
    }



}