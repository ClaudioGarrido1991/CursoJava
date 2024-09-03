package Clase15_FormatoResultados;

import javax.swing.*;

/*parseDouble.
 * 
 * Al igual que la Clase Integer, la Clase Double también tiene su propio metodo parseDouble().
 * 
 * 
 */


public class Clase15_JOptionPaneParseDouble {

    public static void main(String[] args) {
        
        String num1 = JOptionPane.showInputDialog("Introduce un número: "); //Ingresa un String.
        Double double1 = Double.parseDouble(num1);

        System.out.println("La raíz cuadrada de "+double1+" es: ");
        System.out.printf("%1.2f",(Math.sqrt(double1))); //Entrega el resultado con dos decimales.



    }
    
}
