
import java.util.Scanner;
public class CicloFor {
    public static void main(String[] args) {

        int numero, resultado;

        System.out.println("Ingrese un número");
        Scanner input= new Scanner(System.in);
        numero=input.nextInt();

        System.out.println("Tabla del " + numero);

        for(int i=1; i <=10; i++){
            resultado = numero * i;
            System.out.println( numero + " x "+ i + " = " + resultado );

        }
    }
