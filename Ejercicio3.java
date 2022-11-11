import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        String nombre, apellido, nombre_madre, nombre_padre;


        System.out.println("Escriba su nombre");
        Scanner input = new Scanner (System.in);
        nombre=input.next();

        System.out.println("Escriba su apellido");
        apellido= input.next();

        System.out.println("Escriba en nombre de su madre");
        nombre_madre= input.next();

        System.out.println("Escriba el nombre de su padre");
        nombre_padre= input.next();


        System.out.println("Yo " + nombre + " " + apellido + " soy hija de " + nombre_madre +  " y "  + nombre_padre);


    }
}
