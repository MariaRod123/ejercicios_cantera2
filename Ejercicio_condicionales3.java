import java.util.Scanner;

public class Ejercicio_condicionales3 {

    public static void main(String[] args) {

        String cliente;
        int producto, opcion_producto;
        int eleccion;
        String nombre_producto;

        System.out.println("Escriba su nombre de cliente");
        Scanner cli= new Scanner(System.in);
        cliente = cli.nextLine();

        System.out.println("Seleccione:\n 1-Comprar producto\n 2-Consultar precios\n 3-Devolver producto");
        Scanner elegir_opcion= new Scanner(System.in);
        eleccion = elegir_opcion.nextInt();

        if (eleccion ==1){
            System.out.println("Seleccione el producto a comprar:\n 1-ProductoA\n 2-ProductoB\n 3-ProductoC\n 4-ProductoD\n 5-ProductoE\n");
            Scanner prod= new Scanner (System.in);
            producto= prod.nextInt();
            if (producto==1){
                System.out.println(cliente + " ha realizado la compra del producto: " + producto);
            }
            else if (producto==2) {
                System.out.println(cliente + " ha realizado la compra del producto: " + producto);

            }
            else if (producto==3) {
                System.out.println(cliente + " ha realizado la compra del producto: " + producto);

            }
            else if (producto==4) {
                System.out.println(cliente + " ha realizado la compra del producto: " + producto);

            }
            else if (producto==5) {
                System.out.println(cliente + " ha realizado la compra del producto: " + producto);
            }
            else{
                System.out.println("No se puede realizar la compra porque el producto no existe");
            }

        }
        else if(eleccion==2){
            System.out.println("Seleccione el producto que desea consultar su precio:\n 1-ProductoA\n 2-ProductoB\n 3-ProductoC\n 4-ProductoD\n 5-ProductoE\n");
            Scanner opcion_prod= new Scanner (System.in);
            opcion_producto=opcion_prod.nextInt();
            if (opcion_producto==1){
                System.out.println(opcion_producto + " tiene un valor de: $ 100 ");
            }
            else if (opcion_producto==2) {
                System.out.println(opcion_producto + " tiene un valor de: $ 1250 ");

            }
            else if (opcion_producto==3) {
                System.out.println(opcion_producto + " tiene un valor de: $ 870 ");

            }
            else if (opcion_producto==4) {
                System.out.println(opcion_producto + " tiene un valor de: $ 285 ");

            }
            else if (opcion_producto==5) {
                System.out.println(opcion_producto + " tiene un valor de: $ 156 ");
            }
            else{
                System.out.println("No existe la opción ingresada");
            }
        }
        else if(eleccion==3){
            System.out.println("Ingrese el nombre del producto que desea devolver:");
            Scanner devolucion= new Scanner(System.in);
            nombre_producto= devolucion.nextLine();
            System.out.println(cliente + " devuelve el producto: " + nombre_producto);
        }
        else{
            System.out.println("La opción ingresada no es válida");
        }
    }
}








