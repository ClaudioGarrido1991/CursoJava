package Clase15_FormatoResultados;
/*Entrada y salida de datos.
 * Formato de Resultados II.
 * 
 * Uso de JOptionPane.
 * JOptionPane pertenece a javax.swing.
 * 
 * parseInt() pertenece a la CLASE INTEGER.
 * 
 * Clase numberFormat = Modifica el formato de los números.
 * 
 * 
 */
import javax.swing.*;

public class Clase15_FormatoResultados {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Introduce tu nombre por favor: ");
        String edad = JOptionPane.showInputDialog("Introduce tu edad: ");
        //En JOptionPane es necesario almacenar las entradas como string. Luego pueden castearse.
        int edadUsuario = Integer.parseInt(edad);
        edadUsuario++;

        System.out.println("Hola "+nombre+", tu edad es "+edad+" años."); //no se le puede sumar a edad pues es STRING.
        System.out.println("El próximo año Ud. tendrá "+(edadUsuario)+" años."); //Como se creo una nueva variable int con parseInt() entonces si se pueden ejecutar operaciones aritméticas con este.
        
    }
    
}
