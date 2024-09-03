package Clase15_FormatoResultados;

/*Formatear números. */

public class Clase15_EntradaNumeros {

    public static void main(String[] args) {
        
        double num1 = 10_000_000;

        System.out.println(num1/3); //da muchos decimales.
        System.out.printf("%1.2f",(num1/3)); //PRINTF recibe 2 entradas, uno formato y dos el objetivo.
        //En este caso se trata de un número entero acompañado de dos decimales.
    }
    
}
