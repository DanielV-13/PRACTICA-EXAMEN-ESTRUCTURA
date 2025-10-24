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
            cociente= cociente/base;   //division entera
            int residuo= numero %base;   //mod
            P.push(residuo);  //Voy guardando los residuos
        }

        //Formar el numero nuevo

        while(P.size()>0){
            System.out.println(P.peek()); //Muestra el primer elemento
            P.pop(); //Elimina el primer elemento
        }

        return 0;
    }


    public static void main(String args[]){

        convertir(30,2);

        }




}
