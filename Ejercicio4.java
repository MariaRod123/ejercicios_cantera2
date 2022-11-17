import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        String ciudad, pais;

        System.out.println("Ingresar una ciudad");
        Scanner input = new Scanner (System.in);
        ciudad=input.nextLine();

        System.out.println("Ingresar un pais");
        pais= input.nextLine();

        System.out.println("La ciudad " + ciudad + " es la capital de " + pais);
    }
}










