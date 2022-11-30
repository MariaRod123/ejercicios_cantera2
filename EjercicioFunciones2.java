import java.util.Scanner;
public class EjercicioFunciones2 {

    //definir funcion registrar vehiculo
    public static void Registro_vehiculo(String placa,
                                         String marca,
                                         String nomb_duenio,
                                         String tel,
                                         String[] placas,
                                         String[] marcas,
                                         String[] duenios,
                                         String[] telefonos) {

        for (int i = 0; i < 5; i++) {
            if (placas[4] == null && marcas[4] == null && duenios[4] == null && telefonos[4] == null) {

                System.out.println("Ingrese placa del auto: ");
                Scanner input = new Scanner(System.in);
                placa = input.nextLine();

                System.out.println("Ingrese marca del vehiculo: ");
                marca = input.nextLine();

                System.out.println("Ingrese nombre del dueño: ");
                nomb_duenio = input.nextLine();

                System.out.println("Ingrese su teléfono : ");
                tel = input.nextLine();

                System.out.println("Datos ingresados: " + placa + " | " + marca + " | " + nomb_duenio + " | " + tel);
                placas[4] = placa;
                marcas[4] = marca;
                duenios[4] = nomb_duenio;
                telefonos[4] = tel;
            }
            System.out.println("Vehiculos registrados : " +  placas[i] + " | " + marcas[i] + " | " + duenios[i] + " | " + telefonos[i]);
        }
    }

    // Consulta sobre lugares disponibles
    public static void Buscar_disponibilidad(String[] lugares) {
        for (int i = 0; i < lugares.length; i++) {
            if (lugares[i] == null) {
                System.out.println("Ubicación: " + (i + 1) + " está disponible");
            } else if (lugares[i] != null) {
                System.out.println("Ubicación " + (i + 1) + " : está ocupado.");
            }
        }
    }

    public static void Buscar_vehiculo(String valor, String placa, String[] placas) {

        System.out.println("Escriba el número de placa de su vehiculo");
        Scanner entrada = new Scanner(System.in);
        valor = entrada.nextLine();

        for (int i = 0; i < 5; i++) {
            if (placas[i].equals(valor)) {
                System.out.println("vehiculo: " + valor + " está en el lugar " + (i + 1));
            } else {
                System.out.println("La placa ingresada " + valor + " no se encuentra en el lugar: " + (i + 1));
            }
        }
    }

    //Hacer funcion para retirar vehiculo del estacionamiento 
    static void Retirar_vehiculo(String placa, String lugares[]){
        System.out.println("Escriba la placa del vehiculo a retirar");
        Scanner enter=new Scanner(System.in);
        placa=enter.nextLine();

        for (int i = 0; i <5 ; i++) {
            if(lugares[3]!=null){
                lugares[3]=null;
                System.out.println("Actualización de lugares disponibles: " + lugares[3]);

            }


        }System.out.println("Se retirar el coche de placa : " + placa);
    }

    //funcion salir
    static void SalirProg(int opc_salir) {
        boolean salir;
        if (opc_salir == 1) {
            salir = true;
            System.out.println("Saliendo...");
        } else if (opc_salir == 2) {
            salir = false;
        }
    }

    public static void main(String[] args) {
        //variables
        String valor = " ";
        String placa = "", marca = "", nomb_duenio = "", tel = "";
        String[] placas = {"lkj231", "mbr568 ", "aax123", " plq251", null};
        String[] marcas = {"toyota", "kia", "chevrolet", "landrover ", null};
        String[] duenios = {"Graciela Perez", "Lorenzo Miranda", "Rita Lanza", "Pablo Lopez", null};
        String[] telefonos = {"401236 ", "212103", " 454502", " 951263", null};
        String[] lugares = {"aax123", null, "mbr568", null, null};
        int elegir=1;

        while (elegir != 5) {
            System.out.println("Seleccione una opción: \n1-Registrar vehículo" +
                    "\n2-Consultar disponibilidad de lugares" +
                    "\n3-Buscar vehiculo" + "\n4-Retirar vehículo " +
                    "\n5-Salir");
            Scanner enter = new Scanner(System.in);
            elegir = enter.nextInt();

            switch (elegir) {
                case 1:
                    Registro_vehiculo(placa, marca, nomb_duenio, tel, placas, marcas, duenios, telefonos);
                    break;

                case 2:
                    Buscar_disponibilidad(lugares);
                    break;

                case 3:
                    Buscar_vehiculo(valor, placa, placas);
                    break;

                case 4:
                    Retirar_vehiculo(placa, lugares);
                    break;

                case 5:
                    System.out.println("¿Desea salir?: \n1- Si \n2-No");
                    int opc_salir = enter.nextInt();
                    SalirProg(opc_salir);
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }
    }
}












