import java.util.Scanner;

public class Clase1_arreglos {

     public static void main(String[] args) {
        //Los areglos almacenan un conjunto de valores del mismo tipo.
        //Estrucutura de los arreglos: tipo de dato [] nombre del arreglo = new int [];

        //Ejemplo: 
        //int [] arraynumeros = new int[10];

        Scanner entrada = new Scanner (System.in);

        int [] arrayNumeros = new int[5];

        String [] arrayNombres = new String[5];
        

for(int i = 0; i<5; i++){

    System.out.println("Ingrese el numero: "+(i+1) + ".");
    arrayNumeros[i]=entrada.nextInt();

    System.out.println("Ingresa el nombre: "+(i+1) + ".");
    arrayNombres[i]=entrada.next();


}

for(int i =0; i<5; i++){
    System.out.println("El numero "+(i+1) +" es: " + arrayNumeros[i]);
    System.out.println("El nombre "+(i+1) +" es: " + arrayNombres[i]);
 }


        }
        

}
