import java.util.Scanner;

public class Main {

public static void main (String []args){
    Scanner entrada = new Scanner(System.in);
    int op=0,op2=0;
    
    while (true){
        System.out.println("Bienvenido al menu principal");
        System.out.println("Digite 1 si desea ir al menu de listas");
        System.out.println("Digite 2 si desea ir al menu de colas.");
        System.out.println("Digite 3 si desea ir al menu pilas");
        System.out.println("Digite 4 para salir del programa.");
        int opm=entrada.nextInt();
        
        menup:
        switch (opm){
                                               //Listas
            case 1: System.out.println("Usted esta en el menu de listas");
            while (true){
                System.out.println("Digite 1 para insertar");
                System.out.println("Digite 2 para eliminar ");
                System.out.println("Digite 3 para obtener nodo ");
                System.out.println("Digite 4 para eliminar nodo");
                System.out.println("Digite 5 para regresa al menu");
                op = entrada.nextInt();
                while(op>5){
                System.out.println("Error, opcion no valida.");
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
                    case 1: System.out.println("Digite una opción:");
                    System.out.println("1. Insertar al inicio.");
                    System.out.println("2. Insertar al final.");
                    System.out.println("3. Insertar en una posición.");
                    System.out.println("4. Regresar al menu de listas.");
                    System.out.println("5. Regresar al menu principal.");
                    Listas lista = new Listas ();
                    op2 = entrada.nextInt();
                    while(op2>5){
                    System.out.println("Error, opcion no valida.");
                    System.out.println("Digite una opción:");
                    System.out.println("1. Insertar al inicio.");
                    System.out.println("2. Insertar al final.");
                    System.out.println("3. Insertar en una posición.");
                    System.out.println("4. Regresar al menu de listas.");
                    System.out.println("5. Regresar al menu principal.");
                    op=entrada.nextInt();
                    }
                    bucle3:
                    switch(op2){
                        //insertar al inicio.
                        case 1: System.out.println("Digite un valor entero, oprima 'salir' para volver al menú principal, u digite mostrar para ver la lista...");
                        while (entrada.hasNext()){
                        if(entrada.hasNextInt()){
                            int input = entrada.nextInt();
                            lista.Insertaralinicio(input);
                            System.out.println("Digite otro valor entero, oprima 'salir' para volver al menú principal, u digite mostrar para ver la lista...");  
                        } else{
                            String input = entrada.next();

                            if(input.equalsIgnoreCase("salir")){
                                System.out.println("Usted ha regresado al menu principal");
                                break menup;
                            }
                            
                            if(input.equalsIgnoreCase("mostrar")){
                                System.out.println("La lista es: ");
                                lista.mostrarNodos();
                                break;
                            }
                           else{
                           System.out.println("Error, opcion invalida."); 
                            System.out.println("Digite un valor entero, oprima 'salir' para volver al menú principal, u oprima mostrar para ver la lista...");
                           }
                            
                        }
                        }

                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menu principal digite regresar.");
                        System.out.println("Si desea regresar al menu de listas digite listas.");
                       
                        bucle2:
                        while(true){
                            String input = entrada.next();
                            if(input.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input.equalsIgnoreCase("regresar")){
                                System.out.println("Usted ha regresado al menu principal.");
                                break menup;
                            }
                            if(input.equalsIgnoreCase("listas")){
                                System.out.println("Usted ha regresado al menu de listas");
                                break;
                            }
                            else{
                                System.out.println("Error, opcion invalida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menu principal digite regresar.");
                        System.out.println("Si desea regresar al menu de listas digite listas.");
                        
                            }
                            
                        }
                        break;
                        //insertar al final.
                        case 2: System.out.println("Digite un valor entero, oprima 'salir' para volver al menú principal, u oprima mostrar nodos para ver la lista...");
                        while(entrada.hasNext()){
                            if(entrada.hasNextInt()){
                                int input2 = entrada.nextInt();
                                lista.Insertaralfinal(input2);
                                System.out.println("Digite otro valor entero, oprima 'salir' para volver al menú principal, u oprima mostrar para ver la lista...");
                            }else{
                                String input2 = entrada.next();

                                if(input2.equalsIgnoreCase("salir")){
                                    System.out.println("Usted ha regresado al menu principal");
                                    break menup;
                                }

                                if(input2.equalsIgnoreCase("mostrar")){
                                    System.out.println("La lista es: ");
                                    lista.mostrarNodos();
                                    break;
                                }
                                else{
                                     System.out.println("Error, opcion no valida.");
                                System.out.println("Digite otro valor entero, oprima 'salir' para volver al menú principal, u oprima mostrar para ver la lista...");  
                                }
                            }
                        }
                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menu principal digite regresar.");
                        System.out.println("Si desea regresar al menu de listas digite listas.");
                        
                        bucle2:
                        while(true){
                            String input2 = entrada.next();
                            if(input2.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input2.equalsIgnoreCase("regresar")){
                                System.out.println("Usted ha regresado al menu principal.");
                                break menup;
                            }
                            if(input2.equalsIgnoreCase("listas")){
                                System.out.println("Usted ha regresado al menu de listas");
                                break;
                            } else {
                                System.out.println("Error, opcion invalida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menu principal digite regresar.");
                                System.out.println("Si desea regresar al menu de listas digite listas.");
                        
                            }

                        }
                         break;
                         //insertar en posicion.
                        case 3: System.out.println("Digite un valor entero, digite salir, o digite posicion para digitar la posicion");
                         while (entrada.hasNext()){
                            if(entrada.hasNextInt()){
                                int input3=entrada.nextInt();
                                lista.Insertaralfinal(input3);
                                System.out.println("Digite un valor entero, digite salir, o digite posicion para digitar la posicion");
                            }else{
                                String input3=entrada.next();
                                if(input3.equalsIgnoreCase("salir")){
                                 System.out.println("usted ha regresado al menu principal'");
                                 break menup;
                                }
                                if(input3.equalsIgnoreCase("posicion")){
                                    System.out.println("Digite la posicion: ");
                                    while (!entrada.hasNextInt()) {
                                        System.out.println("Error: La posición debe ser un número entero.");
                                        System.out.println("Digite la posicion: ");
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
                                else{
                                    System.out.println("Error, opcion no valida.");
                                    System.out.println("Digite un valor entero, digite salir, o digite posicion para digitar la posicion");
                                }

                            }
                         }

                         System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menu principal digite regresar.");
                        System.out.println("Si desea regresar al menu de listas digite listas.");
                        bucle2:
                        while(true){
                            String input3 = entrada.next();
                            if(input3.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input3.equalsIgnoreCase("regresar")){
                                System.out.println("Usted ha regresado al menu principal.");
                                break menup;
                            }
                            if(input3.equalsIgnoreCase("listas")){
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

                        case 4: System.out.println("Usted ha regresado al menu de listas");
                        break;
                        case 5: System.out.println("Usted ha regresado al menu principal.");
                        break menup;
                    }

                    break;
                    //menu eliminar
                    case 2: System.out.println("Digite 1 para eliminar al inicio.");
                    System.out.println("Digite 2 para eliminar al final.");
                    System.out.println("Digite 3 para eliminar en posicion."); 
                    System.out.println("Digite 4 para salir al menu de listas");
                    System.out.println("Digite 5 para salir al menu de principal");
                     Listas lista2 = new Listas ();
                     op2=entrada.nextInt();
                     while(op2>5){

                        System.out.println("Error, opcion no valida.");
                        System.out.println("Digite 1 para eliminar al inicio.");
                        System.out.println("Digite 2 para eliminar al final.");
                        System.out.println("Digite 3 para eliminar en posicion."); 
                        System.out.println("Digite 4 para salir al menu de listas");
                        System.out.println("Digite 5 para salir al menu de principal");
                        op2=entrada.nextInt();
                    }
                    
                     switch (op2){//switch para eliminar listas.
                        //eliminar al inicio.
                        case 1: System.out.println("Digite un valor entero, digite salir, o digite mostrar para ver la lista");
                        while(entrada.hasNext()){
                            if(entrada.hasNextInt()){
                                int input =entrada.nextInt();
                                lista2.Insertaralinicio(input);
                                System.out.println("Digite un valor entero, digite salir, o digite mostrar para ver la lista");
                            } else{
                                String input = entrada.next();
                                if(input.equalsIgnoreCase("salir")){
                                    System.out.println("Usted ha regresado al menu principal.");
                                    break menup;
                                }
                                if(input.equalsIgnoreCase("mostrar")){
                                    System.out.println("La lista es: \n");
                                    lista2.Eliminaralinicio();
                                    System.out.println("Los nodos restantes son: " +lista2.contarNodos());
                                    lista2.mostrarNodos();
                                    break;
                                }
                                else{
                                    System.out.println("Error, opcion no valida.");
                                    System.out.println("Digite un valor entero, digite salir, o digite mostrar para ver la lista");
                                }
                            }
                        }
                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menu principal digite regresar.");
                        System.out.println("Si desea regresar al menu de listas digite listas.");
                        
                        bucle2:
                        while(true){
                            String input3 = entrada.next();
                            if(input3.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input3.equalsIgnoreCase("regresar")){
                                System.out.println("Usted ha regresado al menu principal.");
                                break menup;
                            }
                            if(input3.equalsIgnoreCase("listas")){
                                System.out.println("Usted ha regresado al menu de listas");
                                break;
                            }  else{
                                System.out.println("Error, opcion no valida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menu principal digite regresar.");
                                System.out.println("Si desea regresar al menu de listas digite listas.");
                            }

                        }
                        break;
                        //eliminar al final.
                        case 2: System.out.println("Digite un valor entero, digite salir, o digite mostrar para ver la lista");
                        while(entrada.hasNext()){
                            if(entrada.hasNextInt()){
                                int input =entrada.nextInt();
                                lista2.Insertaralfinal(input);
                                System.out.println("Digite un valor entero, digite salir, o digite mostrar para ver la lista");
                            }else{
                                String input =entrada.next();
                                if(input.equalsIgnoreCase("salir")){
                                    System.out.println("Usted ha regresado al menu principal.");
                                    break menup;
                                }
                                if(input.equalsIgnoreCase("mostrar")){
                                    System.out.println("La lista es: ");
                                    lista2.Eliminaralfinal();
                                    System.out.println("Los nodos restantes son: "+lista2.contarNodos());
                                    lista2.mostrarNodos();
                                    break;

                                }
                                else{
                                    System.out.println("Error, opcion no valida.");
                                    System.out.println("Digite un valor entero, digite salir, o digite mostrar para ver la lista");
                                }
                            }
                        }
                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menu principal digite regresar.");
                        System.out.println("Si desea regresar al menu de listas digite listas.");
                        
                        bucle2:
                        while(true){
                            String input4 = entrada.next();
                            if(input4.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salirdo del programa...");
                                return;
                            }
                            if(input4.equalsIgnoreCase("regresar")){
                                System.out.println("Usted ha regrresado al menu principal.");
                                break menup;
                            }
                            if(input4.equalsIgnoreCase("listas")){
                                System.out.println("Usted ha regrsado al menu de listas");
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
                        //Eliminar en posicion
                        case 3: System.out.println("Digite un valor de tipo entrero, digite salir, o digite posicion para seguir con la posicion");
                        while (entrada.hasNext()){
                            if (entrada.hasNextInt()){
                                int input = entrada.nextInt();
                                lista2.Insertaralfinal(input);
                                System.out.println("Digite un valor de tipo entrero, digite salir, o digite posicion para seguir con la posicion");
                            }
                            else{
                                String input = entrada.next();
                                if(input.equalsIgnoreCase("salir")){
                                    System.out.println("Usted regresado al menu principal.");
                                    break menup;
                                }
                                if(input.equalsIgnoreCase("posicion")){
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
                                else{
                                    System.out.println("Error, opcion no valida.");
                                    System.out.println("Digite un valor de tipo entrero, digite salir, o digite posicion para seguir con la posicion");
                                }
                            }
                        }

                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menu principal digite regresar.");
                        System.out.println("Si desea regresar al menu de listas digite listas.");
                        bucle2:
                        while(true){
                            String input5 = entrada.next();
                            if(input5.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input5.equalsIgnoreCase("regresar")){
                                System.out.println("Usted ha regresado al menu principal.");
                                break menup;
                            }
                            if(input5.equalsIgnoreCase("listas")){
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

                        case 4: System.out.println("Usted ha salido al menu de listas");
                        break;
                        case 5: System.out.println("Usted ha regresado al menu principal.");
                        break menup;

                     }
                     break;
                     //obtener nodo
                     case 3: System.out.println("Digite un valor entero, digite salir para regresar al menu principal, o digite nodo para pasar a mostrar un nodo especifico: ");
                     Listas lista3 = new Listas ();
                     while(entrada.hasNext()){
                        if(entrada.hasNextInt()){
                            int input = entrada.nextInt();
                            lista3.Insertaralfinal(input);
                            System.out.println("Digite un valor entero, digite salir para regresar al menu principal, o digite nodo para pasar a mostrar un nodo especifico: ");
                        } else{
                            String input = entrada.next();
                            if(input.equalsIgnoreCase("salir")){
                                System.out.println("Usted ha regresado al menu principal.");
                                break menup;
                            }
                            if(input.equalsIgnoreCase("nodo")){

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
                            else{
                                System.out.println("Error, opcion no valida.");
                                System.out.println("Digite un valor entero, digite salir para regresar al menu principal, o digite siguiente para pasar a mostrar un nodo especifico: ");

                            }
                        }
                     }

                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menu principal digite regresar.");
                        System.out.println("Si desea regresar al menu de listas digite listas.");
                        
                        bucle2:
                        while(true){
                            String input3 = entrada.next();
                            if(input3.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input3.equalsIgnoreCase("regresar")){
                                System.out.println("Usted ha regresado al menu principal.");
                                break menup;
                            }
                            if(input3.equalsIgnoreCase("listas")){
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
                         //eliminar nodo.
                         case 4: System.out.println("Digite un valor de tipo entero, digite salir para regresar al menu principal, o digite eliminar para eliminar un nodo especifico.");
                         Listas lista4 = new Listas ();
                         while(entrada.hasNext()){
                            if(entrada.hasNextInt()){
                                int input = entrada.nextInt();
                                lista4.Insertaralfinal(input);
                                System.out.println("Digite un valor de tipo entero, digite salir para regresar al menu principal, o digite eliminar para eliminar un nodo especifico.");
                            }else{
                                String input = entrada.next();
                                if(input.equalsIgnoreCase("salir")){
                                    System.out.println("Usted ha regresado al menu principal.");
                                    break menup;
                                }
                                if(input.equalsIgnoreCase("eliminar")){
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
                                else{
                                    System.out.println("Error, opcion no valida.");
                                    System.out.println("Digite un valor de tipo entero, digite salir para regresar al menu principal, o digite eliminar para eliminar un nodo especifico.");
                                }
                            }
                         }

                         System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menu principal digite regresar.");
                        System.out.println("Si desea regresar al menu de listas digite listas.");
                        String input5 = entrada.next();
                        bucle2:
                        while(true){
                            if(input5.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input5.equalsIgnoreCase("regresar")){
                                System.out.println("Usted ha regresado al menu principal.");
                                break menup;
                            }
                            if(input5.equalsIgnoreCase("listas")){
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
            case 2: System.out.println("Usted esta en el menu de colas");
            
            while (true){
                System.out.println("Digite 1 para insertar cola.\nDigite 2 para eliminar cola.\nDigite 3 para obtener siguiente pedido.\nDigite 4 para regresar al menu principal.");
                op = entrada.nextInt();
                colas:
                switch (op){
                    //agregar cola.
                    case 1: System.out.println("Digite el numero de pedido y nombre del cliente, digite salir para regresar al menu principal, o digite mostrar para mostrar la cola.");
                    System.out.println("Digite el numero de pedido: ");
                    while(!entrada.hasNextInt()){
                        System.out.println("Error, el numero del pedido debe ser un numero entero.");
                        System.out.println("Digite el numero de pedido: ");
                        entrada.next();
                    }
                    colas cola = new colas ();
                    while(entrada.hasNext()){
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
                            System.out.println("Digite el numero de pedido y nombre del cliente, digite salir para regresar al menu principal, o digite obtener para mostrar la cola.");
                            System.out.println("Digite el numero de pedido: ");
                        }else{
                            String input = entrada.next();
                            if(input.equalsIgnoreCase("salir")){
                                System.out.println("Usted ha regresado al menu principal: ");
                                break menup;
                            }
                            if(input.equalsIgnoreCase("obtener")){
                                System.out.println("La lista es: ");
                                cola.obtener();
                                break;
                            }
                            else{
                                System.out.println("Error, opcion no valida.");
                                System.out.println("Digite el numero de pedido y nombre del cliente, digite salir para regresar al menu principal, o digite obtener para mostrar la cola.");
                                System.out.println("Digite el numero de pedido: ");

                            }
                        }
                    }

                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menu principal digite regresar.");
                        System.out.println("Si desea regresar al menu de colas digite colas.");
                        
                        bucle2:
                        while(true){
                            String input1 = entrada.next();
                            if(input1.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input1.equalsIgnoreCase("regresar")){
                                System.out.println("Usted ha regresado al menu principal.");
                                break menup;
                            }
                            if(input1.equalsIgnoreCase("colas")){
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
                        case 2: System.out.println("Digite un dato de tipo entero, digite salir, o digite mostrar cola para mostrar cola. ");
                                System.out.println("Digite el numero de pedido: ");
                                while(!entrada.hasNextInt()){
                                System.out.println("Error: el numero de pedido debe ser de tipo entero. ");
                                System.out.println("Digite el numero de pedido: ");
                                entrada.next();
                                }
                                colas cola2 = new colas ();
                                while(entrada.hasNext()){
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
                                        System.out.println("Digite un dato de tipo entero, digite salir, o digite eliminar para eliminar la cola. ");
                                System.out.println("Digite el numero de pedido: ");
                                    }
                                    else{
                                        String input = entrada.next();

                                        if(input.equalsIgnoreCase("salir")){
                                            System.out.println("Usted ha regresado al menu principal.");
                                            break menup;
                                        }
                                        if(input.equalsIgnoreCase("eliminar")){
                                            cola2.eliminar();
                                            System.out.println("El id y el cliente que elimino es: ");
                                            cola2.obtener();
                                            break;

                                        }
                                    }
                                }
                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menu principal digite regresar.");
                        System.out.println("Si desea regresar al menu de colas digite colas.");
                        
                        bucle2:
                        while(true){
                            String input2 = entrada.next();
                            if(input2.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input2.equalsIgnoreCase("regresar")){
                                System.out.println("Usted ha regresado al menu principal.");
                                break menup;
                            }
                            if(input2.equalsIgnoreCase("colas")){
                                System.out.println("Usted ha regresado al menu de colas");
                                break colas;
                            }   else{
                                System.out.println("Error, opcion no valida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menu principal digite regresar.");
                                System.out.println("Si desea regresar al menu de colas digite colas.");
                                entrada.next();
                            }

                        }
                        //saber pedido siguiente.
                        case 3: System.out.println("Digite el numero de pedidio, digite el nombre del cliente, digite salir para regresar al menu principal, o digite mostrar cola: ");
                        System.out.println("Digite el numero de pedido: ");
                        while(!entrada.hasNextInt()){
                        System.out.println("Error: el pedido debe ser un numero de tipo entero");
                        System.out.println("Digite el numero de pedido: ");
                        entrada.next();
                        }
                                colas cola3 = new colas ();
                        while(entrada.hasNext()){
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
                                System.out.println("Digite el numero de pedidio, digite el nombre del cliente, digite salir para regresar al menu principal, o digite mostrar para mostrar la cola: ");
                                System.out.println("Digite el numero de pedido: ");
                            }else{
                                String input = entrada.nextLine();
                                if(input.equalsIgnoreCase("salir")){
                                    System.out.println("Usted ha regresado la menu principal.");
                                    break menup;
                                }
                                if(input.equalsIgnoreCase("mostrar")){
                                    System.out.println("El siguiente pedido es: ");
                                    cola3.saberPedido();
                                    break;
                                }
                            }
                        }
                        System.out.println("Si desea terminar el programa digite terminar");
                        System.out.println("Si desea regresar al menu principal digite regresar.");
                        System.out.println("Si desea regresar al menu de colas digite colas.");
                        String input3 = entrada.next();
                        bucle2:
                        while(true){
                            if(input3.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input3.equalsIgnoreCase("regresar")){
                                System.out.println("Usted ha regresado al menu principal.");
                                break menup;
                            }
                            if(input3.equalsIgnoreCase("colas")){
                                System.out.println("Usted ha regresado al menu de colas");
                                break colas;
                            }  else{
                                System.out.println("Error, opcion no valida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menu principal digite regresar.");
                                System.out.println("Si desea regresar al menu de colas digite colas.");
                                entrada.next();
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
            case 3: System.out.println("Usted esta en el menu de pilas");
            while(true){
                System.out.println("Digite una opcion: \n1. Apilar pilas \n2. Desapilar N pila \n3. Destruir \n4. salir al menu principal");
                op=entrada.nextInt();
                pilas:
                switch (op) {
                    case 1://Apilar pilas
                       System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver las listas de pilas\n Digite 'salir' para regresar al menu pricipal");
                       System.out.println(" -Digite el numero del libro: ");
                       while(!entrada.hasNextInt()){
                        System.out.println("Error: el numero de pedido debe ser entero.");
                        System.out.println(" -Digite el numero del libro: ");
                        entrada.next();
                       }
                       pilas pilass= new pilas();
                       while (entrada.hasNext()) {
                        
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
                             System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver la cola\n Digite 'salir' para regresar al menu pricipal");
                             System.out.println(" -Digite el numero de libro: ");
                            }else{ 
                            String input= entrada.next();
                             if (input.equalsIgnoreCase("salir")) {
                                 System.out.println("Usted ha regresado al menu principal");
                                 break menup;  
                               }
                             if(input.equalsIgnoreCase("obtener")){
                                 System.out.println("La lista de pilas es: ");
                                 pilass.obtenerTope();
                                 break;
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
                        bucle2:
                        while(true){
                            if(input3.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input3.equalsIgnoreCase("regresar")){
                                System.out.println("Usted ha regresado al menu principal.");
                                break menup;
                            }
                            if(input3.equalsIgnoreCase("pilas")){
                                System.out.println("Usted ha regresado al menu de pilas");
                                break pilas;
                            }  else{
                                System.out.println("Error, opcion no valida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menu principal digite regresar.");
                                System.out.println("Si desea regresar al menu de pilas digite pilas.");
                                entrada.next();
                            }

                        }
                        //desapilar N pila
                        case 2: System.out.println("Digite alguna opcion: \n Digite 'desapilar' para ver las listas de pilas\n Digite 'salir' para regresar al menu pricipal");
                        System.out.println(" -Digite el numero del libro: ");
                        while(!entrada.hasNextInt()){
                            System.out.println("Error: el numero del libro debe ser entero.");
                            System.out.println(" -Digite el numero del libro: ");
                            entrada.next();
                           }

                        pilas pilas2 = new pilas();
                        while(entrada.hasNext()){
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
                                System.out.println("Digite alguna opcion: \n Digite 'desapilar' para ver las listas de pilas\n Digite 'salir' para regresar al menu pricipal");
                                System.out.println(" -Digite el numero del libro: ");
                            }else{
                                String input = entrada.next();
                                if(input.equalsIgnoreCase("salir")){
                                    System.out.println("Usted ha regresado al menu principal.");
                                    break menup;
                                }
                                if(input.equalsIgnoreCase("desapilar")){
                                    System.out.println("Digite la cantidad a desapilar: ");
                                    while(!entrada.hasNextInt()){
                                        System.out.println("Error: La cantidad debe ");
                                        System.out.println("Digite la cantidad a desapilar: ");
                                        entrada.next();
                                    }
                                    int cantidad= entrada.nextInt();
                                    System.out.println("La lista de pilas es: ");
                                    System.out.println(pilas2.length());
                                    pilas2.desapilarN(cantidad);
                                    System.out.println(pilas2.length());
                                    break;
                                }else{
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
                        bucle2:
                        while(true){
                            if(input4.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input4.equalsIgnoreCase("regresar")){
                                System.out.println("Usted ha regresado al menu principal.");
                                break menup;
                            }
                            if(input4.equalsIgnoreCase("pilas")){
                                System.out.println("Usted ha regresado al menu de pilas");
                                break pilas;
                            }  else{
                                System.out.println("Error, opcion no valida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menu principal digite regresar.");
                                System.out.println("Si desea regresar al menu de pilas digite pilas.");
                                entrada.next();
                            }

                        }

                           case 3: System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver las listas de pilas\n Digite 'salir' para regresar al menu pricipal");
                           System.out.println(" -Digite el numero del libro: ");
                           while(!entrada.hasNextInt()){
                            System.out.println("Error: El numero del libro debe ser entero.");
                            System.out.println(" -Digite el numero del libro: ");
                            entrada.next();
                           }
                           pilas pila3= new pilas (); 
                           while(entrada.hasNext()){
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
                                System.out.println("Digite alguna opcion: \n Digite 'obtener' para ver las listas de pilas\n Digite 'salir' para regresar al menu pricipal");
                                System.out.println(" -Digite el numero del libro: ");
                            }else{
                                String input = entrada.next();
                                if(input.equalsIgnoreCase("salir")){
                                    System.out.println("Usted ha regresado al menu principal.");
                                    break menup;
                                }
                                if(input.equalsIgnoreCase("obtener")){
                                    System.out.println("La lista de pilas es: ");
                                    System.out.println(pila3.length());
                                    pila3.destructor();
                                    System.out.println(pila3.length());
                                    break;

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
                        bucle2:
                        while(true){
                            if(input5.equalsIgnoreCase("terminar")){
                                System.out.println("Usted ha salido del programa...");
                                return;
                            }
                            if(input5.equalsIgnoreCase("regresar")){
                                System.out.println("Usted ha regresado al menu principal.");
                                break menup;
                            }
                            if(input5.equalsIgnoreCase("pilas")){
                                System.out.println("Usted ha regresado al menu de pilas");
                                break pilas;
                            }  else{
                                System.out.println("Error, opcion no valida.");
                                System.out.println("Si desea terminar el programa digite terminar");
                                System.out.println("Si desea regresar al menu principal digite regresar.");
                                System.out.println("Si desea regresar al menu de pilas digite pilas.");
                                entrada.next();
                            }

                        }

                    case 4: System.out.println("Usted ha regresado la menu principal.");
                    break menup;
                        
                }
                
              }
            case 4: System.out.println("Usted ha salido del programa");
            return;
            
            default: System.out.println("ERROR, esa opcion no es valida");
            break;
        }
    }
}
}