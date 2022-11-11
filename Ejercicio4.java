import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        String ciudad, pais;

        System.out.println("Ingresar una ciudad");
        Scanner ciud = new Scanner (System.in);
        ciudad=ciud.next();

        System.out.println("Ingresar un pais");
        Scanner paisito = new Scanner(System.in);
        pais= paisito.next();

        System.out.println("La ciudad " + ciudad + " es la capital de " + pais);
    }
}










