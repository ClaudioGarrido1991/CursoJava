package Clase22_Arrays_II;

import javax.swing.*;

public class Clase22_UsoArray_II {

    public static void main(String[] args) {
        
        /*Declara Matriz */
        String [] paises = new String [8];

        /*Declara Paises Latam */

        paises[0] = "Chile";
        paises[1] = "Argentina";
        paises [2] = "Venezuela";
        paises [3] = "Perú";
        paises [4] = "Ecuador";
        paises [5] = "Paraguay";
        paises [6] = "Uruguay";
        paises [7] = "Brasil";

        for (int i = 0; i<paises.length; i++) {

            System.out.println("País "+(i+1)+" "+paises[i]);
        }

        System.out.println("\n");

        for (String elemento:paises) { //ciclo for mejorado.

            System.out.println(elemento);
        }

        /*Forma alternativa de declaración y metodo for mejorado */
        System.out.println("\n");

        String [] europa = {"España", "Francia", "Alemania", "Inglaterra", "Italia"};

        for (String elemento: europa) {

            System.out.println(elemento);
        }

        for (int i = 0; i<4; i++) {

            paises [i] = JOptionPane.showInputDialog("Introduce país asiatico "+(i+1)+".");
            System.out.println("País: "+paises[i]);
        }

        System.out.println("\n");

        for (String elemento: paises){
            System.out.println("país: "+elemento); //Ojo: Solo sobreescribiste los 4 primeros países como asiaticos, pero imprimira el elemento completo, de modo que los restantes serán de latam.
            
        }


    }
    
}
