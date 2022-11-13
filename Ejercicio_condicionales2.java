import java.util.Scanner;

public class Ejercicio_condicionales2 {

    public static void main(String[] args) {

        String usuario, pelicula, anotacion;
        int opcion_anotacion;
        int opcion;

        Scanner nombre = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario");
        usuario = nombre.nextLine();

        Scanner opc = new Scanner(System.in);
        System.out.println("Elija una opción:\n 1-Alquilar película\n 2-Consultar disponibilidad de películas\n 3-Recibir en tienda");
        opcion = opc.nextInt();

        if(opcion==1){
            System.out.println("Escriba el nombre de la película que desea alquilar");
            Scanner input= new Scanner(System.in);
            pelicula=input.nextLine();

            System.out.println(usuario + " Alquila: " + pelicula);

        }
        else if(opcion==2){
            System.out.println("Escriba el nombre de la película que desea buscar");
            Scanner input= new Scanner(System.in);
            pelicula=input.nextLine();
            System.out.println(usuario + " consultó disponibilidad de: " + pelicula);

        }
        else if(opcion==3){
            System.out.println("Escriba el nombre de la película que desea recibir en tienda");
            Scanner input= new Scanner(System.in);
            pelicula=input.nextLine();
            System.out.println(usuario + " recibe en tienda: " + pelicula);

            System.out.println("¿Desea dejar alguna anotación?\n 1-Si\n 2-No");
            Scanner observ=new Scanner(System.in);
            opcion_anotacion=observ.nextInt();
            if(opcion_anotacion==1) {
                System.out.println("Escriba la anotación:");
                Scanner escribir_anotacion=new Scanner(System.in);
                anotacion=escribir_anotacion.nextLine();
                System.out.println(usuario + " deja la siguiente anotación:" + anotacion);
            }
            else if(opcion_anotacion==2){
                System.out.println(usuario + " no ha dejado anotaciones.");
            }
            else {
                System.out.println("La opción ingresada no es correcta");
            }
        }
        else{
            System.out.println("La opción ingresada no es correcta");

        }
    }
}

























