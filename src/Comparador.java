import java.util.*;

public class Comparador implements Comparator <Node> {

    //retorna 1 si los datos son iguales
    //retorna 0 si los datos son diferentes

    public int compare(Node nodoLista, Node nodoReferencia) {

        if (nodoLista.getData().equals(nodoReferencia.getData()) ) {
            return 1;
        } else {
            return 0;
        }
    }

}
