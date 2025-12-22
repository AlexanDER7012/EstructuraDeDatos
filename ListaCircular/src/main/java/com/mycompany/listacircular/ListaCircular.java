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
public void insertarPosicionEspecifica(int posicion, int dato, String nombre, int total){
    Nodo nuevo = new Nodo(dato, nombre);
    
    if (posicion <= 0 || posicion > total) System.out.println("indique un valor correcto");
    
    else if(head == null && posicion == 1){
        nuevo.setSiguiente(nuevo);
        nuevo.setAnterior(nuevo);
        head = nuevo;
    } else{
        Nodo recorrer = head;
        Nodo ultimo = head.getAnterior();
        for (int i = 1; recorrer!=ultimo ; i++) {
            if(i == posicion -1) break;
            recorrer = recorrer.getSiguiente();
        }
       nuevo.setSiguiente(recorrer.getSiguiente());
       nuevo.setAnterior(recorrer);
       recorrer.setSiguiente(nuevo);
       recorrer.getSiguiente().setAnterior(nuevo);
       
    }
}
public int obtenerCantidadTotal(){
    int cantidad = 0;
    if(head == null) cantidad =0;
    else{
        Nodo recorrer = head;
    do{
        cantidad ++;
        recorrer = recorrer.getSiguiente();
    }while(recorrer != head);
 }
    return cantidad;
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
            vueltas++;
            NoPersona =1;
            System.out.println("-----------------------------------------");
        }
        }
    
    }
}



}
