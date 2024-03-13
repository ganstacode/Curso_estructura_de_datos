public class Clase_2_listas_enlazadas {

    private Nodox head=null; // null es CABEZA
    private int Longitud=0;//Para ver la longitud del nodo
    //public String contarNodos;

    //Clase interna llamada nodo
    public class Nodox{
        public int data; //dato
        public Nodox next;//Es el enlace al siguiente nodo -puntero-

        Nodox (int valor){
            data=valor;
            next=null;
        }
    }
    public boolean isEmptyList(){
        return head== null;
    }
    public int contarNodos(){
        return Longitud; //retornar el valor de tipo entero
    }

    public void mostrarNodox(){//El VOID se utiliza para que no regrese NADA
        Nodox current=head; //Para posicionar al inicio de la lista
        int contador=0;
        while (current !=null) {//MIENTRAS QUE CURREN SEA DIFERENTE A NULL LOS VA A MOSTRAR
            System.out.println("El elemento "+ (contador+1)+" del nodo es "+current.data);
            current= current.next; //ACTUALIZA LOS DATOS DE CURRENT
            contador++;
        }
    }

    public void InsertarAlInicio(int valor){// VOID para que no retorne datos
        //Para insertar un nodo al inicio 
        Nodox nodox= new Nodox(valor);
        //Apuntar el puntero del nodo creado
        nodox.next=head;
        //A la cabeza se...
        head= nodox;
        Longitud++;
   }


   //SEGUNDAAAA PARTE
   public void insertarAlFinal(int valor){
    Nodox nodox= new Nodox(valor);
    if (isEmptyList()) {//head==null
        head=nodox;
    }
    else{
        Nodox puntero= head;
        while (puntero.next != null) {//SI PUNTERO ES IGUAL A NULL LOS VA IR RECORRIENDO
            puntero = puntero.next;
        }
        puntero.next= nodox;
    }
    Longitud++;
   }

   //Insertar cierto nodo.

   public int obtenernodo(int posicion){
     
   }

   //TERCERA PARTEE
   public void InsetarEnPosicion (int posicion, int valor){
    Nodox nodox= new Nodox(valor);
    if (isEmptyList()) {
        head=nodox;
    }
    else{
        Nodox puntero= head;
        int contador=0;
        while (contador<posicion && puntero.next!=null) {
            puntero= puntero.next;
            contador++;
        }
        nodox.next=puntero.next;
        puntero.next= nodox;
    }
    Longitud++;
   }

   /*public int contarNodos(){
    int contador=0;
    Nodox nodox=head;
    while ((nodox !=null)) {
        contador++;
        nodox= nodox.next;
        
    }
    return contador;
   }*/
   //ELIMINAR AL INICIO
   public void eliminarAlInicio(){
    if (!isEmptyList()) {// ! es negacion
        Nodox first= head; //Por va eliminar al inicio
        head= head.next;//Ahora la cabeza ñtiene que apuntar al siguiente
        first.next= null;// Ahora no esta apuntando a nada
        Longitud--;
}
}

public void Eliminaralfinal(){

    if(!isEmptyList()){

        if(head.next==null){
            Longitud--;
        }

        else{
            Nodox Puntero=head;
            while(Puntero.next.next !=null){

             Puntero = Puntero.next;

            }
            Puntero.next=null;
            Longitud--;
        }

    }
}

public void eliminarNodo(int posicion){
    if(isEmptyList()){
        if(posicion==0){
         Nodox primero=head;
         int contador=0;
         
         }else if(posicion<Longitud){
            Nodox puntero = head;
            int contador =0;
            while(contador<(posicion-1)){
                puntero = puntero.next;
                contador++;
         }
         Nodox temp = puntero.next;
         puntero.next=temp.next;
         Longitud--;
        }
    }
}  

}
