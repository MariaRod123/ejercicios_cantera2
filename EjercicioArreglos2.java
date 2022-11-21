import java.util.ArrayList;

public class EjercicioArreglos2 {

    public static void main(String[] args) {

        int[] vector = new int[20];
        ArrayList<Integer> pares = new ArrayList<Integer>();
        ArrayList<Integer> impares = new ArrayList<Integer>();
        int min = 1, max = 100; //maximo y minimo del rango de aleatoriedad solicitada

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) Math.floor(Math.random() * (max - min + 1) + min); //vector que guarda  números aleatorios

        }

        for (int i = 0; i < vector.length; i++) {

            if (vector[i] % 2 == 0) {
                pares.add(vector[i]); // agrega en un array todos los números pares que encontró en el conjunto
            }

        }
        System.out.println(pares); //muestra el nuevo array generado por los numeros pares encontrados 

        for (int i = 0; i < vector.length; i++) {

            if (vector[i] % 2 != 0) {
                impares.add(vector[i]); // agrega en un array todos los números impares que tiene el conjunto

            }
        }
        System.out.println(impares); //muestra el nuevo array generado por los numeros impares encontrados */
    }

}
