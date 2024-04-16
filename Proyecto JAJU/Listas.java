public class Listas {

    private Nodo head = null; //inicializamos la cabeza del nodo.
    private int tamaño = 0; //Tamaño del nodo.
 
    public class Nodo{
     public int dato;
     public Nodo next;
 
     Nodo (int valor){
         dato=valor;
         next=null;
     }
     
    }
 
    public boolean isEmptyList(){
 
     return head == null;
 
    }
 
    public int contarNodos(){
     return tamaño;
    }
    
    public void mostrarNodos(){
 
     Nodo Nodoactual=head;
     int contador=0;
     while(Nodoactual!=null){
 
         System.out.println("El elemento "+ (contador+1)+ "del nodo es: "+Nodoactual.dato);
         Nodoactual=Nodoactual.next;
         contador++;
     
     }
 
    }
 
    public void Insertaralinicio(int valor){
     Nodo nodo = new Nodo(valor);
     nodo.next=head;
     head=nodo;
     tamaño++;
    }
 
    public void Insertaralfinal (int valor){
     Nodo nodo = new Nodo (valor);
     if(isEmptyList()){
         head=nodo;
     }
     else{
         Nodo puntero = head;
         while (puntero.next!=null) {
             puntero=puntero.next;
         }
         puntero.next=nodo;
     }
     tamaño++;
 
    
    }
    public void Insertarenposicion (int posicion, int valor){
        Nodo nodox= new Nodo(valor);
    if (isEmptyList()) {
        head=nodox;
    }
    else{
        Nodo puntero= head;
        int contador=0;
        while (contador<posicion && puntero.next!=null) {
            puntero= puntero.next;
            contador++;
        }
        nodox.next=puntero.next;
        puntero.next= nodox;
    }
    tamaño++;
     
 }
 
 public void Eliminaralinicio(){
     if(!isEmptyList()){
      Nodo primero = head;
      head=head.next;
      primero.next=null;
      tamaño--;
     }
 }
 
 public void Eliminaralfinal(){
     if (!isEmptyList()){
         if(head.next==null){
             tamaño--;
         }
         else{
             Nodo puntero=head;
             while(puntero.next.next !=null){
                 puntero=puntero.next;
 
             }
             puntero.next=null;
             tamaño--;
         }
     }
 }
 public void Eliminarenposicion(int posicion, int valor){
 
    if(isEmptyList() || posicion < 0 || posicion >= tamaño) {
        // No se puede modificar si la lista está vacía o la posición está fuera de rango
        return;
    }
    
    Nodo puntero = head;
    int contador = 0;
    while (contador < posicion && puntero != null) {
        puntero = puntero.next;
        contador++;
    }
    if (puntero != null) {
        puntero.dato = valor;
    }
 
  }
 
  public int obtenerNodo(int posicion){//Es para mostrar cierto nodo
     if (isEmptyList()) {
      return 0;
     }else{
      Nodo puntero= head;
      int contador= 0;
      while (contador < posicion && puntero.next!=null) {
          puntero= puntero.next;
          contador++;
      }
      if (contador!=posicion) {
          return 0;
      } else{
          return puntero.dato;
      }
 }
 }
 
  
 
 public void eliminarNodo(int posicion) {
    if (isEmptyList()) {
        System.out.println("La lista está vacía. No se puede eliminar ningún nodo.");
        return;
    }

    if (posicion == 0) {
        head = head.next;
        tamaño--;
        return;
    }

    if (posicion < tamaño) {
        Nodo puntero = head;
        int contador = 0;
        while (contador < (posicion - 1)) {
            puntero = puntero.next;
            contador++;
        }
        Nodo nodoAEliminar = puntero.next;
        puntero.next = nodoAEliminar.next;
        tamaño--;
    } else {
        System.out.println("La posición especificada está fuera de los límites de la lista.");
    }
}
 public void mostrarNodoEnPosicion(int posicion) {
    int valorNodo = obtenerNodo(posicion);
    if (valorNodo != 0) {
        System.out.println("El elemento en la posición " + posicion + " del nodo es: " + valorNodo);
    } else {
        System.out.println("La posición especificada no es válida.");
    }
}
}
