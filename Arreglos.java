import java.util.Scanner;
public class Arreglos {

    public static void main(String[] args) {

        int valor, valor1,valor2, valor3, valor4;
        int [] vector= new int[5];

           System.out.println("Escriba el primer número");
           Scanner input= new Scanner(System.in);
           valor=input.nextInt();
           vector[0]=valor; // dentro del vector , en la posición 0 queda guardado el valor que le ingresé
           System.out.println("Escriba el segundo número");
           valor1=input.nextInt();
           vector[1]=valor1;
           System.out.println("Escriba el tercer número");
           valor2=input.nextInt();
           vector[2]=valor2;
           System.out.println("Escriba el cuarto número");
           valor3=input.nextInt();
           vector[3]=valor3;
           System.out.println("Escriba el quinto número");
           valor4=input.nextInt();
           vector[4]=valor4;

           for(int i = 0; i < vector.length; i++){
               System.out.println("Posición:" + "[" + i +"]"+ " = " +  vector[i]); //muestra todos los números ingresados con su respectiva posición
           }
       }
    }
