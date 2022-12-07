import java.util.Scanner;

public class Pares_impares {
    /* Dados 270 números introducidos por teclado obtener la suma de los números impares y el promedio de los pares*/

    public static void main(String[] args) {
        int num;
        int cont=0;
        float sumapar=0;
        float sumaimpar=0;
        float promedio;

        for (int i = 1; i <=270 ; i++) {
            System.out.println("Ingrese un valor");
            Scanner input = new Scanner(System.in);
            num = input.nextInt();

            if(num % 2 == 0){
                cont++;
                sumapar = sumapar + num;
                promedio = sumapar/cont;
                System.out.println("Promedio DE PARES: " + promedio);
            }
            else {
                sumaimpar=sumaimpar + num;
                System.out.println("Suma de IMPARES: " + sumaimpar);

            }
        }
    }
}
