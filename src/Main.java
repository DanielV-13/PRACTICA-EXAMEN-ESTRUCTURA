//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LinkedList<String> lista = new LinkedList<>();

        Node<String> nodo1= new Node<>("Primero");
        Node<String> nodo2= new Node<>("Segundo");
        Node<String> nodo3= new Node<>("Tercero");
        Node<String> nodo4= new Node<>("Cuarto");

        lista.add(null,nodo1);
        lista.add(nodo1, nodo2);
        lista.add(nodo2, nodo3);
        lista.add(nodo3, nodo4);

        //Imprimir lista
        System.out.println(lista);


        //Uso del Replace
        //1) Creo mi comparador
        Comparador cIgualdad = new Comparador();

        //2)Creo mi Nodo referencia
        Node<String> referencia= new Node("Tercero");


        lista.replace(cIgualdad, referencia, "REEMPLAZADOOO");

        System.out.println(lista);


    }
}