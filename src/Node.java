//Clase generica

public class Node <E>{

    //------------Atributos---------
    //Tiene DATA (de tipo <E> )
    //Tiene un Nodo como NEXT
    //Tiene un Nodo como PREVIOUS


    private E data;
    private Node <E> next;
    private Node<E> previous;

    //----Constructor---
    public Node (E data){
        this.data=data;
        this.next=null; //Setear NEXT a null
        this.previous=null; //Setear previous a null

    }

    //----Getters y Setters---

    public E getData(){
        return data;
    }

    public void setData(E data){
        this.data=data;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node next){
        this.next=next;
    }

    public Node getPrevious(){
        return previous;
    }

    public void setPrevious(Node previous){
        this.previous=previous;
    }
}
