import java.util.Comparator;

//METODO INTERSECCION listas

public class Main2 {
    public static void main(String[] args) {

        LinkedList<String> lista = new LinkedList<>();

        Node<String> nodo1 = new Node<>("Primero 20");
        Node<String> nodo2 = new Node<>("Segundo");
        Node<String> nodo3 = new Node<>("Tercero");
        Node<String> nodo4 = new Node<>("Cuarto");

        lista.add(null, nodo1);
        lista.add(nodo1, nodo2);
        lista.add(nodo2, nodo3);
        lista.add(nodo3, nodo4);

        //Imprimir lista
        System.out.println(lista);


        //---CREAR LISTA 2--
        LinkedList<String> lista2 = new LinkedList<>();

        Node<String> node1 = new Node<>("Primero");
        Node<String> node2 = new Node<>("Tercero");
        Node<String> node3 = new Node<>("Quinto");
        Node<String> node4 = new Node<>("Sexto");

        lista2.add(null, node1);
        lista2.add(node1, node2);
        lista2.add(node2, node3);
        lista2.add(node3, node4);

        //Imprimir lista
        System.out.println(lista2);


        //------------CREAR INTERSECCCION------------

        //1) Con Comparator de CONTAINS

        Comparator<String> cContains=new ComparadorContiene();

        LinkedList<String> interseccion= lista.interseccion(lista2, cContains);

        System.out.println("INTERSECCION USANDO CONTAINS");
        System.out.println(interseccion);


        //------------CREAR INTERSECCCION------------

        //1) Con Comparator de IGUALDAD

        Comparator<String> cIgualdad=new ComparadorIgualdad();

        LinkedList<String> interseccion2= lista.interseccion(lista2, cIgualdad);

        System.out.println("INTERSECCION USANDO IGUALDAD");
        System.out.println(interseccion2);


        //-----PROBAR LA UNION-------
        System.out.println("\n PROBEMOS LA UNIOON");

       LinkedList<String> union= lista.union(lista2, cIgualdad);
        System.out.println(union);


        //-----PROBAR METODO INSERTAR LUEGO DE----
        System.out.println("METODO INSERTAR LUEGO DE");

        lista.insertarLuego(lista2, cIgualdad);
        System.out.println(lista);



    }

}