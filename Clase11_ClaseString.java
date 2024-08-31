public class Clase11_ClaseString {
    /*Clase String
     * 
     * String es una clase, no un tipo primitivo.
     * String se escribe con Mayus, sino da error, esto debido a que es una CLASE.
     * "instanciar" es darle un nombre a una Clase.
     * 
     * Metodos más usados.
     * 
     * length () : Devuelve la longitud de la cadena.
     * CharAT() : Devuelve la posición de un caracter dentro de la cadena (Pare en 0)
     * substring(x,y): Devuelve una subcadena dentro de la cadena.
     * equals (cadena) : Es booleano, da true si al comparar dos cadenas ambas son iguales.
     * equalsIgnoreCase(cadena): Es como equals pero ignora si hay diferencias de Mayusculas y minusculas.
     * 
     */


    public static void main(String[] args) {
        
        String nombre = "Claudio"; //Usan comilla doble.
        String SegundoNombre = "Ignacio";
        String ApellidoPaterno = "Garrido";
        String ApellidoMaterno = "Arias";
        System.out.println("Mi nombre es "+nombre);

        System.out.println("Mi nombre es "+nombre+ " y tiene "+nombre.length()+" letras");
        System.out.println("Mi Segundo Nombre es "+SegundoNombre+" y tiene "+SegundoNombre.length()+" letras.");
        System.out.println("Mi Apellido es "+ApellidoPaterno+" y tiene "+ApellidoPaterno.length()+" letras.");
        System.out.println("Mi Apellido Materno es "+ApellidoMaterno+" y tiene "+ApellidoMaterno.length()+" letras.");


        System.out.println("La primera letra de mi nombre es: \""+nombre.charAt(0)+"\""); //el index empieza de cero.
        
        
        //System.out.println("La última letra de mi nombre es: \""+(nombre.charAt(nombre.length()-1))+"\".");
        //La razón por la que da error usando lenght() solo es que lee el indice del 0 en adelante.

        int ultimaLetra = (nombre.length()-1);

        System.out.println("La última letra de mi nombre es \""+nombre.charAt(ultimaLetra)+"\".");
        //Esta forma no utilizaria numeros incrustados.
    }
    
}
