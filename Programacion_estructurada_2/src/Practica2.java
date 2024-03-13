import java.util.Arrays;
import java.util.Scanner;

public class Practica2 {

    public static void main(String[] args) {
      int op2=0, op=0;
      Scanner entrada = new Scanner (System.in);
        
        if(op2==2){
            System.out.println("Digite un valor entero: ");
            
            while(entrada.hasNext()){

                if(entrada.hasNextInt()){

                    int input = entrada.nextInt();
                    lista.Insertaralfinal(input);
                    System.out.println("Digite otro valor entero, oprima salir u oprima resultado...");

                }
                
                
                else{

                    String input = entrada.next();

                    if(input.equalsIgnoreCase("salir")){
                        break;

                    }

                    if(input.equalsIgnoreCase("resultado")){

                        System.out.println("Nodos en la lista:");
                        lista.mostrarNodos();
                        break;

                    }
                    else{
                        System.out.println("entrada no válida..."); //Si el usuario escribe algo que no sea ninguna de las anteriores opciones
                        System.out.println("Digite un valor entero, oprima salir u oprima resultado...");
                    }
                        
                }

            }

           
            System.out.println("Si desea terminar con el programa escriba terminar...");
            System.out.println("SI desea regresar al programa escriba regresar...");
            String input = entrada.next();
        
            if(input.equalsIgnoreCase("terminar")){

                System.out.println("Usted a terminado el programa...");
                return;

            }

            else if(!input.equalsIgnoreCase("regresar")){

                while (true) {

                    System.out.println("Entrada no válida. Si desea terminar con el programa escriba 'terminar'. Si desea volver al inicio presione 'regresar'");

                    input= entrada.next();

                    
                    
                    if (input.equalsIgnoreCase("regresar")) {
                        break;
                    }
                }

            }
        
        }
        
    }
}



