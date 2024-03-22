package pilas;
public class main {
public static void main (String []args){
    pilas pila = new pilas ();

    pila.apilar(1, "Erick", "Libro1");
    pila.apilar(2, "solovino", "Libro2");
    pila.apilar(3, "juancho", "Libro3");

    System.out.println(pila.length());
    pila.desapilarN(2);
    System.out.println(pila.length());


}
}
