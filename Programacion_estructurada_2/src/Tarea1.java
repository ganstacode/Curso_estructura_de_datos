import java.util.Scanner;

public class Tarea1 {

    public static void main(String[] args) {

        //Hacer un programa donde suma 10 numeros consecutivos con el ciclo while

        Scanner entrada =new Scanner (System.in);

        int numero, suma = 0, i=1;


        System.out.println("Digite un numero: ");
            numero=entrada.nextInt();
        
            while(i<=10) {
            i++;

    

            suma+=numero;
            numero++;
            }       

            System.out.println("La suma es: "+suma);

    }

}
