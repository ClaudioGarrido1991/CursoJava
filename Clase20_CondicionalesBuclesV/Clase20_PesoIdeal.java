package Clase20_CondicionalesBuclesV;

import javax.swing.*;

public class Clase20_PesoIdeal {
    public static void main(String[] args) {
        
        String genero = "";

        do{
            genero = JOptionPane.showInputDialog("Introduce tu género H/M");
        
        }while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false); //mientras sea diferente a H o M, la condición para salir del bucle no se cumplirá.



        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura (cms.)")); //Guarda estatura como entero.
        int pesoIdeal = 0;
    


        if (genero.equalsIgnoreCase("H")) {

            pesoIdeal = altura - 110;

            System.out.println("Tu peso ideal (Hombre) es "+pesoIdeal+" kg.");


        }

        if (genero.equalsIgnoreCase("M")) {

            pesoIdeal = altura -120;

            System.out.println("Tu peso ideal (Mujer) es "+pesoIdeal+" kg.");
        }





    }


    
}
