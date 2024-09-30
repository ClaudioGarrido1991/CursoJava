package Clase21_Arrays_I;

public class Clase21_UsoArrays {
    public static void main(String[] args) {
        
        /*Declaración */
        int [] mi_matriz = new int [5];
        //int mi_matiz [] = new int [5]; //declaración alternativa.

        /*Inicialización. */

        mi_matriz [0]= 5;
        mi_matriz [1]= 15;
        mi_matriz [2]= 115;
        mi_matriz [3]= 1115;
        mi_matriz [4]= 11115;

        /*Imprime todas las posiciones. */
        System.out.println(mi_matriz[0]);
        System.out.println(mi_matriz[1]);
        System.out.println(mi_matriz[2]);
        System.out.println(mi_matriz[3]);
        System.out.println(mi_matriz[4]);

        /*Con Bucle For. */

        System.out.println("\nCiclo For:\n");

        for (int i=0; i<5;i++){ //i es cero; Si i es menor que 5 entonces i aumenta en 1;

            System.out.println("Valor del índice "+i+" = "+mi_matriz[i]);
        }

        /*Con Bucle For y estructura simplificada. */

        System.out.println("\nCiclo For con estructura simplificada.\n");

        int [] mi_matriz2 = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i<mi_matriz2.length; i++) { //parte de la posición cero y llega hasta el final.

            System.out.println("El valor del índice "+i+" es "+mi_matriz2[i]);

            //Al usar el método length se puede agregar variables indefinidamente.
        }
    }
}
