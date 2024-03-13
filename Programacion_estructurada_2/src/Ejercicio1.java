import java.util.Scanner;

public class Ejercicio1 {

     public static void main(String[] args) {
        //hacer un programa que sume 5 numeros consecutivos

        int numero, suma=0;

    Scanner entrada = new Scanner (System.in);

    System.out.println("Digite un numero: ");
    numero = entrada.nextInt();

    for( int i=  1; i<=5; i++){

    suma+=numero;
    numero++;
    System.out.println("La suma es: "+suma);
}





    }

}
