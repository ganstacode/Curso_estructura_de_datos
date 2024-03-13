import java.util.Scanner;

public class Tarea2 {

    public static void main(String[] args) {
        
         Scanner entrada = new Scanner (System.in);

         int suma = 0;

         int [] arrayNumeros = new int [10];

         for(int i = 0; i<10; i++){

            System.out.println("Ingresa un numero: ");
            arrayNumeros [i]=entrada.nextInt();

            suma+=arrayNumeros[i];
            arrayNumeros[i]++;
            System.out.println("La suma total es: "+suma);
         }





    }

}
