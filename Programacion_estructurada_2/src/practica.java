import java.security.DigestInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class practica {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);


        
        //Cantidad de numeros que el usuario va a ingresar.
        
        System.out.println("Digite la cantidad de numeros");
        int cantidad = entrada.nextInt();

        int [] numeros = new int [cantidad];

        for(int i = 0; i<cantidad; i++){

            System.out.println("Ingrese los numeros: ");
            numeros [i]= entrada.nextInt();
        }

        Arrays.sort(numeros);

        for(int i: numeros){
            System.out.println("El orden de mayor a menor es: "+i);
        }
        
        


         
    
    
    
    
    
    
    
    
    
    
    
    }



       
       }





    

