//----------LOGICA DEL COMPARATOR----------
//retorna 1 si los datos son iguales
//retorna 0 si los datos son diferentes

// En Comparador.java
import java.util.*;

// Tu clase implementa la interfaz Comparator<Node>
public class Comparador implements Comparator<Node> {

    // SOBREESCRIBES el métod0 de la interfaz
    @Override
    public int compare(Node nodoLista, Node nodoReferencia) {

        // Comparamos el DATO del nodo de la lista con el DATO del nodo de referencia
        // Usamos .equals() que sí compara el contenido (ej: "Tercero".equals("Tercero"))

        // (Nota: Asumimos que los datos (getData()) no son null)
        if (nodoLista.getData().equals(nodoReferencia.getData())) {

            // Según tu lógica: 1 = son iguales
            return 1;

        } else {
            // Según tu lógica: 0 = son diferentes
            return 0;
        }
    }
}
