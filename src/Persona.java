import java.util.LinkedList;

public class Persona {
    //Atributos
    String nombre;
    LinkedList<Persona> Conocidos;
    Boolean esCelebridad;

    //Constructor
    public Persona(String nombre){
        this.nombre=nombre;
        Conocidos= new LinkedList<Persona>(); //Crea la lista de personas
        esCelebridad=false;
    }

    public void añadirConocidos(LinkedList<Persona> conocidos){
        this.Conocidos= conocidos;
    }

    //Mrtodo para imprimir
    public String toString(){
        String s= this. nombre;
        return s;
    }







}
