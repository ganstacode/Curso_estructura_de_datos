import java.util.Scanner;

public class Main {

public static void main (String []args){
    Scanner entrada = new Scanner(System.in);
    int op=0,op2=0;
    
    while (true){
        System.out.println("Bienvenido al menú principal");
        System.out.println("Digite 1 si desea ir al menú de listas");
        System.out.println("Digite 2 si desea ir al menú de colas.");
        System.out.println("Digite 3 si desea ir al menú pilas");
        System.out.println("Digite 4 si desea ir al menú de árboles.");
        System.out.println("Digite 5 para salir del programa.");
        int opm=entrada.nextInt();

        menup:
        switch (opm){
                                               //Listas
            case 1: System.out.println("Usted está en el menú de listas");
            while (true){
                
                System.out.println("Digite 1 para insertar");
                System.out.println("Digite 2 para eliminar ");
                System.out.println("Digite 3 para obtener nodo ");
                System.out.println("Digite 4 para eliminar nodo");
                System.out.println("Digite 5 para regresar al menu");
                op = entrada.nextInt();
                while(op>5){
                System.out.println("Error, opción no valida.");
                System.out.println("Digite 1 para insertar");
                System.out.println("Digite 2 para eliminar ");
                System.out.println("Digite 3 para obtener nodo ");
                System.out.println("Digite 4 para eliminar nodo");
                System.out.println("Digite 5 para regresa al menu");
                op = entrada.nextInt();
                }
                menupp:
                switch (op){
                    //menu insertar
                    case 1:
                    System.out.println("Usted esta en el emnú de listas.");
                    System.out.println("Digite una opción:");
                    System.out.println("1. Insertar al inicio.");
                    System.out.println("2. Insertar al final.");
                    System.out.println("3. Insertar en una posición.");
                    System.out.println("4. Regresar al menu de listas.");
                    System.out.println("5. Regresar al menu principal.");
                    Listas lista = new Listas ();
                    op2 = entrada.nextInt();

                    while(op2>5 && op2<1){
                    System.out.println("Error, opción no válida.");
                    System.out.println("Digite una opción:");
                    System.out.println("1. Insertar al inicio.");
                    System.out.println("2. Insertar al final.");
                    System.out.println("3. Insertar en una posición.");
                    System.out.println("4. Regresar al menu de listas.");
                    System.out.println("5. Regresar al menu principal.");
                    op2=entrada.nextInt();
                    }
                    
                    switch(op2){
                        //insertar al inicio.
                        case 1:  System.out.println("Digite un valor entero, digite 'regresar' para volver al menú principal, digite 'listas' para regresar la menú de listas, o digite mostrar para ver la lista...");
                        while (entrada.hasNext()){
                            regresarListaVacia:
                        if(entrada.hasNextInt()){
                            int input = entrada.nextInt();
                            lista.Insertaralinicio(input);
                            System.out.println("Digite un valor entero, digite 'regresar' para volver al menú principal, digite 'listas' para regresar la menú de listas, o digite mostrar para ver la lista...");
                        } else{
                            String input = entrada.next();

                            if(input.equalsIgnoreCase("regresar")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menú principal");
                                break menup;
                            }
                            
                            if(input.equalsIgnoreCase("mostrar")){
                                if(lista.isEmptyList()){
                                  System.out.println("ADVERTENCIA!!. No se ingresó ningún valor a la lista. ");
                                  System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                                  String respuesta = entrada.next();
                                  while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                    System.out.println("Error, opcion no valida.");
                                    System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                                    respuesta=entrada.next();
                                }
                                  if(respuesta.equalsIgnoreCase("si")){
                                    System.out.println("La lista es: ");
                                    lista.mostrarNodos();
                                    break;
                                  }
                                  else if(respuesta.equalsIgnoreCase("no")){
                                    System.out.println();
                                    System.out.println("Digite un valor entero, digite 'regresar' para volver al menú principal, digite 'listas' para regresar la menú de listas, o digite mostrar para ver la lista...");
                                    break regresarListaVacia;
                                  }
                                  
                                }
                                System.out.println("La lista es: ");
                                lista.mostrarNodos();
                                break;
                            }
                            else if(input.equalsIgnoreCase("listas")){
                                System.out.println();
                                System.out.println("Usted ha regresado la menú de listas.");
                                break menupp;
                            }
                            
                           else{
                           System.out.println("Error, opción inválida."); 
                            System.out.println("Digite un valor entero, digite 'regresar' para volver al menú principal, digite 'listas' para regresar la menú de listas, o digite mostrar para ver la lista...");
                           }
                            
                        }
                        }

                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menú principal digite regresar.");
                        System.out.println("Si desea regresar al menú de listas digite listas.");
                       
                        
                        while(true){
                            String input = entrada.next();
                            if(input.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input.equalsIgnoreCase("regresar")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menú principal.");
                                break menup;
                            }
                            if(input.equalsIgnoreCase("listas")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menú de listas");
                                break menupp;
                            }
                            else{
                                System.out.println("Error, opción inválida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menú principal digite regresar.");
                                System.out.println("Si desea regresar al menú de listas digite listas.");
                        
                            }
                            
                        }
                        
                        //insertar al final.
                        case 2: System.out.println("Digite un valor entero, digite 'regresar' para volver al menú principal, digite 'listas' para regresar la menú de listas, o digite mostrar para ver la lista...");
                        while(entrada.hasNext()){
                            regresarListaVacia2:
                            if(entrada.hasNextInt()){
                                int input2 = entrada.nextInt();
                                lista.Insertaralfinal(input2);
                                System.out.println("Digite un valor entero, digite 'regresar' para volver al menú principal, digite 'listas' para regresar la menú de listas, o digite mostrar para ver la lista...");
                            }else{
                                String input2 = entrada.next();

                                if(input2.equalsIgnoreCase("regresar")){
                                    System.out.println();
                                    System.out.println("Usted ha regresado al menu principal");
                                    break menup;
                                }

                                if(input2.equalsIgnoreCase("mostrar")){
                                    if(lista.isEmptyList()){
                                        System.out.println("ADVERTENCIA!!. No se ingresó ningún valor a la lista. ");
                                  System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                                        String respuesta = entrada.next();
                                        while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                            System.out.println("Error, opcion no valida.");
                                            System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                                            respuesta=entrada.next();
                                        }
                                        if(respuesta.equalsIgnoreCase("si")){
                                            System.out.println("La lista es: ");
                                            lista.mostrarNodos();
                                            break;
                                        }
                                        else if(respuesta.equalsIgnoreCase("no")){
                                          System.out.println();
                                          System.out.println("Digite un valor entero, digite 'regresar' para volver al menú principal, digite 'listas' para regresar la menú de listas, o digite mostrar para ver la lista...");
                                          break regresarListaVacia2;
                                          
                                          
                                        }
                                        
                                      }
                                    System.out.println("La lista es: ");
                                    lista.mostrarNodos();
                                    break;
                                }
                                if(input2.equalsIgnoreCase("listas")){
                                    System.out.println();
                                    System.out.println("Usted ha regresado al menú de listas");
                                    break menupp;
                                }
                                else{
                                     System.out.println("Error, opción no válida.");
                                     System.out.println("Digite un valor entero, digite 'salir' para volver al menú principal, digite 'listas' para regresar la menú de listas, o digite mostrar para ver la lista...");
                                }
                            }
                        }
                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menú principal digite regresar.");
                        System.out.println("Si desea regresar al menú de listas digite listas.");
                        
                        
                        while(true){
                            String input2 = entrada.next();
                            if(input2.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input2.equalsIgnoreCase("regresar")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menú principal.");
                                break menup;
                            }
                            if(input2.equalsIgnoreCase("listas")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menú de listas");
                                break menupp;
                            } else {
                                System.out.println("Error, opción inválida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menú principal digite regresar.");
                                System.out.println("Si desea regresar al menú de listas digite listas.");
                        
                            }

                        }
                         
                         //insertar en posicion.
                        case 3:System.out.println("Digite un valor entero, digite regresar para regresar al menú principal, digite listas para regresar al menú de listas, o digite posicion para digitar la posicion");

                         while (entrada.hasNext()){
                            regresarListaVacia3:
                            if(entrada.hasNextInt()){
                                int input3=entrada.nextInt();
                                lista.Insertaralfinal(input3);
                                System.out.println("Digite un valor entero, digite regresar para regresar al menú principal, digite listas para regresar al menú de listas, o digite posicion para digitar la posicion");
                            }else{
                                String input3=entrada.next();
                                if(input3.equalsIgnoreCase("salir")){
                                    System.out.println();
                                 System.out.println("usted ha regresado al menú principal'");
                                 break menup;
                                }
                                if(input3.equalsIgnoreCase("posicion")){
                                    if(lista.isEmptyList()){
                                        System.out.println("ADVERTENCIA!!. No se ingresó ningún valor a la lista. ");
                                        System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                                        String respuesta = entrada.next();
                                        while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                            System.out.println("Error, opcion no valida.");
                                            System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                                            respuesta=entrada.next();
                                        }
                                        if(respuesta.equalsIgnoreCase("si")){
                                          System.out.println("La lista es: ");
                                          lista.mostrarNodos();
                                          break;
                                        }
                                        else if(respuesta.equalsIgnoreCase("no")){
                                          System.out.println();
                                          System.out.println("Digite un valor entero, digite 'regresar' para volver al menú principal, digite 'listas' para regresar la menú de listas, o digite posicion para digitar la posicion");
                                          break regresarListaVacia3;
                                          
                                          
                                        }
                                        
                                      }
                                    System.out.println("Digite la posición: ");
                                    while (!entrada.hasNextInt()) {
                                        System.out.println("Error: La posición debe ser un número entero.");
                                        System.out.println("Digite la posición: ");
                                        entrada.next(); 
                                    }
                                    int posicion=entrada.nextInt();
                                    System.out.println("Digite el nuevo valor: ");
                                    while (!entrada.hasNextInt()) {
                                        System.out.println("Error: El valor debe ser un número entero.");
                                        System.out.println("Digite el nuevo valor: ");
                                        entrada.next(); 
                                    }
                                    int valor = entrada.nextInt();
                                    lista.Insertarenposicion(posicion, valor);
                                    lista.mostrarNodos();
                                    break;
                                    
                                }
                                if(input3.equalsIgnoreCase("listas")){
                                    System.out.println();
                                    System.out.println("Usted ha regresado al menú de listas");
                                    break menupp;
                                }
                                else{
                                    System.out.println("Error, opción no válida.");
                                    System.out.println("Digite un valor entero, digite salir para regresar al menú principal, digite listas para regresar al menú de listas, o digite posicion para digitar la posicion");
                                }

                            }
                         }

                         System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menú principal digite regresar.");
                        System.out.println("Si desea regresar al menú de listas digite listas.");
                        
                        while(true){
                            String input3 = entrada.next();
                            if(input3.equalsIgnoreCase("terminar")){
                           System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input3.equalsIgnoreCase("regresar")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menú principal.");
                                break menup;
                            }
                            if(input3.equalsIgnoreCase("listas")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menú de listas");
                                break menupp;
                            }  
                            else{
                                System.out.println("Error, opción no válida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menú principal digite regresar.");
                                System.out.println("Si desea regresar al menú de listas digite listas.");

                            }

                        }

                        case 4: System.out.println("Usted ha regresado al menú de listas");
                        break;
                        case 5: System.out.println("Usted ha regresado al menú principal.");
                        break menup;
                    }

                    break;
                    //menu eliminar
                    case 2: System.out.println("Digite 1 para eliminar al inicio.");
                    System.out.println("Digite 2 para eliminar al final.");
                    System.out.println("Digite 3 para eliminar en posición."); 
                    System.out.println("Digite 4 para salir al menú de listas");
                    System.out.println("Digite 5 para salir al menú de principal");
                     Listas lista2 = new Listas ();
                     op2=entrada.nextInt();
                     while(op2>5){

                        System.out.println("Error, opción no válida.");
                        System.out.println("Digite 1 para eliminar al inicio.");
                        System.out.println("Digite 2 para eliminar al final.");
                        System.out.println("Digite 3 para eliminar en posición."); 
                        System.out.println("Digite 4 para salir al menu de listas");
                        System.out.println("Digite 5 para salir al menu de principal");
                        op2=entrada.nextInt();
                    }
                    
                     switch (op2){//switch para eliminar listas.
                        //eliminar al inicio.
                        case 1: System.out.println("Digite un valor entero, digite 'regresar' para volver al menú principal, digite 'listas' para regresar la menú de listas, o digite mostrar para ver la lista...");
                        while(entrada.hasNext()){
                            regresarListaVacia4:
                            if(entrada.hasNextInt()){
                                int input =entrada.nextInt();
                                lista2.Insertaralinicio(input);
                                System.out.println("Digite un valor entero, digite 'regresar' para volver al menú principal, digite 'listas' para regresar la menú de listas, o digite mostrar para ver la lista...");
                            } else{
                                String input = entrada.next();
                                if(input.equalsIgnoreCase("regresar")){
                                    System.out.println();
                                    System.out.println("Usted ha regresado al menu principal.");
                                    break menup;
                                }
                                if(input.equalsIgnoreCase("mostrar")){
                                    if(lista2.isEmptyList()){
                                        System.out.println("ADVERTENCIA!!. No se ingresó ningún valor a la lista. ");
                                        System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                                        String respuesta = entrada.next();
                                        while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                            System.out.println("Error, opcion no valida.");
                                            System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                                            respuesta=entrada.next();
                                        }
                                        if(respuesta.equalsIgnoreCase("si")){
                                          
                                        }
                                        else if(respuesta.equalsIgnoreCase("no")){
                                          System.out.println();
                                          System.out.println("Digite un valor entero, digite 'regresar' para volver al menú principal, digite 'listas' para regresar la menú de listas, o digite mostrar para ver la lista...");
                                          break regresarListaVacia4;
                                          
                                          
                                        }
                                        
                                      }
                                    System.out.println("La lista es: \n");
                                    lista2.Eliminaralinicio();
                                    System.out.println("Los nodos restantes son: " +lista2.contarNodos());
                                    lista2.mostrarNodos();
                                    break;
                                }
                                if(input.equalsIgnoreCase("listas")){
                                    System.out.println();
                                    System.out.println("Usted ha regresado al menú de listas");
                                    break menupp;
                                }
                                else{
                                    System.out.println("Error, opción no válida.");
                                    System.out.println("Digite un valor entero, digite 'salir' para volver al menú principal, digite listas para regresar la menú de listas, o digite mostrar para ver la lista...");
                                }
                            }
                        }
                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menú principal digite regresar.");
                        System.out.println("Si desea regresar al menú de listas digite listas.");
                        
                       
                        while(true){
                            String input3 = entrada.next();
                            if(input3.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input3.equalsIgnoreCase("regresar")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menu principal.");
                                break menup;
                            }
                            if(input3.equalsIgnoreCase("listas")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menu de listas");
                                break menupp;
                            }  else{
                                System.out.println("Error, opcion no valida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menu principal digite regresar.");
                                System.out.println("Si desea regresar al menu de listas digite listas.");
                            }

                        }
                        
                        //eliminar al final.
                        case 2: System.out.println("Digite un valor entero, digite 'salir' para volver al menú principal, digite 'listas' para regresar la menú de listas, o digite mostrar para ver la lista...");
                        while(entrada.hasNext()){
                            regresarListaVacia5:
                            if(entrada.hasNextInt()){
                                int input =entrada.nextInt();
                                lista2.Insertaralfinal(input);
                                System.out.println("Digite un valor entero, digite 'salir' para volver al menú principal, digite 'listas' para regresar la menú de listas, o digite mostrar para ver la lista...");
                            }else{
                                String input =entrada.next();
                                if(input.equalsIgnoreCase("regresar")){
                                    System.out.println();
                                    System.out.println("Usted ha regresado al menu principal.");
                                    break menup;
                                }
                                if(input.equalsIgnoreCase("mostrar")){
                                    if(lista2.isEmptyList()){
                                        System.out.println("ADVERTENCIA!!. No se ingresó ningún valor a la lista. ");
                                        System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                                        String respuesta = entrada.next();
                                        while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                            System.out.println("Error, opcion no valida.");
                                            System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                                            respuesta=entrada.next();
                                        }
                                        if(respuesta.equalsIgnoreCase("si")){
                                            System.out.println("La lista es: ");
                                            lista2.Eliminaralfinal();
                                            System.out.println("Los nodos restantes son: "+lista2.contarNodos());
                                            lista2.mostrarNodos();
                                            break;
                                        }
                                        else if(respuesta.equalsIgnoreCase("no")){
                                          System.out.println();
                                          System.out.println("Digite un valor entero, digite 'regresar' para volver al menú principal, digite 'listas' para regresar la menú de listas, o digite mostrar para ver la lista...");
                                          break regresarListaVacia5;
                                        }
                                        
                                      }
                                    System.out.println("La lista es: ");
                                    lista2.Eliminaralfinal();
                                    System.out.println("Los nodos restantes son: "+lista2.contarNodos());
                                    lista2.mostrarNodos();
                                    break;

                                }
                                if(input.equalsIgnoreCase("listas")){
                                    System.out.println();
                                    System.out.println("Usted ha regresado al menú de listas");
                                    break menupp;
                                }
                                else{
                                    System.out.println("Error, opcion no valida.");
                                    System.out.println("Digite un valor entero, digite 'salir' para volver al menú principal, digite listas para regresar la menú de listas, o digite mostrar para ver la lista...");
                                }
                            }
                        }
                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menu principal digite regresar.");
                        System.out.println("Si desea regresar al menu de listas digite listas.");
                        
                        
                        while(true){
                            String input4 = entrada.next();
                            if(input4.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salirdo del programa...");
                                return;
                            }
                            if(input4.equalsIgnoreCase("regresar")){
                                System.out.println();
                                System.out.println("Usted ha regrresado al menu principal.");
                                break menup;
                            }
                            if(input4.equalsIgnoreCase("listas")){
                                System.out.println();
                                System.out.println("Usted ha regrsado al menu de listas");
                                break menupp;
                            }  
                            else{
                                System.out.println("Error, opcion no valida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menu principal digite regresar.");
                                System.out.println("Si desea regresar al menu de listas digite listas.");
                            }

                        }
                        
                        //Eliminar en posicion
                        case 3: System.out.println("Digite un valor entero, digite salir para regresar al menú principal, digite listas para regresar al menú de listas, o digite posicion para digitar la posicion");
                        while (entrada.hasNext()){
                           regresarListaVacia6:
                            if (entrada.hasNextInt()){
                                int input = entrada.nextInt();
                                lista2.Insertaralfinal(input);
                                System.out.println("Digite un valor entero, digite salir para regresar al menú principal, digite 'listas' para regresar al menú de listas, o digite posicion para digitar la posicion");
                            }
                            else{
                                String input = entrada.next();
                                if(input.equalsIgnoreCase("regresar")){
                                    System.out.println();
                                    System.out.println("Usted regresado al menu principal.");
                                    break menup;
                                }
                                if(input.equalsIgnoreCase("posicion")){
                                    if(lista2.isEmptyList()){
                                        System.out.println("ADVERTENCIA!!. No se ingresó ningún valor a la lista. ");
                                        System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                                        String respuesta = entrada.next();
                                        while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                            System.out.println("Error, opcion no valida.");
                                            System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                                            respuesta=entrada.next();
                                        }
                                        if(respuesta.equalsIgnoreCase("si")){
                                          System.out.println("La lista es: ");
                                          lista2.mostrarNodos();
                                          break;
                                        }
                                        else if(respuesta.equalsIgnoreCase("no")){
                                          System.out.println();
                                          System.out.println("Digite un valor entero, digite 'regresar' para volver al menú principal, digite 'listas' para regresar la menú de listas, o digite posicion para digitar la posicion");
                                          break regresarListaVacia6;
                                          
                                          
                                        }
                                        
                                      }
                                    System.out.println("Digite la posicion que desea eliminar: ");
                                    while (!entrada.hasNextInt()) {
                                        System.out.println("Error: La posicion debe ser un número entero.");
                                        System.out.println("Digite la posicion que desea eliminar: ");
                                        entrada.next(); 
                                    }
                                    int posicion=entrada.nextInt();
                                    System.out.println("Digite el nuevo valor: ");
                                    while (!entrada.hasNextInt()) {
                                        System.out.println("Error: El valor debe ser un número entero.");
                                        System.out.println("Digite el nuevo valor: ");
                                        entrada.next(); 
                                    }
                                    int valor = entrada.nextInt();
                                    System.out.println("La lista es:" );
                                    lista2.Eliminarenposicion(posicion, valor);
                                    lista2.mostrarNodos();
                                    break;
                                }
                                if(input.equalsIgnoreCase("listas")){
                                    System.out.println();
                                    System.out.println("Usted ha regresado al menú de listas");
                                    break menupp;
                                }
                                else{
                                    System.out.println("Error, opcion no valida.");
                                    System.out.println("Digite un valor entero, digite salir para regresar al menú principal, digite listas para regresar al menú de listas, o digite posicion para digitar la posicion");
                                }
                            }
                        }

                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menu principal digite regresar.");
                        System.out.println("Si desea regresar al menu de listas digite listas.");
                        
                        while(true){
                            String input5 = entrada.next();
                            if(input5.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input5.equalsIgnoreCase("regresar")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menu principal.");
                                break menup;
                            }
                            if(input5.equalsIgnoreCase("listas")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menu de listas");
                                break menupp;
                            }  
                            else{
                                System.out.println("Error, opcion no valida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menu principal digite regresar.");
                                System.out.println("Si desea regresar al menu de listas digite listas.");
                            }

                        }

                        case 4: System.out.println("Usted ha salido al menu de listas");
                        break menupp;
                        case 5: System.out.println("Usted ha regresado al menu principal.");
                        break menup;

                     }
                     break;
                     //obtener nodo
                     case 3: System.out.println("Digite un valor entero, digite regresar para regresar al menu principal, digite listas para regresar al menú de listas, o digite nodo para pasar a mostrar un nodo especifico: ");
                     Listas lista3 = new Listas ();
                     while(entrada.hasNext()){
                        regresarListaVacia7:
                        if(entrada.hasNextInt()){
                            int input = entrada.nextInt();
                            lista3.Insertaralfinal(input);
                            System.out.println("Digite un valor entero, digite regresar para regresar al menu principal, digite listas para regresar al menú de listas, o digite nodo para pasar a mostrar un nodo especifico: ");
                        } else{
                            String input = entrada.next();
                            if(input.equalsIgnoreCase("regresar")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menu principal.");
                                break menup;
                            }
                            if(input.equalsIgnoreCase("nodo")){
                                if(lista3.isEmptyList()){
                                    System.out.println("ADVERTENCIA!!. No se ingresó ningún valor a la lista. ");
                                    System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                                    String respuesta = entrada.next();
                                    while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                        System.out.println("Error, opcion no valida.");
                                        System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                                        respuesta=entrada.next();
                                    }
                                    if(respuesta.equalsIgnoreCase("si")){
                                        System.out.println("La lista es: ");
                                        lista3.mostrarNodos();
                                        break;
                                    }
                                    else if(respuesta.equalsIgnoreCase("no")){
                                        System.out.println();
                                        System.out.println("Digite un valor entero, digite regresar para regresar al menu principal, digite listas para regresar al menú de listas, o digite nodo para pasar a mostrar un nodo especifico: ");
                                        break regresarListaVacia7;
                                    }
                                }
                                System.out.println("Digite la posicion del nodo: " );
                                while (!entrada.hasNextInt()) {
                                    System.out.println("Error: La posicion debe ser un número entero.");
                                    System.out.println("Digite la posicion del nodo: ");
                                    entrada.next(); 
                                }
                                int posicion = entrada.nextInt();
                                lista3.obtenerNodo(posicion);
                                System.out.println("La lista es: ");
                                lista3.mostrarNodoEnPosicion(posicion);;
                                break;
                                
                            }
                            if(input.equalsIgnoreCase("listas")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menú de listas");
                                break menupp;
                            }
                            else{
                                System.out.println("Error, opcion no valida.");
                                System.out.println("Digite un valor entero, digite regresar para regresar al menu principal, digite listas para regresar al menú de listas, o digite nodo para pasar a mostrar un nodo especifico: ");

                            }
                        }
                     }

                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menu principal digite regresar.");
                        System.out.println("Si desea regresar al menu de listas digite listas.");
                        
                        
                        while(true){
                            String input3 = entrada.next();
                            if(input3.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input3.equalsIgnoreCase("regresar")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menu principal.");
                                break menup;
                            }
                            if(input3.equalsIgnoreCase("listas")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menu de listas");
                                break menupp;
                            }  
                            else{
                                System.out.println("Error, opcion no valida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menu principal digite regresar.");
                                System.out.println("Si desea regresar al menu de listas digite listas.");

                            }

                        }
                         
                         //eliminar nodo.
                         case 4: System.out.println("Digite un valor de tipo entero, digite regresar para regresar al menu principal, digite listas para regresar al menú de listas, o digite eliminar para eliminar un nodo especifico.");
                         Listas lista4 = new Listas ();
                         while(entrada.hasNext()){
                            regresarListaVacia8:
                            if(entrada.hasNextInt()){
                                int input = entrada.nextInt();
                                lista4.Insertaralfinal(input);
                                System.out.println("Digite un valor de tipo entero, digite regresar para regresar al menu principal, digite listas para regresar al menú de listas, o digite eliminar para eliminar un nodo especifico.");
                            }else{
                                String input = entrada.next();
                                if(input.equalsIgnoreCase("regresar")){
                                    System.out.println();
                                    System.out.println("Usted ha regresado al menu principal.");
                                    break menup;
                                }
                                if(input.equalsIgnoreCase("eliminar")){
                                    if(lista4.isEmptyList()){
                                        System.out.println("ADVERTENCIA!!. No se ingresó ningún valor a la lista. ");
                                        System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                                        String respuesta = entrada.next();
                                        while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                            System.out.println("Error, opcion no valida.");
                                            System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                                            respuesta=entrada.next();
                                        }
                                        if(respuesta.equalsIgnoreCase("si")){
                                            
                                            System.out.println("La lista es: ");
                                            lista4.mostrarNodos();
                                            break;
                                        }
                                        
                                         if(respuesta.equalsIgnoreCase("no")){
                                            System.out.println();
                                            System.out.println("Digite un valor de tipo entero, digite regresar para regresar al menu principal, digite listas para regresar al menú de listas, o digite eliminar para eliminar un nodo especifico.");
                                            break regresarListaVacia8;
                                        }
                                        
                                        
                                    }
                                    System.out.println("Digite la posicion: ");
                                    while(!entrada.hasNextInt()){
                                        System.out.println("Error: La posicion debe ser un número entero.");
                                        System.out.println("Digite la posicion: ");
                                        entrada.next();
                                    }
                                    int posicion=entrada.nextInt();
                                    lista4.eliminarNodo(posicion);
                                    System.out.println("La lista es: ");
                                    lista4.mostrarNodos();
                                    break;
                                }
                                if(input.equalsIgnoreCase("listas")){
                                    System.out.println();
                                    System.out.println("Usted ha regresado al menú de listas");
                                    break menupp;
                                }
                                else{
                                    System.out.println("Error, opcion no valida.");
                                    System.out.println("Digite un valor de tipo entero, digite salir para regresar al menu principal, digite listas para regresar al menú de listas, o digite eliminar para eliminar un nodo especifico.");
                                }
                            }
                         }

                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menu principal digite regresar.");
                        System.out.println("Si desea regresar al menu de listas digite listas.");
                        String input5 = entrada.next();
                        
                        while(true){
                            if(input5.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input5.equalsIgnoreCase("regresar")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menu principal.");
                                break menup;
                            }
                            if(input5.equalsIgnoreCase("listas")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menu de listas");
                                break;
                            }  
                            else{
                                System.out.println("Error, opcion no valida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menu principal digite regresar.");
                                System.out.println("Si desea regresar al menu de listas digite listas.");
                            }
                
                        }
                        break;
                        //regresar al menu principal.
                        case 5: System.out.println("Usted ha regresado al menu principal.");
                        break menup;

                       

                    
                }
                
            }
            
                                                        //colas
            case 2: System.out.println("Usted está en el menú de colas");
            
            while (true){
                System.out.println("Digite 1 para insertar cola.\nDigite 2 para eliminar cola.\nDigite 3 para obtener siguiente pedido.\nDigite 4 para regresar al menu principal.");
                op = entrada.nextInt();
                colas:
                switch (op){
                    //agregar cola.
                    case 1:  System.out.println("Digite el numero de pedido y nombre del cliente, digite regresar para regresar al menu principal, digite colas para regresar al menú de colas, o digite obtener para mostrar la cola.");
                    System.out.println("Digite el numero de pedido: ");
                    
                    colas cola = new colas ();
                    while(entrada.hasNext()){
                        Regresarcolavacia:
                        if(entrada.hasNextInt() && entrada.hasNextLine()){
                            int pedido =entrada.nextInt();
                            entrada.nextLine();
                            System.out.println("Digite el nombre de cliente: ");
                            String cliente = entrada.nextLine();
                            while (!cliente.matches("[a-z A-Z]+")) {
                                System.out.println("Error: El cliente debe ser un nombre, no un numero ni un caracter.");
                                System.out.println("Digite el nombre de cliente: ");
                                cliente = entrada.nextLine();
                            }
                            cola.agregarCola(pedido, cliente);
                            System.out.println("Digite el numero de pedido y nombre del cliente, digite regresar para regresar al menu principal, digite colas para regresar al menú de colas, o digite obtener para mostrar la cola.");
                            System.out.println("Digite el numero de pedido: ");
                        }else{
                            String input = entrada.next();
                            if(input.equalsIgnoreCase("regresar")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menu principal: ");
                                break menup;
                            }
                            if(input.equalsIgnoreCase("obtener")){
                            if(cola.isEmptyList()){
                            System.out.println("ADVERTENCIA!!. No se ingresó ningún valor a la cola. ");
                            System.out.println("Desea continuar con la cola vacia? digite si o digite no");
                            String respuesta = entrada.next();
                            while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                            System.out.println("Error, opcion no valida.");
                            System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                            respuesta=entrada.next();
                            }
                            if(respuesta.equalsIgnoreCase("si")){
                                System.out.println("La lista es: ");
                                cola.obtener();
                                break;
                            }
                            if(respuesta.equalsIgnoreCase("no")){
                                System.out.println();
                                System.out.println("Digite el numero de pedido y nombre del cliente, digite regresar para regresar al menu principal, digite colas para regresar al menú de colas, o digite obtener para mostrar la cola.");
                                System.out.println("Digite el numero de pedido: ");
                                break Regresarcolavacia;
                            }
                            }
                            System.out.println("La lista es: ");
                            cola.obtener();
                            break;
                            }
                            if(input.equalsIgnoreCase("colas")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menú de colas.");
                                break colas;                            
                            }
                            else{
                                System.out.println("Error, opcion no valida.");
                                System.out.println("Digite el numero de pedido y nombre del cliente, digite regresar para regresar al menu principal, o digite obtener para mostrar la cola.");
                                System.out.println("Digite el numero de pedido: ");
                            }
                        }
                    }

                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menu principal digite regresar.");
                        System.out.println("Si desea regresar al menu de colas digite colas.");
                        
                        
                        while(true){
                            String input1 = entrada.next();
                            if(input1.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input1.equalsIgnoreCase("regresar")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menu principal.");
                                break menup;
                            }
                            if(input1.equalsIgnoreCase("colas")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menu de colas");
                                break colas;
                            }  
                            else{
                                System.out.println("Error, opcion no valida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menu principal digite regresar.");
                                System.out.println("Si desea regresar al menu de listas digite colas.");
                                
                            }
                                  
                        }
                        //eliminar cola.
                        case 2:  System.out.println("Digite un dato de tipo entero, digite regresar para regresar al menú principal, digite colas para regresar al menú de colas, o digite eliminar para eliminar la cola. ");
                                System.out.println("Digite el numero de pedido: ");
                                colas cola2 = new colas ();
                                while(entrada.hasNext()){
                                    Regresarcolavacia2:
                                    if(entrada.hasNextInt() && entrada.hasNextLine()){
                                        int pedido = entrada.nextInt();
                                        entrada.nextLine();
                                        System.out.println("Digite el nombre del cliente: ");
                                        String cliente = entrada.nextLine();
                                        while(!cliente.matches("[a-z A-Z]+")){
                                        System.out.println("Error: El cliente debe ser un nombre, no un numero ni un caracter.");
                                        System.out.println("Digite el nombre del cliente: ");
                                        cliente=entrada.nextLine();
                                        }
                                        cola2.agregarCola(pedido, cliente);
                                        System.out.println("Digite un dato de tipo entero, digite regresar para regresar al menú principal, digite colas para regresar al menú de colas, o digite eliminar para eliminar la cola. ");
                                        System.out.println("Digite el numero de pedido: ");
                                    }
                                    else{
                                        String input = entrada.next();

                                        if(input.equalsIgnoreCase("regresar")){
                                            System.out.println("Usted ha regresado al menu principal.");
                                            break menup;
                                        }
                                        if(input.equalsIgnoreCase("eliminar")){
                                            if(cola2.isEmptyList()){
                                                System.out.println("ADVERTENCIA!!. No se ingresó ningún valor a la cola. ");
                                            System.out.println("Desea continuar con la cola vacia? digite si o digite no");
                                            String respuesta = entrada.next();
                                            while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                            System.out.println("Error, opcion no valida.");
                                            System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                                             respuesta=entrada.next();
                                        }
                                            if(respuesta.equalsIgnoreCase("si")){
                                            System.out.println("La lista es: ");
                                            cola2.obtener();
                                            break;
                                    }
                                            if(respuesta.equalsIgnoreCase("no")){
                                            System.out.println();
                                            System.out.println("Digite el numero de pedido y nombre del cliente, digite regresar para regresar al menu principal, digite colas para regresar al menú de colas, o digite obtener para mostrar la cola.");
                                            System.out.println("Digite el numero de pedido: ");
                                             break Regresarcolavacia2;
                                }
                                            }
                                            cola2.eliminar();
                                            System.out.println("El id y el cliente que elimino es: ");
                                            cola2.obtener();
                                            break;
                                        }
                                        if(input.equalsIgnoreCase("colas")){
                                            System.out.println();
                                            System.out.println("Usted ha regresado al menú de colas.");
                                            break colas;
                                        }
                                        else{
                                            System.out.println("Error, opción no válida.");
                                            System.out.println("Digite un dato de tipo entero, digite regresar para regresar al menú principal, digite colas para regresar al menú de colas, o digite eliminar para eliminar la cola. ");
                                        }
                                    }
                                }
                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menu principal digite regresar.");
                        System.out.println("Si desea regresar al menu de colas digite colas.");
                        
                        
                        while(true){
                            String input2 = entrada.next();
                            if(input2.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input2.equalsIgnoreCase("regresar")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menu principal.");
                                break menup;
                            }
                            if(input2.equalsIgnoreCase("colas")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menu de colas");
                                break colas;
                            }   else{
                                System.out.println("Error, opcion no valida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menu principal digite regresar.");
                                System.out.println("Si desea regresar al menu de colas digite colas.");
                                
                            }

                        }
                        //saber pedido siguiente.
                        case 3:  System.out.println("Digite el numero de pedidio, digite el nombre del cliente, digite regresar para regresar al menu principal, digite colas para regresar al menú de colas, o digite mostrar para mostrar la cola: ");
                        System.out.println("Digite el numero de pedido: ");
                                colas cola3 = new colas ();
                        while(entrada.hasNext()){
                            Regresarcolavacia3:
                            if (entrada.hasNextInt() && entrada.hasNextLine()){
                                int input = entrada.nextInt();
                                entrada.nextLine();
                                System.out.println("Digite el nombre del cliente: ");
                                String cliente = entrada.nextLine();
                                while(!cliente.matches("[a-z A-Z]+")){
                                    System.out.println("Error: El cliente debe ser un nombre, no un numero ni un caracter.");
                                    System.out.println("Digite el nombre del cliente: ");
                                    cliente=entrada.nextLine();
                                    }
                                cola3.agregarCola(input, cliente);
                                System.out.println("Digite el numero de pedidio, digite el nombre del cliente, digite regresar para regresar al menu principal, digite colas para regresar al menú de colas, o digite mostrar para mostrar la cola: ");
                                System.out.println("Digite el numero de pedido: ");
                            } else{
                                String input = entrada.next();
                                if(input.equalsIgnoreCase("mostrar")){
                                    if(cola3.isEmptyList()){
                                    System.out.println("ADVERTENCIA!!. No se ingresó ningún valor a la cola. ");
                                    System.out.println("Desea continuar con la cola vacia? digite si o digite no");
                                    String respuesta = entrada.next();
                                    while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                    System.out.println("Error, opcion no valida.");
                                    System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                                    respuesta=entrada.next();
                                    }
                                    if(respuesta.equalsIgnoreCase("si")){
                                        System.out.println("La lista es: ");
                                        cola3.obtener();
                                        break;
                                    }
                                    if(respuesta.equalsIgnoreCase("no")){
                                        System.out.println();
                                        System.out.println("Digite el numero de pedido y nombre del cliente, digite regresar para regresar al menu principal, digite colas para regresar al menú de colas, o digite obtener para mostrar la cola.");
                                        System.out.println("Digite el numero de pedido: ");
                                        break Regresarcolavacia3;
                                    }
                                    }
                                    System.out.println("El siguiente pedido es: ");
                                    cola3.saberPedido();
                                    break;
                                }
                                if(input.equalsIgnoreCase("regresar")){
                                    System.out.println();
                                    System.out.println("Usted ha regresado la menu principal.");
                                    break menup;
                                }
                                
                                if(input.equalsIgnoreCase("colas")){
                                    System.out.println();
                                    System.out.println("Usted ha regresado al menú de colas.");
                                    break colas;
                                }
                                else{
                                    System.out.println("Error, opción no válida.");
                                    System.out.println("Digite el numero de pedidio, digite el nombre del cliente, digite regresar para regresar al menu principal, digite colas para regresar al menú de colas, o digite mostrar para mostrar la cola: ");
                                }
                            }
                        }
                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menu principal digite regresar.");
                        System.out.println("Si desea regresar al menu de colas digite colas.");
                        String input3 = entrada.next();
                        
                        while(true){
                            if(input3.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input3.equalsIgnoreCase("regresar")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menu principal.");
                                break menup;
                            }
                            if(input3.equalsIgnoreCase("colas")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menu de colas");
                                break colas;
                            }  else{
                                System.out.println("Error, opcion no valida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menu principal digite regresar.");
                                System.out.println("Si desea regresar al menu de colas digite colas.");
                                input3=entrada.next();
                            }

                        }
                        //regresar al menu principal.
                        case 4: System.out.println("Usted ha regresado al menu principal.");
                        break menup;

                        default: System.out.println("Error, opcion no valida.");
                       break;
                        

                }
            }
                                                    //pilas.
            case 3: System.out.println("Usted está en el menú de pilas");
            while(true){
                System.out.println("Digite una opcion: \n1. Apilar pilas \n2. Desapilar N pila \n3. Destruir \n4. salir al menu principal");
                op=entrada.nextInt();
                pilas:
                switch (op) {
                    case 1://Apilar pilas
                       System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver la cola\n Digite 'pilas' para regresar al menú de pilas\n Digite 'regresar' para regresar al menu pricipal");
                       System.out.println(" -Digite el numero del libro: ");
                       pilas pilass= new pilas();
                       while (entrada.hasNext()) {
                        Regresarpilavacia:
                         if (entrada.hasNextInt() && entrada.hasNextLine()) {
                             int numero=entrada.nextInt();
                             entrada.nextLine();
                             System.out.println("-Digite el nombre del autor");
                             String autor= entrada.nextLine();
                             while(!autor.matches("[a-z A-Z]+")){
                                System.out.println("Error: el autor debe ser un nombre, no un numero ni un caracter.");
                                System.out.println("-Digite el nombre del autor");
                                autor = entrada.nextLine();
                             }
                             System.out.println("-Digite el nombre del libro");
                             String libro= entrada.nextLine();
                             while(!libro.matches("[a-z A-Z]+")){
                                System.out.println("Error: el libro debe ser un nombre, no un numero ni un caracter.");
                                System.out.println("-Digite el nombre del libro");
                                libro = entrada.nextLine();
                             }
                             pilass.apilar(numero, autor, libro);
                             System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver la cola\n Digite 'pilas' para regresar al menú de pilas\n Digite 'regresar' para regresar al menu pricipal");
                             System.out.println(" -Digite el numero de libro: ");
                            }else{ 
                            String input= entrada.next();
                             if (input.equalsIgnoreCase("regresar")) {
                                System.out.println();
                                 System.out.println("Usted ha regresado al menu principal");
                                 break menup;  
                               }
                             if(input.equalsIgnoreCase("obtener")){
                                if(pilass.isEmptyList()){
                                System.out.println("ADVERTENCIA!!, no se ingresó nigun valor a la pila");
                                System.out.println("Desea continuar con la pila vacía? Digite si o digite no");
                                String respuesta=entrada.next();
                                while(!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")){
                                    System.out.println("Error, opcion no valida.");
                                    System.out.println("Desea continuar con la lista de pilas vacía? Digite si o digite no");
                                    respuesta=entrada.next();
                                }
                                if(respuesta.equalsIgnoreCase("si")){
                                    System.out.println("La lista de pilas es: ");
                                    pilass.obtenerTope();
                                    break;
                                }
                                if(respuesta.equalsIgnoreCase("no")){
                                    System.out.println();
                                    System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver la cola\n Digite 'pilas' para regresar al menú de pilas\n Digite 'regresar' para regresar al menu pricipal");
                                    System.out.println(" -Digite el numero de libro: ");
                                    break Regresarpilavacia;
                                }
                                }
                                 System.out.println("La lista de pilas es: ");
                                 pilass.obtenerTope();
                                 break;
                               }
                               if(input.equalsIgnoreCase("pilas")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menú de pilas.");
                                break pilas;
                               }
                            else{
                                 System.out.println("ERROR!!!");
                                 System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver las listas de pilas\n Digite 'salir' para regresar al menu pricipal");
                                 System.out.println("-Digite el numero del libro: ");
                                }
                            }
                        }    

                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menu principal digite regresar.");
                        System.out.println("Si desea regresar al menu de pilas digite pilas.");
                        String input3 = entrada.next();
                        
                        while(true){
                            if(input3.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input3.equalsIgnoreCase("regresar")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menu principal.");
                                break menup;
                            }
                            if(input3.equalsIgnoreCase("pilas")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menu de pilas");
                                break pilas;
                            }  else{
                                System.out.println("Error, opcion no valida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menu principal digite regresar.");
                                System.out.println("Si desea regresar al menu de pilas digite pilas.");
                                input3=entrada.next();
                            }

                        }
                        //desapilar N pila
                        case 2: 
                        System.out.println("Digite alguna opcion: \n Digite 'desapilar' para ver las listas de pilas \nDigite 'pilas' para regresar al menú de pilas \nDigite 'regresar' para regresar al menu pricipal");
                        System.out.println(" -Digite el numero del libro: ");
                    
                        pilas pilas2 = new pilas();
                        while(entrada.hasNext()){
                            Regresarpilavacia2:
                            if(entrada.hasNextInt() && entrada.hasNextLine()){
                                int numero = entrada.nextInt();
                                entrada.nextLine();
                                System.out.println("Digite el nombre del autor: ");
                                String autor = entrada.nextLine();
                                while(!autor.matches("[a-z A-Z]+")){
                                    System.out.println("Error: el autor debe ser un nombre, no un numero ni un caracter.");
                                    System.out.println("-Digite el nombre del autor");
                                    autor = entrada.nextLine();
                                 }
                                System.out.println("Digite el nombre del libro: ");
                                String libro = entrada.nextLine();
                                while(!libro.matches("[a-z A-Z]+")){
                                    System.out.println("Error: el libro debe ser un nombre, no un numero ni un caracter.");
                                    System.out.println("-Digite el nombre del libro");
                                    libro = entrada.nextLine();
                                 }
                                pilas2.apilar(numero, autor, libro);
                                System.out.println("Digite alguna opcion: \n Digite 'desapilar' para ver las listas de pilas \nDigite 'pilas' para regresar al menú de pilas \nDigite 'regresar' para regresar al menu pricipal");
                                System.out.println(" -Digite el numero del libro: ");
                            }else{
                                String input = entrada.next();
                                System.out.println();
                                if(input.equalsIgnoreCase("regresar")){
                                    System.out.println("Usted ha regresado al menu principal.");
                                    break menup;
                                }
                                if(input.equalsIgnoreCase("desapilar")){
                                    if(pilas2.isEmptyList()){
                                        System.out.println("ADVERTENCIA!!. No se ingresó ningún valor a la pila. ");
                                        System.out.println("Desea continuar con la lista de pilas vacia? digite si o digite no");
                                        String respuesta=entrada.next();
                                        while(!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")){
                                            System.out.println("Error, opcion no valida.");
                                            System.out.println("Desea continuar con la cola vacia? digite si o digite no");
                                            respuesta=entrada.next();
                                        }
                                        if(respuesta.equalsIgnoreCase("si")){
                                            System.out.println("La lista de pilas es:  ");
                                            System.out.println(pilas2.length());
                                            break;
                                        }
                                        if(respuesta.equalsIgnoreCase("no")){
                                            System.out.println();
                                            System.out.println("Digite alguna opcion: \n Digite 'desapilar' para ver las listas de pilas \nDigite 'pilas' para regresar al menú de pilas \nDigite 'regresar' para regresar al menu pricipal");
                                            System.out.println(" -Digite el numero del libro: ");
                                            break Regresarpilavacia2;
                                        }
                                    }
                                    System.out.println("Digite la cantidad a desapilar: ");
                                    while(!entrada.hasNextInt()){
                                        System.out.println("Error: La cantidad debe ser un numero entero.");
                                        System.out.println("Digite la cantidad a desapilar: ");
                                        entrada.next();
                                    }
                                    int cantidad= entrada.nextInt();
                                    System.out.println("La lista de pilas es: ");
                                    System.out.println(pilas2.length());
                                    pilas2.desapilarN(cantidad);
                                    System.out.println(pilas2.length());
                                    break;
                                }
                                if(input.equalsIgnoreCase("pilas")){
                                    System.out.println();
                                    System.out.println("Usted ha regresado al menú de pilas.");
                                    break pilas;
                                }
                                else{
                                    System.out.println("Error, opcion no valida.");
                                    System.out.println("Digite alguna opcion: \n Digite 'desapilar' para ver las listas de pilas\n Digite 'salir' para regresar al menu pricipal");
                                    System.out.println(" -Digite el numero del libro: ");
                                }
                            }
                        }

                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menu principal digite regresar.");
                        System.out.println("Si desea regresar al menu de pilas digite pilas.");
                        String input4 = entrada.next();
                        
                        while(true){
                            if(input4.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input4.equalsIgnoreCase("regresar")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menu principal.");
                                break menup;
                            }
                            if(input4.equalsIgnoreCase("pilas")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menu de pilas");
                                break pilas;
                            }  else{
                                System.out.println("Error, opcion no valida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menu principal digite regresar.");
                                System.out.println("Si desea regresar al menu de pilas digite pilas.");
                                input4=entrada.next();
                            }

                        }
                           //Destruir
                           case 3: 
                           System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver las listas de pilas\n Digite 'pilas' para regresar al menú de pilas\n Digite 'regresar' para regresar al menu pricipal");
                           System.out.println(" -Digite el numero del libro: ");
                           pilas pila3= new pilas (); 
                           while(entrada.hasNext()){
                            Regresarpilavacia3:
                            if(entrada.hasNextInt() && entrada.hasNextLine()){
                                int numero = entrada.nextInt();
                                entrada.nextLine();
                                System.out.println("Digite el nombre del autor: ");
                                String autor = entrada.nextLine();
                                while(!autor.matches("[a-z A-Z]+")){
                                    System.out.println("Error: el autor debe ser un nombre, no un numero ni un caracter.");
                                    System.out.println("-Digite el nombre del autor");
                                    autor = entrada.nextLine();
                                 }
                                System.out.println("Digite el nombre del libro: ");
                                String libro = entrada.nextLine();
                                while(!libro.matches("[a-z A-Z]+")){
                                    System.out.println("Error: el libro debe ser un nombre, no un numero ni un caracter.");
                                    System.out.println("-Digite el nombre del libro: ");
                                    libro = entrada.nextLine();
                                 }
                                pila3.apilar(numero, autor, libro);
                                System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver las listas de pilas\n Digite 'pilas' para regresar al menú de pilas\n Digite 'regresar' para regresar al menu pricipal");
                                System.out.println(" -Digite el numero del libro: ");
                            }else{
                                String input = entrada.next();
                                if(input.equalsIgnoreCase("regresar")){
                                    System.out.println();
                                    System.out.println("Usted ha regresado al menu principal.");
                                    break menup;
                                }
                                if(input.equalsIgnoreCase("obtener")){
                                    if(pila3.isEmptyList()){
                                        System.out.println("ADVERTENCIA!!. No se ingresó ningún valor a la pila. ");
                                        System.out.println("Desea continuar con la lista de pilas vacia? digite si o digite no");
                                        String respuesta=entrada.next();
                                        while(!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")){
                                            System.out.println("Error, opcion no valida.");
                                            System.out.println("Desea continuar con la cola vacia? digite si o digite no");
                                            respuesta=entrada.next();
                                        }
                                        if(respuesta.equalsIgnoreCase("si")){
                                            System.out.println("La lista de pilas es:  ");
                                            System.out.println(pila3.length());
                                            break;
                                        }
                                        if(respuesta.equalsIgnoreCase("no")){
                                            System.out.println();
                                            System.out.println("Digite alguna opcion: \n Digite 'desapilar' para ver las listas de pilas \nDigite 'pilas' para regresar al menú de pilas \nDigite 'regresar' para regresar al menu pricipal");
                                            System.out.println(" -Digite el numero del libro: ");
                                            break Regresarpilavacia3;
                                        }
                                    }
                                    System.out.println("La lista de pilas es: ");
                                    System.out.println(pila3.length());
                                    pila3.destructor();
                                    System.out.println(pila3.length());
                                    break;

                                  }
                                  if(input.equalsIgnoreCase("pilas")){
                                    System.out.println();
                                    System.out.println("Usted ha regresado al menú de pilas");
                                    break pilas;
                                  }
                                  else{
                                    System.out.println("Error, opcion no valida.");
                                    System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver las listas de pilas\n Digite 'salir' para regresar al menu pricipal");
                                    System.out.println(" -Digite el numero del libro: ");
                                  }

                            }
                           }
                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menu principal digite regresar.");
                        System.out.println("Si desea regresar al menu de pilas digite pilas.");
                        String input5 = entrada.next();
                        
                        while(true){
                            if(input5.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input5.equalsIgnoreCase("regresar")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menu principal.");
                                break menup;
                            }
                            if(input5.equalsIgnoreCase("pilas")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menu de pilas");
                                break pilas;
                            }  else{
                                System.out.println("Error, opcion no valida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menu principal digite regresar.");
                                System.out.println("Si desea regresar al menu de pilas digite pilas.");
                                input5 = entrada.next();
                            }

                        }

                    case 4: System.out.println("Usted ha regresado la menu principal.");
                    break menup;
                        
                }
                
              }
              //arboles
            case 4: System.out.println("Usted está en el menú de árboles");
            while (true) {
            System.out.println("digite 1 para ordenar el árbol en 'inorder'.");
            System.out.println("digite 2 para ordenar el árbol en 'preorder'.");
            System.out.println("digite 3 para ordenar el árbol en 'postorder'.");
            System.out.println("digite 4 para eliminar un nodo del árbol.");
            System.out.println("digite 5 para buscar nodo en el árbol.");
            System.out.println("digite 6 para contar las hojas del árbol.");
            System.out.println("digite 7 para contar nodos del árbol.");
            System.out.println("digite 8 para saber la altura del árbol.");
            System.out.println("digite 9 para saber el valor menor del árbol.");
            System.out.println("digite 10 para saber el valor mayor del árbol.");
            System.out.println("digite 11 para salir la menú pricipal.");

            op=entrada.nextInt();

            while (op>11){
                System.out.println("Error, opción no válida");
                System.out.println();
                System.out.println("digite 1 para ordenar el árbol en 'inorder'.");
                System.out.println("digite 2 para ordenar el árbol en 'preorder'.");
                System.out.println("digite 3 para ordenar el árbol en 'postorder'.");
                System.out.println("digite 4 para eliminar un nodo del árbol.");
                System.out.println("digite 5 para buscar nodo en el árbol.");
                System.out.println("digite 6 para contar las hojas del árbol.");
                System.out.println("digite 7 para contar nodos del árbol.");
                System.out.println("digite 8 para saber la altura del árbol.");
                System.out.println("digite 9 para saber el valor menor del árbol.");
                System.out.println("digite 10 para saber el valor mayor del árbol.");
                System.out.println("digite 11 para salir la menú pricipal.");
                op=entrada.nextInt();
            }
            arbol:
            switch(op){
                //inorder
            case 1: System.out.println("Digite los nodos del arbol, digite salir para regresar al menu principal, digite obtener para mostrar el orden del arbol, o digite arboles para regresar la menu de arboles.");
            
            arbolBinario arbol = new arbolBinario();
            while(entrada.hasNext()){
                Regresararbolvacio:
                if(entrada.hasNextInt()){
                    int nodo = entrada.nextInt();
                    arbol.insertar(nodo);
                    System.out.println("Digite los nodos del arbol, digite regresar para regresar al menu principal, digite obtener para mostrar el orden del arbol, o digite arboles para regresar la menu de arboles.");
                }else{
                    String input = entrada.next();
                    if(input.equalsIgnoreCase("regresar")){
                        System.out.println("Usted ha regresado al menu prinicipal.");
                        break menup;
                    }
                    if(input.equalsIgnoreCase("arboles")){
                        System.out.println("Usted ha regresado al menu de arboles.");
                        break arbol;
                    }
                    if(input.equalsIgnoreCase("obtener")){
                        if(arbol.raiz==null){
                            System.out.println("ADVERTENCIA!!. No se ingresó ningún valor al árbol. ");
                            System.out.println("Desea continuar con el árbol vacío? digite si o digite no");
                            String respuesta = entrada.next();
                            while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                            System.out.println("Error, opcion no valida.");
                            System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                            respuesta=entrada.next();
                          }
                          if(respuesta.equalsIgnoreCase("si")){
                            System.out.println("El arbol está vacío.");
                            break;
                          }
                          if(respuesta.equalsIgnoreCase("no")){
                            System.out.println();
                            System.out.println("Digite los nodos del arbol, digite regresar para regresar al menu principal, digite obtener para mostrar el orden del arbol, o digite arboles para regresar la menu de arboles.");
                            break Regresararbolvacio;
                          }
                        }
                        System.out.println("El orden del arbol es: ");
                        arbol.inorder(arbol.raiz);
                        break;
                    }
                    else{
                        System.out.println("Error, opcion no valida");
                        System.out.println("Digite los nodos del arbol, digite regresar para regresar al menu principal, digite obtener para mostrar el orden del arbol, o digite arboles para regresar al menu de arboles .");
                
                    }
                }
            }
                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menu principal digite regresar.");
                        System.out.println("Si desea regresar al menu de arboles digite arboles.");
                        String input5 = entrada.next();
                        
                        while(true){
                            if(input5.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input5.equalsIgnoreCase("regresar")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menu principal.");
                                break menup;
                            }
                            if(input5.equalsIgnoreCase("arboles")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menu de arboles");
                                break arbol;
                            }  else{
                                System.out.println("Error, opcion no valida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menu principal digite regresar.");
                                System.out.println("Si desea regresar al menu de pilas digite pilas.");
                                input5=entrada.next();
                            }

                        }
                        //preorder
                        case 2: System.out.println("Digite los nodos del arbol, digite regresar para regresar al menu principal, digite obtener para mostrar el orden del arbol, o digite arboles para regresar la menu de arboles.");
                        arbolBinario arbol2 = new arbolBinario();
                        while(entrada.hasNext()){
                            Regresararbolvacio2:
                            if(entrada.hasNextInt()){
                                int input = entrada.nextInt();
                                arbol2.insertar(input);
                                System.out.println("Digite los nodos del arbol, digite regresar para regresar al menu principal, digite obtener para mostrar el orden del arbol, o digite arboles para regresar la menu de arboles.");
                            }else{
                                String input = entrada.next();
                                if(input.equalsIgnoreCase("regresar")){
                                    System.out.println("Usted ha regresado al menu principal: ");
                                    return;
                                }
                                else if(input.equalsIgnoreCase("obtener")){
                                    if(arbol2.raiz==null){
                                        System.out.println("ADVERTENCIA!!. No se ingresó ningún valor al árbol. ");
                                        System.out.println("Desea continuar con el árbol vacío? digite si o digite no");
                                        String respuesta = entrada.next();
                                        while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                        System.out.println("Error, opcion no valida.");
                                        System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                                        respuesta=entrada.next();
                                      }
                                      if(respuesta.equalsIgnoreCase("si")){
                                        System.out.println("El arbol está vacío.");
                                        break;
                                      }
                                      if(respuesta.equalsIgnoreCase("no")){
                                        System.out.println();
                                        System.out.println("Digite los nodos del arbol, digite regresar para regresar al menu principal, digite obtener para mostrar el orden del arbol, o digite arboles para regresar la menu de arboles.");
                                        break Regresararbolvacio2;
                                      }
                                    }
                                    System.out.println("El orbol ordenado en 'preorder' es: ");
                                    arbol2.preorder(arbol2.raiz);
                                    break;
                                }
                                else if(input.equalsIgnoreCase("arboles")){
                                    System.out.println("Usted ha regresado al menu de arboles.");
                                    break arbol;
                                }
                                else{
                                    System.out.println("Error. opcion no valida");
                                    System.out.println("Digite los nodos del arbol, digite regresar para regresar al menu principal, digite obtener para mostrar el orden del arbol, o digite arboles para regresar la menu de arboles.");
                                }
                            }
                        }

                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menu principal digite regresar.");
                        System.out.println("Si desea regresar al menu de arboles digite arboles.");
                        String input6 = entrada.next();
                        while(true){
                            if(input6.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input6.equalsIgnoreCase("regresar")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menu principal.");
                                break menup;
                            }
                            if(input6.equalsIgnoreCase("arboles")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menu de arboles");
                                break arbol;
                            }  else{
                                System.out.println("Error, opcion no valida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menu principal digite regresar.");
                                System.out.println("Si desea regresar al menu de pilas digite pilas.");
                                input6=entrada.next();
                            }

                        }
                        //postorder
                        case 3: System.out.println("Digite los nodos del arbol, digite regresar para regresar al menu principal, digite obtener para mostrar el orden del arbol, o digite arboles para regresar la menu de arboles.");
                        arbolBinario arbol3 = new arbolBinario();

                        while(entrada.hasNext()){
                            Regresararbolvacio3:
                            if(entrada.hasNextInt()){
                                int input = entrada.nextInt();
                                arbol3.insertar(input);
                                System.out.println("Digite los nodos del arbol, digite regresar para regresar al menu principal, digite obtener para mostrar el orden del arbol, o digite arboles para regresar la menu de arboles.");
                        }
                        else{
                            String input = entrada.next();
                            if(input.equalsIgnoreCase("regresar")){
                                System.out.println("Usted ha regresado al menu principal.");
                                break menup;
                            }
                            else if(input.equalsIgnoreCase("obtener")){
                                if(arbol3.raiz==null){
                                    System.out.println("ADVERTENCIA!!. No se ingresó ningún valor al árbol. ");
                                    System.out.println("Desea continuar con el árbol vacío? digite si o digite no");
                                    String respuesta = entrada.next();
                                    while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                    System.out.println("Error, opcion no valida.");
                                    System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                                    respuesta=entrada.next();
                                  }
                                  if(respuesta.equalsIgnoreCase("si")){
                                    System.out.println("El arbol está vacío.");
                                    break;
                                  }
                                  if(respuesta.equalsIgnoreCase("no")){
                                    System.out.println();
                                    System.out.println("Digite los nodos del arbol, digite regresar para regresar al menu principal, digite obtener para mostrar el orden del arbol, o digite arboles para regresar la menu de arboles.");
                                    break Regresararbolvacio3;
                                  }
                                }
                                System.out.println("El arbol ordenado en 'postorder' es:");
                                arbol3.postOrder(arbol3.raiz);
                                break;
                            }
                            else if(input.equalsIgnoreCase("arboles")){
                            System.out.println("Usted ha regresado al menu de árboles.");
                            break arbol;
                            }
                            else{
                                System.out.println("Error, opcion no valida.");
                                System.out.println("Digite los nodos del arbol, digite salir para regresar al menu principal, digite obtener para mostrar el orden del arbol, o digite arboles para regresar la menu de arboles.");
                            }
                        }
                    }

                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menu principal digite regresar.");
                        System.out.println("Si desea regresar al menu de arboles digite arboles.");
                        String input7 = entrada.next();
                        
                        while(true){
                            if(input7.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input7.equalsIgnoreCase("regresar")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menu principal.");
                                break menup;
                            }
                            if(input7.equalsIgnoreCase("arboles")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menu de arboles");
                                break arbol;
                            }  else{
                                System.out.println("Error, opcion no valida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menu principal digite regresar.");
                                System.out.println("Si desea regresar al menu de pilas digite pilas.");
                                input7=entrada.next();
                            }

                        }
                        //Eliminar Nodo del arbol
                        case 4: System.out.println("Digite los nodos del arbol, digite regresar para regresar al menu principal,digite salir para regresar al menu principal, digite eliminar para eliminar el valor que deseé del arbol, o digite arboles para regresar la menu de arboles.");
                        arbolBinario arbol4 = new arbolBinario();
                        while(entrada.hasNext()){
                            Regresararbolvacio4:
                            if(entrada.hasNextInt()){
                                int input = entrada.nextInt();
                                arbol4.insertar(input);
                                System.out.println("Digite los nodos del arbol, digite regresar para regresar al menu principal, digite eliminar para eliminar el valor que deseé del arbol, o digite arboles para regresar la menu de arboles.");
                                
                            } else{
                                String input = entrada.next();
                                if(input.equalsIgnoreCase("regresar")){
                                    System.out.println("Usted ha regresado al menú principal.");
                                    break menup;
                                }
                                else if(input.equalsIgnoreCase("arboles")){
                                    System.out.println("Usted ha regresado al menú de arboles.");
                                    break arbol;
                                }
                                else if(input.equalsIgnoreCase("eliminar")){
                                    if(arbol4.raiz==null){
                                        System.out.println("ADVERTENCIA!!. No se ingresó ningún valor al árbol. ");
                                        System.out.println("Desea continuar con el árbol vacío? digite si o digite no");
                                        String respuesta = entrada.next();
                                        while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                        System.out.println("Error, opcion no valida.");
                                        System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                                        respuesta=entrada.next();
                                      }
                                      if(respuesta.equalsIgnoreCase("si")){
                                        System.out.println("El arbol está vacío.");
                                        break;
                                      }
                                      if(respuesta.equalsIgnoreCase("no")){
                                        System.out.println();
                                        System.out.println("Digite los nodos del arbol, digite regresar para regresar al menu principal, digite eliminar para eliminar el valor que deseé del arbol, o digite arboles para regresar la menu de arboles.");
                                        break Regresararbolvacio4;
                                      }
                                    }
                                    boolean entradavalida = false;
                                    while(!entradavalida){
                                    System.out.println("En qué orden desea imprimir? Digite inorder, preorder o postorder");
                                    String input3 = entrada.next();
                                    if (input3.equalsIgnoreCase("inorder")) {    
                                    System.out.println("Digite el valor que desea eliminar");
                                    int input2 = entrada.nextInt();
                                    System.out.println();
                                    while(input2>arbol4.contarNodos()){
                                        System.out.println("No se encontró el número digitado, por lo tanto no se eliminó");
                                        System.out.println("Digite el valor que desea eliminar");
                                        input2 = entrada.nextInt();
                                    }
                                    System.out.println("El valor que eliminó fué: "+input2);
                                    System.out.println("El restante del árbol es: ");
                                    arbol4.eliminar(input2);
                                    arbol4.inorder(arbol4.raiz);
                                    entradavalida=true;
                                    break;
                                    
                                }
                                    if(input3.equalsIgnoreCase("preorder")){

                                    System.out.println("Digite el valor que desea elminar");
                                    int input2 = entrada.nextInt();
                                    System.out.println();
                                    while(input2>arbol4.contarNodos()){
                                        System.out.println("No se encontro el número digitado, por lo tanto no se eliminó");
                                        System.out.println("Digite el valor que desea elminar");
                                        input2 = entrada.nextInt();
                                    }
                                    System.out.println("El valor que eliminó fué: "+input2);
                                    System.out.println("El restante del árbol es: ");
                                    arbol4.eliminar(input2);
                                    arbol4.preorder(arbol4.raiz);
                                    entradavalida=true;
                                    break;
                                    }
                                    if (input3.equalsIgnoreCase("postorder")){
                                        System.out.println("Digite el valor que desea eliminar");
                                    int input2 = entrada.nextInt();
                                    System.out.println();
                                    while(input2>arbol4.contarNodos()){
                                        System.out.println("No se encontro el número digitado, por lo tanto no se eliminó");
                                        System.out.println("Digite el valor que desea eliminar");
                                        input2 = entrada.nextInt();
                                    }
                                    System.out.println("El valor que eliminó fué: "+input2);
                                    System.out.println("El restante del árbol es: ");
                                    arbol4.eliminar(input2);
                                    arbol4.postOrder(arbol4.raiz);
                                    entradavalida=true;
                                    break;
                                    }
                                    else{
                                        System.out.println("Error, opcion no válida");
                                    }
                                }
                                break;
                                }
                                
                                else if(input.equalsIgnoreCase("arboles")){
                                    System.out.println("Usted ha regresado al menú de árboles.");
                                    break arbol;
                                }
                                else{
                                    System.out.println("Error, opcion no válida.");
                                    System.out.println("Digite los nodos del árbol, digite salir para regresar al menú principal, digite eliminar para eliminar el valor que deseé del árbol, o digite arboles para regresar la menú de árboles.");

                                }
                            }
                        }
                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menu principal digite regresar.");
                        System.out.println("Si desea regresar al menu de arboles digite arboles.");
                        String input8 = entrada.next();
                        
                        while(true){
                            if(input8.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input8.equalsIgnoreCase("regresar")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menú principal.");
                                break menup;
                            }
                            if(input8.equalsIgnoreCase("arboles")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menú de arboles");
                                break arbol;
                            }  else{
                                System.out.println("Error, opcion no válida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menú principal digite regresar.");
                                System.out.println("Si desea regresar al menú de pilas digite pilas.");
                                input8=entrada.next();
                            }

                        }

                        //Buscar nodo del arbol
                        case 5: System.out.println("Digite los nodos del árbol, digite regresar para regresar al menu principal, digite buscar para buscar el valor que deseé del árbol, o digite arboles para regresar la menú de arboles.");
                        arbolBinario arbol5 = new arbolBinario();
                        while(entrada.hasNext()){
                            Regresararbolvacio5:
                            if(entrada.hasNextInt()){
                                int input = entrada.nextInt();
                                arbol5.insertar(input);
                                System.out.println("Digite los nodos del árbol, digite regresar para regresar al menú principal, digite buscar para buscar el valor que deseé del árbol, o digite arboles para regresar la menú de arboles.");
                            }
                            else{
                                String input = entrada.next();
                                if(input.equalsIgnoreCase("regresar.")){
                                    System.out.println("Usted ha regresado al menú principal.");
                                    break menup;
                                }
                                else if(input.equalsIgnoreCase("buscar")){
                                    if(arbol5.raiz==null){
                                        System.out.println("ADVERTENCIA!!. No se ingresó ningún valor al árbol. ");
                                        System.out.println("Desea continuar con el árbol vacío? digite si o digite no");
                                        String respuesta = entrada.next();
                                        while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                        System.out.println("Error, opcion no valida.");
                                        System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                                        respuesta=entrada.next();
                                      }
                                      if(respuesta.equalsIgnoreCase("si")){
                                        System.out.println("El arbol está vacío.");
                                        break;
                                      }
                                      if(respuesta.equalsIgnoreCase("no")){
                                        System.out.println();
                                        System.out.println("Digite los nodos del árbol, digite regresar para regresar al menú principal, digite buscar para buscar el valor que deseé del árbol, o digite arboles para regresar la menú de arboles.");
                                        break Regresararbolvacio5;
                                      }
                                    }
                                    boolean entradavalida = false;
                                    while(!entradavalida){
                                    System.out.println("En qué orden desea imprimir? Digite inorder, preorder o postorder");
                                    String input3 = entrada.next();
                                    if (input3.equalsIgnoreCase("inorder")) {    
                                    boolean encontrado = false;
                                    while(!encontrado){
                                        System.out.println("Digite el valor que desea buscar");
                                        int valor = entrada.nextInt();
                                        NodoBinario buscando = arbol5.buscar(valor);
                                        if(buscando==null){
                                            System.out.println("No se encontró el valor.");
                                        }
                                        else{
                                            System.out.println("El valor buscado es el número: " + buscando.valor);
                                            System.out.println();
                                            System.out.println("El árbol es" );
                                            arbol5.inorder(arbol5.raiz);
                                            entradavalida = true;
                                            break;
                                        }
                                    }
                                    break;
                                    }
                                    if(input3.equalsIgnoreCase("preorder")){
                                        boolean encontrado = false;
                                        while(!encontrado){
                                            System.out.println("Digite el valor que desea buscar");
                                            int valor = entrada.nextInt();
                                            NodoBinario buscando = arbol5.buscar(valor);
                                            if(buscando==null){
                                                System.out.println("No se encontró el valor.");
                                            }
                                            else{
                                                System.out.println("El valor buscado es el número: " + buscando.valor);
                                                System.out.println();
                                                System.out.println("El árbol es" );
                                                arbol5.preorder(arbol5.raiz);
                                                entradavalida = true;
                                                break;
        
                                            }
                                        }
                                        break;
                                    }
                                    if (input3.equalsIgnoreCase("postorder")){
                                        boolean encontrado = false;
                                        while(!encontrado){
                                            System.out.println("Digite el valor que desea buscar");
                                            int valor = entrada.nextInt();
                                            NodoBinario buscando = arbol5.buscar(valor);
                                            if(buscando==null){
                                                System.out.println("No se encontró el valor.");
                                            }
                                            else{
                                                System.out.println("El valor buscado es el número: " + buscando.valor);
                                                System.out.println();
                                                System.out.println("El arbol es" );
                                                arbol5.postOrder(arbol5.raiz);
                                                entradavalida = true;
                                                break;
                                            }
                                        }
                                        break; 
                                    }
                                    else{
                                        System.out.println("Error. opción no válida.");
                                    }
                                }
                                break;
                                 
                                }
                                 else if(input.equalsIgnoreCase("arboles")){
                                    System.out.println("Usted ha regresado al menú de arboles.");
                                    break arbol;
                                }
                                else{
                                    System.out.println("Error, opción no válida.");
                                    System.out.println("Digite los nodos del arbol,,digite salir para regresar al menu principal, digite buscar para buscar el valor que deseé del árbol, o digite arboles para regresar la menú de arboles.");

                                }
                            }
                        }

                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menú principal digite regresar.");
                        System.out.println("Si desea regresar al menú de arboles digite arboles.");
                        String input9 = entrada.next();
                        
                        while(true){
                            if(input9.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input9.equalsIgnoreCase("regresar")){
                                System.out.println();
                                System.out.println();
                                System.out.println("Usted ha regresado al menú principal.");
                                break menup;
                            }
                            if(input9.equalsIgnoreCase("arboles")){
                                System.out.println();
                                System.out.println();
                                System.out.println("Usted ha regresado al menú de arboles");
                                break arbol;
                            }  else{
                                System.out.println("Error, opción no válida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menú principal digite regresar.");
                                System.out.println("Si desea regresar al menú de pilas digite pilas.");
                                input9=entrada.next();

                            }

                        }
                        //contar hojas
                        case 6:System.out.println("Digite los nodos del árbol, digite regresar para regresar al menú principal, digite contar para contar las hojas del árbol, o digite arboles para regresar la menú de árboles.");
                        arbolBinario arbol6 = new arbolBinario();
                        while(entrada.hasNext()){
                            Regresararbolvacio6:
                            if (entrada.hasNextInt()){
                            int input = entrada.nextInt();
                            arbol6.insertar(input);
                            System.out.println("Digite los nodos del árbol, digite regresar para regresar al menú principal, digite contar para contar las hojas del árbol, o digite arboles para regresar la menú de árboles.");
                            }
                            else{
                                String input = entrada.next();
                                if(input.equalsIgnoreCase("regresar")){
                                    System.out.println("Usted ha regresar al menú principal");
                                    break menup;
                                }
                                
                                else if(input.equalsIgnoreCase("contar")){
                                    if(arbol6.raiz==null){
                                        System.out.println("ADVERTENCIA!!. No se ingresó ningún valor al árbol. ");
                                        System.out.println("Desea continuar con el árbol vacío? digite si o digite no");
                                        String respuesta = entrada.next();
                                        while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                        System.out.println("Error, opcion no valida.");
                                        System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                                        respuesta=entrada.next();
                                      }
                                      if(respuesta.equalsIgnoreCase("si")){
                                        System.out.println("El arbol está vacío.");
                                        break;
                                      }
                                      if(respuesta.equalsIgnoreCase("no")){
                                        System.out.println();
                                        System.out.println("Digite los nodos del árbol, digite regresar para regresar al menú principal, digite contar para contar las hojas del árbol, o digite arboles para regresar la menú de árboles.");
                                        break Regresararbolvacio6;
                                      }
                                    }
                                    boolean entradavalida = false;
                                    while(!entradavalida){
                                    System.out.println("En qué orden desea imprimir? Digite inorder, preorder o postorder");
                                    String input2 = entrada.next();
                                    if(input2.equalsIgnoreCase("inorder")){
                                        System.out.println("El total de número de hojas es: "+arbol6.contarHojas());
                                        System.out.println();
                                        System.out.println("El árbol es: ");
                                        arbol6.inorder(arbol6.raiz);
                                        entradavalida = true;
                                        break;
                                    }
                                    else if(input2.equalsIgnoreCase("preorder")){
                                        System.out.println("El total de número de hojas es: "+arbol6.contarHojas());
                                        System.out.println();
                                        System.out.println("El árbol es: ");
                                        arbol6.preorder(arbol6.raiz); 
                                        entradavalida = true;
                                        break;
                                    }
                                    else if(input2.equalsIgnoreCase("postorder")){
                                        System.out.println("El total de número de hojas es: "+arbol6.contarHojas());
                                        System.out.println();
                                        System.out.println("El árbol es: ");
                                        arbol6.postOrder(arbol6.raiz); 
                                        entradavalida = true;
                                        break;
                                    }
                                    else{
                                        System.out.println("Error, opción no válida.");
                                    }
                                }
                                  break;
                                    
                                }
                                else if(input.equalsIgnoreCase("arboles")){
                                System.out.println("Usted ha regresado al menú de árboles.");
                                break arbol;
                                }
                                else{
                                    System.out.println("Error, opción no válida.");
                                    System.out.println("Digite los nodos del árbol, digite salir para regresar al menu principal, digite contar para contar las hojas del árbol, o digite arboles para regresar la menú de árboles.");
                                }
                            }
                        }
                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menú principal digite regresar.");
                        System.out.println("Si desea regresar al menú de arboles digite arboles.");
                        String input10 = entrada.next();
                        
                        while(true){
                            if(input10.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input10.equalsIgnoreCase("regresar")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menú principal.");
                                break menup;
                            }
                            if(input10.equalsIgnoreCase("arboles")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menú de árboles");
                                break arbol;
                            }  else{
                                System.out.println("Error, opción no valida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menú principal digite regresar.");
                                System.out.println("Si desea regresar al menú de pilas digite pilas.");
                                input10=entrada.next();
                            }

                        }
                        //contar nodos
                        case 7: System.out.println("Digite los nodos del árbol, digite regresar para regresar al menú principal, digite contar para contar los nodos del árbol, o digite arboles para regresar la menú de árboles.");
                        arbolBinario arbol7 = new arbolBinario();
                        while(entrada.hasNext()){
                            Regresararbolvacio7:
                            if(entrada.hasNextInt()){
                                int input = entrada.nextInt();
                                arbol7.insertar(input);
                                System.out.println("Digite los nodos del árbol, digite regresar para regresar al menú principal, digite contar para contar los nodos del árbol, o digite arboles para regresar la menú de árboles.");
                            }
                            else{
                                String input = entrada.next();
                                if(input.equalsIgnoreCase("regresar")){
                                    System.out.println("Usted ha regresado al menu principal.");
                                    break menup;
                                }
                                else if(input.equalsIgnoreCase("contar")){
                                    if(arbol7.raiz==null){
                                        System.out.println("ADVERTENCIA!!. No se ingresó ningún valor al árbol. ");
                                        System.out.println("Desea continuar con el árbol vacío? digite si o digite no");
                                        String respuesta = entrada.next();
                                        while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                        System.out.println("Error, opcion no valida.");
                                        System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                                        respuesta=entrada.next();
                                      }
                                      if(respuesta.equalsIgnoreCase("si")){
                                        System.out.println("El arbol está vacío.");
                                        break;
                                      }
                                      if(respuesta.equalsIgnoreCase("no")){
                                        System.out.println();
                                        System.out.println("Digite los nodos del árbol, digite regresar para regresar al menú principal, digite contar para contar los nodos del árbol, o digite arboles para regresar la menú de árboles.");
                                        break Regresararbolvacio7;
                                      }
                                    }
                                    boolean entradavalida = false;
                                    while(!entradavalida){
                                    System.out.println("En qué orden desea imprimir? Digite inorder, preorder o postorder");
                                    String input2 = entrada.next();
                                    if(input2.equalsIgnoreCase("inorder")){
                                        System.out.println("El total de número de nodos del árbol es: "+arbol7.contarNodos());
                                        System.out.println();
                                        System.out.println("El árbol es: ");
                                        arbol7.inorder(arbol7.raiz);
                                        entradavalida = true;
                                        break;
                                    }
                                    else if(input2.equalsIgnoreCase("preorder")){
                                        System.out.println("El total de número de hojas es: "+arbol7.contarNodos());
                                        System.out.println();
                                        System.out.println("El árbol es: ");
                                        arbol7.preorder(arbol7.raiz); 
                                        entradavalida = true;
                                        break;
                                    }
                                    else if(input2.equalsIgnoreCase("postorder")){
                                        System.out.println("El total de número de hojas es: "+arbol7.contarNodos());
                                        System.out.println();
                                        System.out.println("El árbol es: ");
                                        arbol7.postOrder(arbol7.raiz); 
                                        entradavalida = true;
                                        break;
                                    }
                                    else{
                                        System.out.println("Error, opción no válida.");
                                    }
                                }
                                  break;
                                }
                                else if(input.equalsIgnoreCase("arboles")){
                                    System.out.println("Usted ha regresado al menú de árboles.");
                                    break arbol;
                                }
                            }
                        }

                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menú principal digite regresar.");
                        System.out.println("Si desea regresar al menú de arboles digite arboles.");
                        String input11 = entrada.next();
                        
                        while(true){
                            if(input11.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input11.equalsIgnoreCase("regresar")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menú principal.");
                                break menup;
                            }
                            if(input11.equalsIgnoreCase("arboles")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menú de árboles");
                                break arbol;
                            }  else{
                                System.out.println("Error, opción no valida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menú principal digite regresar.");
                                System.out.println("Si desea regresar al menú de pilas digite pilas.");
                                input11=entrada.next();
                            }

                        }
                        //altura del arbol
                        case 8: System.out.println("Digite los nodos del árbol, digite regresar para regresar al menú principal, digite altura para saber la altura del árbol, o digite arboles para regresar la menú de árboles.");
                        arbolBinario arbol8 = new arbolBinario();
                        while(entrada.hasNext()){
                            Regresararbolvacio8:
                            if(entrada.hasNextInt()){
                                int input = entrada.nextInt();
                                arbol8.insertar(input);
                                System.out.println("Digite los nodos del árbol, digite regresar para regresar al menú principal, digite altura para saber la altura del árbol, o digite arboles para regresar la menú de árboles.");
                            }
                            else{
                                String input = entrada.next();
                                if(input.equalsIgnoreCase("regresar")){
                                    System.out.println("usted ha regresadso al menú principal.");
                                    break menup;
                                }
                                else if(input.equalsIgnoreCase("altura")){
                                    if(arbol8.raiz==null){
                                        System.out.println("ADVERTENCIA!!. No se ingresó ningún valor al árbol. ");
                                        System.out.println("Desea continuar con el árbol vacío? digite si o digite no");
                                        String respuesta = entrada.next();
                                        while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                        System.out.println("Error, opcion no valida.");
                                        System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                                        respuesta=entrada.next();
                                      }
                                      if(respuesta.equalsIgnoreCase("si")){
                                        System.out.println("El arbol está vacío.");
                                        break;
                                      }
                                      if(respuesta.equalsIgnoreCase("no")){
                                        System.out.println();
                                        System.out.println("Digite los nodos del árbol, digite regresar para regresar al menú principal, digite altura para saber la altura del árbol, o digite arboles para regresar la menú de árboles.");
                                        break Regresararbolvacio8;
                                      }
                                    }
                                    boolean entradavalida = false;
                                    while(!entradavalida){
                                    System.out.println("En qué orden desea imprimir? Digite inorder, preorder o postorder");
                                    String input2 = entrada.next();
                                    if(input2.equalsIgnoreCase("inorder")){
                                        System.out.println("La altura del arbol es: "+ arbol8.alturaArbol(arbol8.raiz));
                                        System.out.println();
                                        System.out.println("El árbol es: ");
                                        arbol8.inorder(arbol8.raiz);
                                        entradavalida = true;
                                        break;
                                    }
                                    else if(input2.equalsIgnoreCase("preorder")){
                                        System.out.println("La altura del arbol es: "+ arbol8.alturaArbol(arbol8.raiz));
                                        System.out.println();
                                        System.out.println("El árbol es: ");
                                        arbol8.preorder(arbol8.raiz); 
                                        entradavalida = true;
                                        break;
                                    }
                                    else if(input2.equalsIgnoreCase("postorder")){
                                        System.out.println("La altura del arbol es: "+ arbol8.alturaArbol(arbol8.raiz));
                                        System.out.println();
                                        System.out.println("El árbol es: ");
                                        arbol8.postOrder(arbol8.raiz); 
                                        entradavalida = true;
                                        break;
                                    }
                                    else{
                                        System.out.println("Error, opción no válida.");
                                    }
                                }
                                  break;
                                }
                                else if (input.equalsIgnoreCase("arboles")){
                                    System.out.println("Usted ha regresado al menú de árboles");
                                    break arbol;
                                }
                            }
                        }

                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menú principal digite regresar.");
                        System.out.println("Si desea regresar al menú de arboles digite arboles.");
                        String input12 = entrada.next();
                        
                        while(true){
                            if(input12.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input12.equalsIgnoreCase("regresar")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menú principal.");
                                break menup;
                            }
                            if(input12.equalsIgnoreCase("arboles")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menú de árboles");
                                break arbol;
                            }  else{
                                System.out.println("Error, opción no valida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menú principal digite regresar.");
                                System.out.println("Si desea regresar al menú de pilas digite pilas.");
                                input12=entrada.next();                            }

                        }
                           //valor menor
                        case 9: System.out.println("Digite los nodos del árbol, digite menor para saber el valor mayor del árbol, digite regresar para regresar la menú principal, o digite arboles para regresar la menú de árboles.");
                        arbolBinario arbol9= new arbolBinario();
                        while(entrada.hasNext()){
                            Regresararbolvacio9:
                            if(entrada.hasNextInt()){
                            int input = entrada.nextInt();
                            arbol9.insertar(input);
                            System.out.println("Digite los nodos del árbol, digite menor para saber el valor mayor del árbol, digite regresar para regresar la menú principal, o digite arboles para regresar la menú de árboles.");
                            }
                            else{
                                String input = entrada.next();
                                if(input.equalsIgnoreCase("salir")){
                                    System.out.println("Usted ha regresado al menú principal");
                                    break menup;
                                }
                                else if(input.equalsIgnoreCase("menor")){
                                    if(arbol9.raiz==null){
                                        System.out.println("ADVERTENCIA!!. No se ingresó ningún valor al árbol. ");
                                        System.out.println("Desea continuar con el árbol vacío? digite si o digite no");
                                        String respuesta = entrada.next();
                                        while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                        System.out.println("Error, opcion no valida.");
                                        System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                                        respuesta=entrada.next();
                                      }
                                      if(respuesta.equalsIgnoreCase("si")){
                                        System.out.println("El arbol está vacío.");
                                        break;
                                      }
                                      if(respuesta.equalsIgnoreCase("no")){
                                        System.out.println();
                                        System.out.println("Digite los nodos del árbol, digite menor para saber el valor mayor del árbol, digite regresar para regresar la menú principal, o digite arboles para regresar la menú de árboles.");
                                        break Regresararbolvacio9;
                                      }
                                    }
                                    boolean entradavalida = false;
                                    while(!entradavalida){
                                    System.out.println("En qué orden desea imprimir? Digite inorder, preorder o postorder");
                                    String input2 = entrada.next();
                                    if(input2.equalsIgnoreCase("inorder")){
                                        System.out.println("El valor menor del árbol es: "+ arbol9.valorMenor(arbol9.raiz));
                                        System.out.println();
                                        System.out.println("El árbol es: ");
                                        arbol9.inorder(arbol9.raiz);
                                        entradavalida = true;
                                        break;
                                    }
                                    else if(input2.equalsIgnoreCase("preorder")){
                                        System.out.println("El valor menor es: "+ arbol9.valorMenor(arbol9.raiz));
                                        System.out.println();
                                        System.out.println("El árbol es: ");
                                        arbol9.preorder(arbol9.raiz); 
                                        entradavalida = true;
                                        break;
                                    }
                                    else if(input2.equalsIgnoreCase("postorder")){
                                        System.out.println("El valor menor es: "+ arbol9.valorMenor(arbol9.raiz));
                                        System.out.println();
                                        System.out.println("El árbol es: ");
                                        arbol9.postOrder(arbol9.raiz); 
                                        entradavalida = true;
                                        break;
                                    }else{
                                        System.out.println("Error, opción no válida");

                                    }
                                    break;
                                }
                            }
                            else if(input.equalsIgnoreCase("arboles")){
                                System.out.println();
                                System.out.println("usted ha regresado la menú de árboles");
                                break arbol;
                            }
                            break;
                        }      
                       
                    }
                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menú principal digite regresar.");
                        System.out.println("Si desea regresar al menú de arboles digite arboles.");
                        String input13 = entrada.next();
                       
                        while(true){
                            if(input13.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input13.equalsIgnoreCase("regresar")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menú principal.");
                                break menup;
                            }
                            if(input13.equalsIgnoreCase("arboles")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menú de árboles");
                                break arbol;
                            }  else{
                                System.out.println("Error, opción no valida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menú principal digite regresar.");
                                System.out.println("Si desea regresar al menú de pilas digite pilas.");
                                input13=entrada.next();
                            }

                        }
                        case 10: System.out.println("Digite los nodos del árbol, digite mayor para saber el valor mayor del árbol,digite regresar al menú principal, o digite arboles para regresar la menú de árboles.");
                        arbolBinario arbol10= new arbolBinario();
                        while(entrada.hasNext()){
                            Regresararbolvacio10:
                            if(entrada.hasNextInt()){
                            int input = entrada.nextInt();
                            arbol10.insertar(input);
                            System.out.println("Digite los nodos del árbol, digite mayor para saber el valor mayor del árbol, digite regresar al menú principal, o digite arboles para regresar la menú de árboles.");
                            }
                            else{
                                String input = entrada.next();
                                if(input.equalsIgnoreCase("regresar")){
                                    System.out.println("Usted ha regresado la menú principal.");
                                    break menup;
                                }
                                else if(input.equalsIgnoreCase("mayor")){
                                    if(arbol10.raiz==null){
                                        System.out.println("ADVERTENCIA!!. No se ingresó ningún valor al árbol. ");
                                        System.out.println("Desea continuar con el árbol vacío? digite si o digite no");
                                        String respuesta = entrada.next();
                                        while(!respuesta.equalsIgnoreCase("si" ) && !respuesta.equalsIgnoreCase("no")){
                                        System.out.println("Error, opcion no valida.");
                                        System.out.println("Desea continuar con la lista vacia? digite si o digite no");
                                        respuesta=entrada.next();
                                      }
                                      if(respuesta.equalsIgnoreCase("si")){
                                        System.out.println("El arbol está vacío.");
                                        break;
                                      }
                                      if(respuesta.equalsIgnoreCase("no")){
                                        System.out.println();
                                        System.out.println("Digite los nodos del árbol, digite mayor para saber el valor mayor del árbol, digite regresar al menú principal, o digite arboles para regresar la menú de árboles.");
                                        break Regresararbolvacio10;
                                      }
                                    }
                                    boolean entradavalida = false;
                                    while(!entradavalida){
                                    System.out.println("En qué orden desea imprimir? Digite inorder, preorder o postorder");
                                    String input2 = entrada.next();
                                    if(input2.equalsIgnoreCase("inorder")){
                                        System.out.println("El valor mayor del árbol es: "+ arbol10.valorMayor(arbol10.raiz));
                                        System.out.println();
                                        System.out.println("El árbol es: ");
                                        arbol10.inorder(arbol10.raiz);
                                        entradavalida = true;
                                        break;
                                    }
                                    else if(input2.equalsIgnoreCase("preorder")){
                                        System.out.println("El valor menor es: "+ arbol10.valorMayor(arbol10.raiz));
                                        System.out.println();
                                        System.out.println("El árbol es: ");
                                        arbol10.preorder(arbol10.raiz); 
                                        entradavalida = true;
                                        break;
                                    }
                                    else if(input2.equalsIgnoreCase("postorder")){
                                        System.out.println("El valor menor es: "+ arbol10.valorMayor(arbol10.raiz));
                                        System.out.println();
                                        System.out.println("El árbol es: ");
                                        arbol10.postOrder(arbol10.raiz); 
                                        entradavalida = true;
                                        break;
                                    }else{
                                        System.out.println("Error, opción no válida");

                                    }
                                    break;
                                }
                                }
                                else if(input.equalsIgnoreCase("arboles")){
                                    System.out.println();
                                    System.out.println("Usted ha regresado al menú de árboles.");
                                    break arbol;
                                }
                                else{
                                    System.out.println("Error, opción no válida.");
                                    System.out.println("Digite los nodos del árbol, digite mayor para saber el valor mayor del árbol, o digite arboles para regresar la menú de árboles.");
                                }
                                break;
                            }
                        }

                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menú principal digite regresar.");
                        System.out.println("Si desea regresar al menú de arboles digite arboles.");
                        String input14 = entrada.next();
                        
                        while(true){
                            if(input14.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input14.equalsIgnoreCase("regresar")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menú principal.");
                                break menup;
                            }
                            if(input14.equalsIgnoreCase("arboles")){
                                System.out.println();
                                System.out.println("Usted ha regresado al menú de árboles");
                                break arbol;
                            }  else{
                                System.out.println("Error, opción no valida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menú principal digite regresar.");
                                System.out.println("Si desea regresar al menú de pilas digite pilas.");
                                input14=entrada.next();
                            }

                        }
                        case 11: System.out.println("Usted ha regresado le menú principal.");
                        break menup;

        }// switch op de menu de arboles
    } // while (true) de menu de arboles.
            case 5: System.out.println("Usted ha salido del programa");
            return;
            
            default: System.out.println("ERROR, esa opción no es válida");
        }
    }
}
}