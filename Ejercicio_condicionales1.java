import java.util.Scanner;
public class Ejercicio_condicionales1 {
    public static void main(String[] args) {

        String nombre, apellido;
        int edad;

        Scanner nomb= new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre=nomb.next();

        Scanner ape= new Scanner(System.in);
        System.out.println("Ingrese su apellido");
        apellido=ape.next();

        Scanner anios= new Scanner(System.in);
        System.out.println("Ingrese su edad");
        edad=anios.nextInt();

        if (edad >= 18) {
            System.out.println(nombre + " " + apellido + ": Usted es mayor de edad por tanto puede ingresar a la fiesta. ");
        }
        else {
            System.out.println(nombre + " " + apellido + ": Usted es menor de edad por tanto no puede entrar a la fiesta, por favor devuélvase a su casa.");
        }

    }
}





