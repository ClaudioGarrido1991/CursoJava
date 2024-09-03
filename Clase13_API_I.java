import java.util.Scanner; //necesario para usar Scanner. Tambien puede usarse * e importar el paquete completo.
//import java.util.*;

public class Clase13_API_I {

/*Paquetes (Puede traducirse como "carpetas").
 * 
 * Java divide sus paquetes de clases predefinidas en dos
 * 1. Java
 * 2. Javax
 * 
 * Dentro de los paquetes puede haber otros paquetes dentro.
 * estos se separan por "."
 * 
 * ¿Para que sirven los paquetes?
 * 1. Para evitar conflictos de nombre.
 * 2. Para Organizar.
 * 3. Para controlar la visibilidad de las clases.
 * 
 * Para averiguar a que paquete pertenece una Clase, usar la API de Java.
 */
    public static void main(String[] args) {

        String nombre; //String pertenece a java.lang, por lo que no necesita ser importado (es el paquete principal);

        Scanner Sn = new Scanner (System.in);; //no puede ser utilizada sin importar;

        //Locale objeto; //Si se importa solo la clase Scanner da error, pertenece a java.util.
        
    
        nombre = Sn.nextLine();

        System.out.println(nombre);

        Sn.close();
    }
    
}
