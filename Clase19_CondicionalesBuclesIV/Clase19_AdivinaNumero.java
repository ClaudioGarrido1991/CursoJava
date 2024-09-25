package Clase19_CondicionalesBuclesIV;

//import javax.lang.*;
import javax.swing.JOptionPane;

public class Clase19_AdivinaNumero {

    public static void main(String[] args) {
        
        // System.out.println(Math.random()); Este metodo da un numero entre 0 y 1 con decimales (double)

        //System.out.println((int) (Math.random()*100)); //Al multiplicar *100 este método logras que el número este entre 0 y 100, la refundición debe ser al método Math.random entre parentesis para que no refunda el 0 truncandolo;

        int aleatorio = (int)(Math.random()*100); //Almacena número aleatorio del 0 al 100 en una variable;
        int número = 0;
        
        int intentos = 0;
        

        while (número != aleatorio){ //mientras el "número" sea diferente del número aleatorio.

        intentos++; //Aumenta el contador de intentos.

        número = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un Número: "));

        if (aleatorio<número) { //Si ALEATORIO ES MENOR.

            System.out.println("Es menor.");

        }

        if (aleatorio>número) { //Si ALEATORIO ES MAYOR.

            System.out.println("Es mayor.");
        }

        if (aleatorio==número){

            System.out.println("Ha encontrado el número, era el "+aleatorio);
            System.out.println("Ha realizado "+(intentos-1)+" intentos fallidos.");
        
        }

        }

/*NOTA: Existe la posibilidad remota que el número que se genere aleatoriamente sera CERO
 * si es asi entonces la condicion para ejecutar el ciclo no se cumplirá.
 */



    }
    
}
