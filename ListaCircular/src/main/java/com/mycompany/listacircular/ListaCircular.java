package com.mycompany.listacircular;

public class ListaCircular {
private Nodo head;

public ListaCircular (){
    head = null;
}
public void insertarInicio(int dato, String nombre){
    Nodo nuevo = new Nodo(dato, nombre);
    if(head == null) {
        nuevo.setSiguiente(nuevo);
        nuevo.setAnterior(nuevo);
        head = nuevo;
        
    }
    else{
        Nodo ultimo = head.getAnterior();
        ultimo.setSiguiente(nuevo);
        nuevo.setSiguiente(head);
        head.setAnterior(nuevo);
        nuevo.setAnterior(ultimo);
        head = nuevo;
        System.out.println("Nodo agregado al inicio");
    }
}
public void insertarFinal(int dato, String nombre){
    Nodo nuevo = new Nodo(dato, nombre);
    if (head == null){
        nuevo.setSiguiente(nuevo);
        nuevo.setAnterior(nuevo);
        head = nuevo;
    } else{
        Nodo ultimo = head.getAnterior();
        ultimo.setSiguiente(nuevo);
        nuevo.setSiguiente(head);
        nuevo.setAnterior(ultimo);
        head.setAnterior(nuevo);
        System.out.println("Nodo agregado al final");
    }
}
public void insertarPosicionEspecifica(int posicion, int dato, String nombre){
    
}
public void mostrarNodos(int cantidad){
    if(head == null) System.out.println("La lista esta vacia");
    else{
    Nodo recorrer = head;
    int vueltas =0;
    int NoPersona =1;
        while(vueltas!=cantidad){
        System.out.println(NoPersona+ ": " + recorrer.getNombre()+ " de " + recorrer.getDato() + " anios de edad.");
        recorrer = recorrer.getSiguiente();
        NoPersona++;
        if(recorrer == head){
            System.out.println("-----------------------------------------");
            vueltas++;
            NoPersona =1;
            System.out.println("-----------------------------------------");
        }
        }
    
    }
}



}
