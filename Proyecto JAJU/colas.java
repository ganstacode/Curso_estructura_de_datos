public class colas {
    private nodoPedido cabeza,cola;//se declaran 2 variables de tipo nodoPedido no estan incicializadas
    //es decir su valor por defecto es null
 public class nodoPedido{
 //metodo contructor de la clase nodopedido
 public int numeroPedido;//guarda datos
 public String nombreCliente;//guarda datos
 public nodoPedido next= null;// apuntador
 
 public nodoPedido (int numPedido, String nombreCliente){//recibe
 this.numeroPedido= numPedido;
 this.nombreCliente= nombreCliente;// cuando queremos atribuirle un valor
 }
 }
 public void agregarCola(int pedido, String cliente){
 nodoPedido nuevPedido= new nodoPedido(pedido, cliente);
 if (cabeza==null && cola==null) {
 cabeza= nuevPedido;
 }
 else{
 cola.next= nuevPedido;
 }
 cola=nuevPedido;
 }
 public void eliminar (){
 if (cabeza!=null) {
 nodoPedido eliminar= cabeza;
 cabeza= cabeza.next;
 eliminar.next= null;
 if (cabeza==null) {
 cola= null;
 }
 }
 }
 
 public void obtener (){
 if (cabeza==null) {
 System.out.println("No hay elementos");
 }else{
 nodoPedido primero= cabeza;
 System.out.println("Los datos del pedido son: {id: " + primero.numeroPedido + " cliente: "+ primero.nombreCliente + "}");
 System.out.println("id: "+ primero.numeroPedido + " cliente: "+ primero.nombreCliente);
 }
 }
 public  boolean isEmptyList() {
 if( cabeza==null&& cola==null){
    return true;
 }
 else{
    return false;
 }
 }
 
 public void saberPedido (){
    if(cabeza==null){
    System.out.println("No hay elementos...");
    }
    else{
       if(cabeza.next==null){
          System.out.println("La cola solo tiene un elemento");
        } 
        else{
         nodoPedido pedidonext=cabeza.next;
         System.out.println("Los datos del siguiente pedido son: "+ "{id: " + pedidonext.numeroPedido + " Cliente: "+ pedidonext.nombreCliente+"}");
        }
 }
 
 }
}
