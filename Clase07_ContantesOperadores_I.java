
/*OPERADORES
 * 
 * + : Suma
 * - : Resta
 * * : Multiplicación
 * / : División
 * 
 * LÓGICOS, RELACIONALES Y BOOLEANOS.
 * 
 * > : Mayor que
 * < : Menor que
 * <> : Mayor o menor que
 * != : distinto que
 * == : igual que
 * && : Y lógico
 * || : O lógico
 * 
 * INCREMENTO Y DECREMENTO
 * 
 * ++ : Incrementa en 1
 * -- : Decrementa en 1
 * +=N°: Incremento (Incrementa en X el número)
 * -=N° : Decremento (Decrementa en X el número)
 * 
 * CONCATENACIÓN
 * 
 * + : Puede confundirse con la suma al compartir símbolo
 * 
 */



public class Clase07_ContantesOperadores_I {

    final double a_pulgadas = 2.55; //esta es una CONSTANTE, esta se declara y no puede variar.

    public static void main(String[] args) {
        
        double a = 5; //declara e inicia.
        double b; //declara pero no inicia.

        b = 7; //inicia la variable.

        double c = b+a; // C vale la suma de b y A

        c++; //aumenta el valor en 1
        c+=6; //Suma 6 a la variable C ya aumentada anteriormente en 1.

        /*--------------------------------------------------------- */

        c=b/a; //trunca el valor ya que no puede dar decimales mientras las variables involucradas sean Int.

        


        System.out.println(c); //imprime el valor de "c" en consola.


    }


    
    
}
