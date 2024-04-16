public class arbolBinario {
    NodoBinario raiz;

    public arbolBinario(){
        this.raiz=null;
    }
    public void insertar(int valor){
        raiz = insertarNodo(raiz, valor);
        }
    
        private NodoBinario insertarNodo(NodoBinario raizActual, int valor){
           if(raizActual==null){
            return new NodoBinario( valor);
           }
           if(valor<raizActual.valor){
            raizActual.izquierdo=insertarNodo(raizActual.izquierdo, valor);
           }
           else if(valor>raizActual.valor){
            raizActual.derecho=insertarNodo(raizActual.derecho, valor);
           }
           return raizActual;
        }

        public void inorder(NodoBinario nodo){
          if(nodo==null){
            return;
          }
          
          if(nodo!=null){
            inorder(nodo.izquierdo);
            System.out.println(nodo.valor + " ");
            inorder(nodo.derecho);
          }
        }

        public void preorder(NodoBinario nodo){
          if(nodo==null){
            return;
          }
          
          else if(nodo!=null){
            System.out.println(nodo.valor + "");
            preorder(nodo.izquierdo);
            preorder(nodo.derecho);
           }
        }

        public void postOrder(NodoBinario nodo){
          
          if(nodo!=null){
                postOrder(nodo.izquierdo);
                postOrder(nodo.derecho);
                System.out.println(nodo.valor);
            }
        }

        public void eliminar(int valor){
            raiz = eliminarNodo(raiz, valor);
          }
        
          private NodoBinario eliminarNodo(NodoBinario raizActual, int valor){
            if (raizActual == null) {
              return raizActual;
            }
            if (valor < raizActual.valor) {
              raizActual.izquierdo = eliminarNodo(raizActual.izquierdo, valor);
            }
            else if (valor > raizActual.valor) {
              raizActual.derecho = eliminarNodo(raizActual.derecho, valor);
            }
            else{
              if (raizActual.izquierdo == null) {
                return raizActual.derecho;
              }else if (raizActual.derecho == null) {
                return raizActual.izquierdo;
              }
              NodoBinario sucesor = encontrarSucesor(raizActual.derecho);
              raizActual.valor= sucesor.valor;//el sucesor siempre va ser derecho y mayor
              raizActual.derecho= eliminarNodo(raizActual.derecho, sucesor.valor);
            }
            return raizActual;
          }
        
          private NodoBinario encontrarSucesor(NodoBinario nodo){
            NodoBinario actual= nodo;
            while (actual.izquierdo != null){
              actual = actual.izquierdo;
            }
            return actual;
          }
        
          public NodoBinario buscar(int valor){
            return buscarNodo(raiz, valor);
          }
        
          private NodoBinario buscarNodo(NodoBinario raizActual, int valor){
            if (raizActual== null || raizActual.valor== valor) {
              return raizActual;
            }
            if (valor < raizActual.valor) {
              return buscarNodo(raizActual.izquierdo, valor);
            }
            else{
              return buscarNodo(raizActual.derecho, valor);
            }
          }
        
          public int contarNodos(){
            return contarNodos(raiz);
          }
          private int contarNodos(NodoBinario nodo){
            if (nodo == null) {
              return 0;
            }
            return 1 + contarNodos(nodo.izquierdo) + contarNodos(nodo.derecho);
          }
          
          public int alturaArbol(){
           return alturaArbol(raiz);
          }
          public int alturaArbol(NodoBinario nodo){
            if (nodo== null) {
              return 0;
            }
            return 1 + Math.max(alturaArbol(nodo.izquierdo), alturaArbol(nodo.derecho));
          }
        
          public int contarHojas(){
            return contarHojas(raiz);
          }
        
          public int contarHojas(NodoBinario nodo){
            if (nodo==null) {
              return 0;
            }
            if (nodo.izquierdo == null  && nodo.derecho==null) {
              return 1;
            }
            return contarHojas(nodo.izquierdo)+ contarHojas(nodo.derecho);
        }
        public int valorMenor(NodoBinario nodo){
          if (nodo==null){
          throw new NullPointerException("está vacía");
          }
          if(nodo.izquierdo==null){
            return nodo.valor;
          }
          return valorMenor(nodo.izquierdo);
        }
        public int valorMayor (NodoBinario nodo){
          if(nodo==null){
          throw new NullPointerException("Está vacía");
          }
          if(nodo.derecho==null){
            return nodo.valor;
          }
          return valorMayor(nodo.derecho);
        }
        }