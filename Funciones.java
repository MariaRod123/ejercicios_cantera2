import java.util.Scanner;
public class Funciones {
    // ingresar_usuario
    public static void IngresoUsuario(String usuario_nuevo,
                                      String cedula_nueva,
                                      String[] registro_nombres,
                                      String[] registro_cedulas) {
        System.out.println("Ingrese nombre: ");
        Scanner input = new Scanner(System.in);
        usuario_nuevo = input.nextLine();

        System.out.println("Ingrese cedula: ");
        cedula_nueva = input.nextLine();

        System.out.println("Datos ingresados: " + usuario_nuevo + "  " + cedula_nueva);
        registro_nombres[0]=usuario_nuevo;
        registro_cedulas[0]=cedula_nueva;

    }

    //mostrar los datos de usuarios y las notas
    public static void Estado(String usuario_nuevo,
                              String cedula_nueva,
                              String usuario2,
                              String cedula2,
                              String usuario3,
                              String cedula3,
                              String usuario4,
                              String cedula4,
                              String usuario5,
                              String cedula5,
                              String usuario6,
                              String cedula6,
                              String usuario7,
                              String cedula7,
                              String usuario8,
                              String cedula8,
                              String registro_nombres[],
                              String registro_cedulas[],
                              String estado[],
                              String resultados_prueba[]) {

        /* el valor que está en registo_nombres[0] y registro_cedulas[0] esta dado por lo que se define en el método IngresoUsuario() */
        estado[0] = "en curso";
        resultados_prueba[0] = "pendiente";

        registro_nombres[1] = "Pablo";
        registro_cedulas[1] = "141-2";
        estado[1] = "en curso";
        resultados_prueba[1] = "pendiente";

        registro_nombres[2] = "Marta";
        registro_cedulas[2] = "989-6";
        estado[2] = "finalizado";
        resultados_prueba[2] = "aprobado";

        registro_nombres[3] = "Alicia";
        registro_cedulas[3] = "623-7";
        estado[3] = "finalizado";
        resultados_prueba[3] = " No aprobado";

        registro_nombres[4] = "Charly";
        registro_cedulas[4] = "741-2";
        estado[4] = "finalizado";
        resultados_prueba[4] = "aprobado";

        registro_nombres[5] = "Toby";
        registro_cedulas[5] = "112-1";
        estado[5] = "en curso";
        resultados_prueba[5] = "pendiente";

        registro_nombres[6] = "Celia";
        registro_cedulas[6] = "026-3";
        estado[6] = "en curso";
        resultados_prueba[6] = "pendiente";

        registro_nombres[7] = "Rodrigo";
        registro_cedulas[7] = "921-5";
        estado[7] = "finalizado";
        resultados_prueba[7] = "aprobado";

        System.out.println("Mostrando todos los resultados:");

        System.out.println("Alumno 1: " + registro_nombres[0] + " | " + registro_cedulas[0] + " | " + estado[0] + " | " + resultados_prueba[0]);
        System.out.println("Alumno 2: " + registro_nombres[1] + " | " + registro_cedulas[1] + " | " + estado[1] + " | " + resultados_prueba[1]);
        System.out.println("Alumno 3: " + registro_nombres[2] + " | " + registro_cedulas[2] + " | " + estado[2] + " | " + resultados_prueba[2]);
        System.out.println("Alumno 4: " + registro_nombres[3] + " | " + registro_cedulas[3] + " | " + estado[3] + " | " + resultados_prueba[3]);
        System.out.println("Alumno 5: " + registro_nombres[4] + " | " + registro_cedulas[4] + " | " + estado[4] + " | " + resultados_prueba[4]);
        System.out.println("Alumno 6: " + registro_nombres[5] + " | " + registro_cedulas[5] + " | " + estado[5] + " | " + resultados_prueba[5]);
        System.out.println("Alumno 7: " + registro_nombres[6] + " | " + registro_cedulas[6] + " | " + estado[6] + " | " + resultados_prueba[6]);
        System.out.println("Alumno 8: " + registro_nombres[7] + " | " + registro_cedulas[7] + " | " + estado[7] + " | " + resultados_prueba[7]);
    }

    //salir
    static void Salir(int opcion_salir) {
        boolean salir;
        if (opcion_salir == 1) {
            salir = true;
            System.out.println("Saliendo...");
        } else if(opcion_salir==2) {
            salir = false;
        }
    }
    public static void main(String[] args) {
        //variables
        int opcion = 1;
        String  usuario2 = "", usuario3 = "", usuario4 = "", usuario5 = "", usuario6 = "", usuario7 = "", usuario8 = " ";
        String  cedula2 = "", cedula3 = "", cedula4 = "", cedula5 = "", cedula6 = "", cedula7 = "", cedula8 = "";
        String usuario_nuevo="maria";
        String cedula_nueva="290-8";
        String[] registro_nombres = new String[8];
        String[] registro_cedulas = new String[8];
        String[] estado = new String[8];
        String[] resultados_prueba = new String[8];

        while (opcion!=3) {
            System.out.println("Elija la opción : \n1-Registrar usuario " +
                    "\n2-Ver usuarios del curso y resultados" + "\n3-Salir");
            Scanner entrada = new Scanner(System.in);
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1: //llama a la función que registra usuario en el curso
                    IngresoUsuario(usuario_nuevo, cedula_nueva, registro_nombres, registro_cedulas);
                    break;

                case 2://llama función que muestra los datos de cada alumno junto con resultados de las pruebas y estado del curso
                    Estado(usuario_nuevo, usuario2, usuario3, usuario4, usuario5, usuario6, usuario7, usuario8,
                            cedula_nueva, cedula2, cedula3, cedula4, cedula5, cedula6, cedula7, cedula8, registro_nombres,
                            registro_cedulas, estado, resultados_prueba);
                    break;

                case 3: //llama la función salir
                    System.out.println("¿Desea salir?: \n1- Si \n2-No");
                    int opcion_salir = entrada.nextInt();
                    Salir(opcion_salir);
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }
    }
}







