// SE NOS VA A DAR LA IMPLEMENTACION DE UNA LINKEDLIST
//No es la implementacion de JAVA

//Debe ser una clase Generica <E>
//En realidad va a ser una DoubleLinkedList
public class LinkedList <E> {

    //-------Atributos de la LinkedList---------
    //Tiene HEADER
    //Tiene TAIl
    //Tiene SIZE

    private Node<E> header;
    private Node<E> tail;
    private int size;

    //----CONSTRUCTOR----
    public LinkedList(){
        this.header=null;
        this.tail=null;
        this.size=0; //Size empieza siendo 0
    }


    //----Getters y Setters---

    public Node<E> getHeader(){
        return header;
    }
    //Obtenga el ultimo elemento - Devuelve el NODO
    public Node<E> getTail(){
        return tail;
    }

    public int getSize(){
        return size;
    }


//-----METODOS----

    //    METODO 1
    //Añadir un nodo despues de otro nodo dentro de la lista
    //Recibe el nodo p y el nodo a agregar
    public Node<E> add(Node<E> p, Node<E> nuevo) {

        //Caso 1) SI la lista esta vacia
        if (header == null && tail == null) {
            header = nuevo;
            tail = nuevo;

            //Caso 2) Si el nodo p es el tail
        } else if (p == tail) {
            nuevo.setPrevious(p);
            p.setNext(nuevo);
            tail = nuevo; //Definimos un nuevo tail
        } else {
            //Caso 3) Normal

            Node<E> q = p.getNext(); //Guardamos el nodo que estaria despues del nuevo a ingresar
            //Conexiones del nuevo nodo
            nuevo.setNext(q);
            nuevo.setPrevious(p);

            //Cambiar conexeciones de los nodos antes y despues
            p.setNext(nuevo);
            q.setPrevious(nuevo);

        }
        size++;  //Añadir 1 al size
        return nuevo;  //Retornar el nodo nuevo (el que se añadio)
    }
    //Convierta toda la lista String
    //---METODO TO STRING----
    @Override
    public String toString(){
        String s=""; //Variable local para almacenar

        //Empiezo en i=header  -- i es un dato de tipo NODO
        //CONDICION - i distinto de null
        //Avanzo con getNext
        for(Node <E> i=header; i!=null; i=i.getNext() ) {
            s= s+" - "+ i.getData();
        }
        return s;
    }

    //----------------------------------------------------
    //    METODO 2
    //Remover un nodo de la lista
    //Recibe el nodo que se va a remover

    public Node<E> remove (Node<E> eliminar) {

        //1) Caso en que la lista este vacia,- tail y header estan en null
        if (header == null && tail == null) {
            return null; //No hacer nada

            //Caso 2) La lista tiene un solo elemento /Y el elemento a eliminar es ese elemento unico
        }else if (header == tail && eliminar==header) {         //Si header es igual a tail, la lista tiene un solo elemento
            header = tail = null;   //Queda vacia la lista

            //Caso 3) Quiero elminar el header
        }else if (eliminar == header) {
            header= header.getNext(); //Definimos el nuevo HEADER
            header.setPrevious(null); //Seteo el previous del nuevo header a NULL
            //Desconecta el anterior Header (eliminar)
            eliminar.setNext(null);

            // Caso 4) Quiero eliminar el tail
        }else if(eliminar == tail) {

            tail=tail.getPrevious();  //Definimos el nuevo Tail
            tail.setNext(null); //Setero el next del nuevo tail a NULL

            //Desconecta el anterior tail
            eliminar.setPrevious(null);

        } else {
            //Caso 6) Caso Normal
            Node<E> pre = eliminar.getPrevious(); //nodo de antes al de eliminar
            Node<E> post = eliminar.getNext(); //nodo despues del de eliminar
            pre.setNext(post); //Setamos el next de PRE a post
            post.setPrevious(pre); //Seteamos el previous de POST a pre

            //Desconectamos el nodo a eliminar
            eliminar.setNext(null); //El next del nodo a eliminar sera NULL
            eliminar.setPrevious(null); //El previous del nodo a eliminar sera NULL

        }
        size--;  //Restar el size -1
        return eliminar;  //Retornar el nodo eliminado
    }


    //----------------------------------------------------
    //    METODO 3
    //Revertir una lista


    public LinkedList<E> reverse(){
        //1) La lista esta vacia o tiene 1 solo elemento
        if(header==null || header==tail){
            return this; //Retorna la misma lista
        }

        LinkedList<E> revertida= new LinkedList<>(); //Creamos nueva lista para guardar los revertidos
        //Bucle For
        //Empieza desde el tail (FINAL)
        //Condicion que el nodo NO sea null
        //Avanzar, no esta definido en la declaracion del for  - Avanzamos del fin para el inicio

        for(Node<E> i =tail; i!=null; i=i.getPrevious()){

            revertida.add(revertida.getTail(),new Node<>(i.getData()));  //Se toma el tail de la nueva Lista
            //Creamos un nuevo nodo para poder en la lista revertida
            //Ese nuevo nodo, tiene el mismo dato del i de la lista original
            // Se añade el nuevo nodo despues del tail
        }
        return revertida;
    }

//-------METODO PARA HACER REPLACE----------

    //Parametros
    //1) El comparador
    //2) El nodo a comparar (REFERENCIA)
    //3) El texto a reemplazar

    public void replace(Comparador igualdad,Node referencia, E reemplazo){

        //Recorro toda la lista
        for(Node i=header; i!=null; i.getNext()){

            if(igualdad.compare(i,referencia)==1){
                i.setData(reemplazo);
            }

        }

    }




























   /* //--------------Metodo para REVERTIR LA LISTA-----------
    public DoubleLinkedList<E> revertir(){
        //1) La lista esta vacia o tiene 1 solo elemento
        if(header==null || header==tail){
            return this; //Retorna la misma lista
        }

        DoubleLinkedList <E> invertida= new DoubleLinkedList<>(); //Nueva lista, empieza vacia

        //Bucle For
        //Empieza desde el tail (FINAL)
        //Condicion que el nodo NO sea null
        //Avanzar, no esta definido en la declaracion del for  - Avanzamos del fin para el inicio
        for (Node <E> i =tail; i != null; ){
            Node<E> anterior= i.getPrevious();  //Vamos avanzando en la lista hacia atras

            //Antes de agregar a la nueva lista, se debe eliminar los enlaces
            //Que tenian los nodos con la lista anterior
            i.setNext(null); //Limpiar el next del NODO
            i.setPrevious(null); //Limpiar el previous del NODO

            invertida.add(null, i);

            i=siguiente; //Avanzamos el for
        }
        return invertida;

    }
*/









}
