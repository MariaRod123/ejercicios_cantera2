import java.util.ArrayList;

public class EjercicioArraylist {
    public static void main(String[] args) {

        int num;
        int divisores;
        ArrayList<Integer> primos = new ArrayList<Integer>();
        System.out.println("Números primos");

        //todos los numeros del 1-1000
        for (int i = 1; i <=1000; i++) {
            divisores=0; // contador de divisores

            // como saber si cada número de la lista es primo o no
            for (num = i; num > 0; num--) {
                if (i % num == 0) {
                    divisores++; /*Cuenta cuantos divisores diferentes tiene el numero ejemplo si ingrese
                                    el 3 el i indica un numero igual q tres tal que
                                si lo divido entre 3 tiene que darme 0 el resto
                                y luego sigue con un valor menor hasta llegar al 1*/
                }
            }

        // si tiene solo 2 divisores es primo
            if (divisores == 2) {
                primos.add(i);
            }

        }System.out.println(primos);

    }

}

















