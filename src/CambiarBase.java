import java.util.ArrayDeque;
import java.util.Deque;

public class CambiarBase {

    //Convertir un numero en base 10 a otra base n
    //Debo ir guardando el residuo

    public static int convertir(int numero, int base){
       //Crear pila para guardar residuos
        Pila<Integer> P=new Pila<>();

        //Hacemos un bucle While
        int cociente=numero; //Valor inicial de cociente es el numero inicial


        while (cociente!=0){
            int residuo= cociente % base;   //mod  -- 1) Saco el residuo
            cociente= cociente/base;   //division entera 2) Saco el nuevo cociente

            P.push(residuo);  //Voy guardando los residuos
        }

        //-------Formar el numero nuevo------

        // 3. Construir el número entero resultado
        int resultadoInt = 0;
        // Colocar los dígitos correctamente (unidades, decenas, centenas...)

        while (!P.isEmpty()) {
            int digito = P.pop(); // Saca el dígito de la cima

            // "Mueve" los dígitos anteriores a la izquierda y suma el nuevo dígito
            // Ejemplo: Si resultadoInt=13 y digito=2 -> 13 * 10 + 2 = 132

            resultadoInt = resultadoInt * 10 + digito;

        }
        // Devolver el entero construido
        return resultadoInt;
    }

//------------MAIN PARA PROBAR-------------
    public static void main(String args[]){

        System.out.println(convertir(30,2));
        System.out.println(convertir(90,5));

        }


}
