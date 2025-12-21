package com.mycompany.pila;

public class Pila {
private Nodo head;

public Pila(){
    this.head = null;
    
}

public void insertarNodo(int dato){
    Nodo nuevo = new Nodo(dato);
    if (head == null) head = nuevo;
    else{
        nuevo.setSiguiente(head);
        head = nuevo;
        System.out.println("Nodo añadido");
    }
}
public void mostrarPila(){
    if ( head == null) System.out.println("La Pila esta vacia");
    else{
        Nodo recorrer = head;
        System.out.println("-----------------------");
        while (recorrer != null){
            System.out.println(recorrer.getDato());
            recorrer = recorrer.getSiguiente();
        }
    }
}
public void eliminarLIFO(){
    if (head == null) System.out.println("No hay nada para eliminar");
    else{
        head = head.getSiguiente();
        System.out.println("Eliminado con exito");
    }
}
}
