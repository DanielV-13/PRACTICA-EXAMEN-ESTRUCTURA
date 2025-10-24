//----------LOGICA DEL COMPARATOR----------
//retorna 0 si los datos son iguales
//retorna 1 si los datos son diferentes

//------DESCRIPCION DE LA CLASE-----
//Aquí está la respuesta a tu pregunta sobre .contains().
// Esta lógica NO PUEDE SER GENÉRICA <E>, porque los Integer o Double no tienen un métod0 .contains().
//  Esta estrategia solo funciona para String.

//Esta clase va a hacer exclusivamente para comparar coincidencias en STRINGS


import java.util.Comparator;

public class ComparadorContiene implements Comparator<String> {

    @Override
    public int compare(String datolista, String plantilla){
        if(datolista.contains(plantilla)){
            return 0;  //Retorna 0 si son iguales
        }
        return 1; //Retorna 1 si no son iguales
    }


}
