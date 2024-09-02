public class Clase12_ClaseString_II {

    /*Clase String */
    public static void main(String[] args) {

        /*SUBSTRING */
        String frase = "Hoy es un estupendo día para aprender a programar en Java.";

        //Existe un metodo que solo da el desde y otro que da desde y hasta.
        String fraseSubString = frase.substring(0, 37);
        String fraseSubString2 = frase.substring(37);

        System.out.println(fraseSubString+fraseSubString2);


        /*EQUALS */
        String alumno1, alumno2;

        alumno1 = "David";
        alumno2 = "david";

        System.out.println(alumno1.equals(alumno2)); //Da false porque discrimina mayusculas.
        System.out.println(alumno1.equalsIgnoreCase(alumno2)); //Da true porque NO discrimina mayusculas.

    }
}