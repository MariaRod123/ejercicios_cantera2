import java.util.Scanner;
public class Ejercicio_condicionales2 {

    public static void main(String[] args) {

        String usuario, nombre_pelicula, anotacion;
        int opcion, pelicula, opcion_anotacion;

        Scanner nombre = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario");
        usuario = nombre.nextLine();

        Scanner opc = new Scanner(System.in);
        System.out.println("Elija una opción:\n 1-Alquilar película\n 2-Consultar disponibilidad de películas\n 3-Recibir en tienda");
        opcion = opc.nextInt();

        if(opcion==1){
            System.out.println("Elija la película que desea alquilar:\n 1-Sunshine\n 2-Granizo\n 3-Interestelar\n 4-La falla de San Andrés\n 5-El Núcleo ");
            Scanner input= new Scanner(System.in);
            pelicula=input.nextInt();
            if(pelicula==1){
                System.out.println(usuario + " desea alquilar: " + pelicula + " Sunshine ");
            }
            else if(pelicula==2){
                System.out.println(usuario + " desea alquilar: " + pelicula + " Granizo ");
            }
            else if(pelicula==3){
                System.out.println(usuario + " desea alquilar: " + pelicula + " Interestelar ");
            }
            else if(pelicula==4){
                System.out.println(usuario + " desea alquilar: " + pelicula + " La falla de San Andrés ");
            }
            else if(pelicula==5){
                System.out.println(usuario + " desea alquilar: " + pelicula + " El núcleo ");
            }
            else{
                System.out.println("No existe la opción ingresada");
            }
        }
        else if(opcion==2){
            System.out.println("Consultar peliculas disponibles:\n 1-Sunshine\n 2-Granizo\n 3-Interestelar\n 4-La falla de San Andrés\n 5-El Núcleo ");
            Scanner input= new Scanner(System.in);
            pelicula=input.nextInt();
            if(pelicula==1){
                System.out.println(pelicula + " Sunshine no se encuentra disponible ");
            }
            else if(pelicula==2){
                System.out.println(pelicula + " Granizo está disponible ");
            }
            else if(pelicula==3){
                System.out.println(pelicula + " Interestelar está disponible ");
            }
            else if(pelicula==4){
                System.out.println(pelicula + " La falla de San Andrés no se encuentra disponible ");
            }
            else if(pelicula==5){
                System.out.println(pelicula + " El Núcleo está disponible ");
            }
            else{
                System.out.println("No existe la opción ingresada");
            }
        }
        else if(opcion==3){
            System.out.println("Escriba el nombre de la película que desea recibir en tienda");
            Scanner input= new Scanner(System.in);
            nombre_pelicula=input.nextLine();
            System.out.println(usuario + " recibe en tienda: " + nombre_pelicula);

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















































