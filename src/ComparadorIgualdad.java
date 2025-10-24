//----------LOGICA DEL COMPARATOR----------
//retorna 0 si los datos son iguales
//retorna 1 si los datos son diferentes

//------DESCRIPCION DE LA CLASE-----
//Esta es tu nueva clase ComparadorIgualdad.
// Es genérica (<E>) y su única estrategia es usar .equals().
// Sirve para String, Integer, Double, Tarea...
// ¡para cualquier objeto!


import java.util.*;

// Tu clase implementa la interfaz Comparator<Node>
public class ComparadorIgualdad <E> implements Comparator<E> {

    // SOBREESCRIBES el métod0 de la interfaz
    @Override
    public int compare(E datoLista, E datoPlantilla) {

        // Comparamos el DATO del nodo de la lista con el DATO del nodo de referencia
        // Usamos .equals() que sí compara el contenido (ej: "Tercero".equals("Tercero"))

        // (Nota: Asumimos que los datos (getData()) no son null)
        if (datoLista.equals(datoPlantilla)) {

            //  0 si  son iguales
            return 0;

        } else {
            // ESTÁNDAR JAVA: 1 (o cualquier non-cero) = Son Diferentes
            return 1;
        }
    }
}
