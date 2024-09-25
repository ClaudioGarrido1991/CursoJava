package clase18_condicionalesuclesiii;

import javax.swing.*;


/*Bucles.

Determinados: While, Do-While.


Indeterminados:

For, For-Each.


While(Condición){ ***While puede ser traducido asi como "mientras"***

linea1
linea2
linea3
linea4

}

Si la condición es cierta, pero nunca deja de ser cierta el bucle será infinito.
Si la condición nunca es cierta, el código nunca se ejecutará.

*/

public class Clase18_while {

    public static void main(String[] args) {

    String clave = "Claudio";

    String pass = "";

    while (clave.equals(pass) == false){ //Si "clave" no es igual a "pass".

        pass = JOptionPane.showInputDialog("Introduce la contraseña por favor.");

        if (clave.equals(pass)==false){ 

            System.out.println("Contraseña Incorrecta, vuelva a intentarlo");

            
        }


    }

    System.out.println("Contraseña correcta, acceso permitido");


        
    }

}
