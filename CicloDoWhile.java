import java.util.Scanner;
public class CicloDoWhile {

    public static void main(String[] args) {

        int numero;

        do {
            System.out.println("Escriba un número");
            Scanner num = new Scanner(System.in);
            numero = num.nextInt();
            System.out.println(numero);

            }
        while (numero <= 500);
        }
    }
