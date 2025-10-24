import java.util.LinkedList;

public class Main4 {
    public static void main(String args[]) {

        //Arreglo de entero
        Integer[] numeros = {3, 7, 5, 9, 3, 2, 4, 1, 4};

        //Crear Pila
        Pila<Integer> pnumeros = new Pila<>();

        for (int n : numeros) {
            pnumeros.push(n);
            while (numeros[numeros[n] + 1] < numeros.length-1) {
                if (numeros[numeros[n] + 1] > n) {
                    pnumeros.pop();
                    System.out.println(n + "---->" + numeros[numeros[n] + 1]);
                }
            }


        }

    }
}
