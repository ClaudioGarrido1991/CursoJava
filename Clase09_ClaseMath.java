public class Clase09_ClaseMath {

    /*Clase Math
     * 
     * Pertenece al paquete principal de java.
     *   
     * Math.sqrt(n) : Raíz Cuadrada.
     * Math.pow(base, exponente) : Potenciación
     * Math.sin(ángulo), Math.con(ángulo), Math.tan(ángulo), Math.atan (ángulo)
     * Math.round(decimal) : redondeo de un número.
     * Math.PI : Constante PI.
     */

    public static void main(String[] args) {

        double root = Math.sqrt(25);
        int raíz = (int) Math.sqrt(25); //sqrt acepta y egresa double, para sacar integer hay que castear.

        System.out.println("Raíz double "+root);
        System.out.println("Raíz casteada a Integer "+raíz);
    }

}