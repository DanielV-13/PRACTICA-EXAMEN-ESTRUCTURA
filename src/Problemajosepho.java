
import java.util.LinkedList;
import java.util.Queue;


public class Problemajosepho {


    //n es el numero de personas
    //k es el salto que hace (cada cuantas personas mata)
    public static int encontrarSobreviviente(int n, int k) {
        Queue<Integer> cola = new LinkedList<>();

        // Paso 1: Llenar la cola con las personas
        for (int i = 1; i <= n; i++) {
            cola.offer(i);
        }

        // Paso 2: Simular el proceso de eliminación
        while (cola.size() > 1) {
            cola.remove(0+k);

            // Rotar k-1 personas


            // ... tu código aquí

            // Eliminar la k-ésima persona
            // ... tu código aquí
        }

        // Paso 3: Retornar el sobreviviente
        return cola.poll();
    }


}
