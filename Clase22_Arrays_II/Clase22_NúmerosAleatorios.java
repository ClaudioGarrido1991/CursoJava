package Clase22_Arrays_II;

public class Clase22_NúmerosAleatorios {
    public static void main(String[] args) {
        
        int matriz_random [] = new int [150];

        for (int  i = 0; i<matriz_random.length; i++) {
            matriz_random [i] = (int) (Math.random()*100);
            System.out.println("El espacio "+i+" lo ocupa el número "+matriz_random [i]);
        } 
    }
    
}
