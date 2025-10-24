import java.util.Comparator;


public class Main {
    public static void main(String[] args) {

       LinkedList<String> lista = new LinkedList<>();

        Node<String> nodo1= new Node<>("Primero 20");
        Node<String> nodo2= new Node<>("Segundo");
        Node<String> nodo3= new Node<>("Tercero");
        Node<String> nodo4= new Node<>("Cuarto");

        lista.add(null,nodo1);
        lista.add(nodo1, nodo2);
        lista.add(nodo2, nodo3);
        lista.add(nodo3, nodo4);

        //Imprimir lista
        System.out.println(lista);

        //Tu Main ahora demuestra el poder de esta abstracción.
        // Usas el mismo métod0 lista.replace()
        // con dos lógicas de comparación totalmente diferentes.




        //-----Uso del Replace---
        //En este caso para Strings

        //1) Creo mi comparador de "Igualdad"

        Comparator<String> cIgualdad = new ComparadorIgualdad();

        //2)Creo mi plantilla (YA NO ES UN NODO)
        String plantilla= "Tercero";


        lista.replace(cIgualdad, plantilla, "REEMPLAZADOOO por igualdad");

        System.out.println("UsoComparator Igualdad:  "+ lista);



        //-----Uso del Replace---
        //En este caso para Strings
        //Pero ahora con CONTAINS

        //1) Creo mi comparador
        Comparator<String> cContiene = new ComparadorContiene();

        //2)Creo mi Nodo plantilla
        String plantilla2 = "Primero";


        lista.replace(cContiene, plantilla2, "Reemplazado por Contains");

        System.out.println("Uso del ComparatorContains: "+ lista);



        //----------AHORA PROBEMOS COON LISTAS DE NUMEROS------------

        LinkedList<Integer> listaNum= new LinkedList();

        Node<Integer> Numeric1= new Node(1);
        Node<Integer> Numeric2= new Node(2);
        Node<Integer> Numeric3= new Node(3);
        Node<Integer> Numeric4= new Node(4);

        listaNum.add(null,Numeric1);
        listaNum.add(Numeric1,Numeric2);
        listaNum.add(Numeric2,Numeric3);
        listaNum.add(Numeric3,Numeric4);
        System.out.println(listaNum);


        //------REPLACE CON IGUALDAD-----

        //1) Creo mi comparador
        Comparator<Integer> cNum= new ComparadorIgualdad();

        listaNum.replace(cNum,3,0);
        System.out.println(listaNum);



    }
}