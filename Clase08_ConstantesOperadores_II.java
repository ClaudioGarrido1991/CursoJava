

public class Clase08_ConstantesOperadores_II {



    public static void main(String[] args) {


            int c=5; //Esta es una variable.
            System.out.println("La variable es: "+c);
            c = 7; //Como su nombre lo dice, puede variar su valor.
            final int a = 10; //Esta es una constante y se caracteriza porque no puede ser modificada.
            
            System.out.println("La constante es: "+a);
            
            final double apulgadas =2.54;

            double CM = 6;
            double resultado = CM/apulgadas;
            System.out.printf("seis cms. son %.2f pulgadas.\n", resultado); //se le ha dado formato a la salida.


            /*También se pueden declarar varias variables en la misma linea sin inicializar. */

            int var1, var2, var3; //declara tres variables integer.

            var1 = 13;
            var2 = 43;
            var3 = 90;

            resultado = (var1+var2+var3);

            System.out.println("El resultado de la suma de las 3 variables es: "+resultado );
        
        /*Una excepción
         * 
         * Errores de compilación : Mal Escrito
         * Errores de Ejecución : Errores inesperados
         */

    }
    
}
