public class Clase10_ClaseMath_II {

    public static void main(String[] args) {
        
        double var1;
        var1 = 5.85;
        
        /*Método Round. */

        int resultadoRound = (int) Math.round(var1); //Realiza refundición porque acepta valores double (o float).
        
        Long resultadoRound2 = Math.round(var1); //Realiza la misma operación sin refundición y usando el metodo para Long.
        //no se recomienda refundir un Long pues si se usa un numero largo, se perdera información.
        
        System.out.println(resultadoRound);
        System.out.println(resultadoRound2);

        /*Método Pow */

        double base = 10;
        double exponente = 2;

        int resultadoPow = (int) Math.pow(base,exponente);
        System.out.println("El resultado de "+(int)base+" elevado a "+(int)exponente+" es "+resultadoPow);




    }
    
}
