public class Ejercicio2 {
    public static void main(String[] args) {

        String nombre, apellido;
        int edad;
        float estatura;

        System.out.println("Escriba su nombre");
        Scanner input = new Scanner (System.in);
        nombre=input.next();

        System.out.println("Escriba su apellido");
        apellido= input.next();

        System.out.println("Escriba su edad");
        Scanner anios = new Scanner (System.in);
        edad=anios.nextInt();

        System.out.println("Escriba su estatura");
        Scanner altura = new Scanner (System.in);
        estatura=altura.nextFloat();

        System.out.println("Su nombre es:" + nombre + "\nSu apellido es: " + apellido + "\nSu edad es:" + edad + "\nUsted mide:" + estatura);


    }

}
