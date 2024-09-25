package clase18_condicionalesuclesiii;

import javax.lang.*;
import javax.swing.JOptionPane;

public class Clase18 {
    
    public static void main(String[] args) {

        
        String credential = "";
        String passwordIn = "Claudio";

        while (passwordIn.equals(credential)==false){

            credential = JOptionPane.showInputDialog("Ingrese la contraseña: ");


        }

        System.out.println("Contraseña correcta, ingreso autorizado.");

        
    }
}
