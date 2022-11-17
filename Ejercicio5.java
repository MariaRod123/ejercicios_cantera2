import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        String nombre_mascota, nombre_duenio, tipo_mascota;
        int edad_mascota;

        System.out.println("Ingrese el nombre de su mascota");
        Scanner nombre = new Scanner (System.in);
        nombre_mascota = nombre.nextLine();

        System.out.println("Ingrese la edad que tiene su mascota");
        Scanner anios = new Scanner(System.in);
        edad_mascota= anios.nextInt();

        System.out.println("Ingrese el tipo de mascota");
        Scanner tipo = new Scanner (System.in);
        tipo_mascota= tipo.nextLine();

        System.out.println("Ingrese el nombre completo del dueño de la mascota");
        Scanner duenio = new Scanner (System.in);
        nombre_duenio = duenio.nextLine();

        System.out.println(nombre_mascota + " es un/a " + tipo_mascota + " el/la cual tiene " + edad_mascota + " años" + " y " + nombre_duenio + " es actualmente su dueño/a");
    }
}















