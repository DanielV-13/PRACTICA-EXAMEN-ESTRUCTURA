//----EJERCICIO CELEBRIDAD FIESTA PILAS---

//Aquel que todos lo conoce, pero el no conoce a nadie, es la CELEBRIDAD

//Celebridad - No conoce a NADIE
//              -Todos los conocen a el

//PUEDO HACER UNA MATRIZ PARA RESOLVER EL EJERCICIO
//Estructura "Persona" que representa a quienes conocen o no


import java.util.LinkedList;

public class Main3 {
    public static void main(String args[]) {

//Crear nuevas personas

Persona A= new Persona("Persona A");
Persona B= new Persona("Persona B");
Persona C= new Persona("Celebridad");
Persona D= new Persona("Persona D");

LinkedList<Persona> ConocidosA= new LinkedList<>();
ConocidosA.add(B);
ConocidosA.add(C);

LinkedList<Persona> ConocidosB= new LinkedList<>();
ConocidosB.add(A);
ConocidosB.add(C);
ConocidosB.add(D);

LinkedList<Persona> ConocidosC= new LinkedList<>();

LinkedList<Persona> ConocidosD= new LinkedList<>();
ConocidosD.add(C);
ConocidosD.add(D);



A.añadirConocidos(ConocidosA);
B.añadirConocidos(ConocidosB);
C.añadirConocidos(ConocidosC);
D.añadirConocidos(ConocidosD);

Pila<Persona> invitados= new Pila<>();
invitados.push(A);
invitados.push(B);
invitados.push(C);
invitados.push(D);




while(invitados.size()>0){
    System.out.println(invitados.pop());
}







    }
}
