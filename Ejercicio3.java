import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        String nombre, apellido, nombre_madre, nombre_padre;


        System.out.println("Escriba su nombre");
        Scanner input = new Scanner (System.in);
        nombre=input.nextLine();

        System.out.println("Escriba su apellido");
        apellido= input.nextLine();

        System.out.println("Escriba en nombre de su madre");
        nombre_madre= input.nextLine();

        System.out.println("Escriba el nombre de su padre");
        nombre_padre= input.nextLine();


        System.out.println("Yo " + nombre + " " + apellido + " soy hija de " + nombre_madre +  " y "  + nombre_padre);


    }
}
