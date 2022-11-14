import java.util.Scanner;
public class CicloWhile {
    public static void main(String[] args) {
        
        int seleccion;

        // Bucle infinito
        while (1==1)        // condicion siempre verdadera
        {
            System.out.println("Seleccione una de las opciones:\n 1-Primera opción\n 2-Segunda opción\n 3-Tercera opción");
            Scanner selec = new Scanner(System.in);
            seleccion = selec.nextInt();

            switch (seleccion) {
                case 1:
                    System.out.println("Primera opción");
                    break;
                case 2:
                    System.out.println("Segunda opción ");
                    break;
                case 3:
                    System.out.println("Tercera opción ");
                    break;
                default:
                    System.out.println("Opción incorrecta ");
                    break;
            }
        }
    }
}
