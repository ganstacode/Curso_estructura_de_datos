public class Main {

    public static void main(String[] args) {
        Clase_2_listas_enlazadas lista= new Clase_2_listas_enlazadas();
            //El ultimo valor que es 89 es el primero que se va a imprimir 
            lista.InsertarAlInicio( 20);
            lista.InsertarAlInicio( 34);
            lista.InsertarAlInicio( 89);
    
            lista.insertarAlFinal(13);
    
            lista.InsetarEnPosicion(2, 25);
    
            lista.mostrarNodox();
            System.out.println();
            System.out.println(lista.contarNodos());
            
    
            lista.eliminarAlInicio();
            System.out.println();
            System.out.println(lista.contarNodos());
            lista.mostrarNodox();

            lista.Eliminaralfinal();

            System.out.println();
            System.out.println(lista.contarNodos());
            lista.mostrarNodox();

       
    }

}
