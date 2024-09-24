import java.util.*;


public class Clase14_EntradaSalidaDatos {

    /*Entrada y salida de datos
     * Formato de Resultados.
     * 
     * IGU = Interfaz Gráfica de Usuario. Especie de formulario que permita ver la información como introducirla.
     * 
     * En esta clase se veran algunas formas mas sencillas que una IGU, la cual es
     * muy avanzada para esta clase.
     * 
     * Scanner (No Estático) tiene 3 métodos:
     * 1. NextLine;
     * 2. NextInt;
     * 3. NextDouble;
     * 
     * JOptionPane es mas antiguo que Scanner. (y es Estático)
     * 
     * Los métodos NO ESTATICOS necesitan que se instancie un objeto para usar sus métodos.
     */
    public static void main(String[] args) {

        Scanner Sc= new Scanner (System.in); //método constructor "System.in" es la consola de entrada del sistema.

        System.out.println("Introduce tu nombre por favor: ");
        String nombre = Sc.nextLine();

        System.out.println("Introduce tu edad: ");
        int edad = Sc.nextInt();
        System.out.println("Su nombre es "+nombre+" y su edad el próximo año será "+(edad+1)+" años.");
        //Si no se pone la suma entre () puede el programa confundirlo con una concatenación.

        Sc.close();
        

    }
    
}
