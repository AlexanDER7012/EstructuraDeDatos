package com.mycompany.colalista;

public class ColaPersona {
private NodoPersona head;    
private NodoPersona tail;

public ColaPersona(){
    this.head = null;
    this.tail = null;
}

public void agregarPersona(Persona persona){
    NodoPersona nuevo = new NodoPersona(persona);
    if (head == null&& tail == null) head = tail = nuevo;
    else{
        tail.setSiguiente(nuevo);
        tail = nuevo;
    }
}
public void eliminarPersona(){
    if(head == null && tail == null) System.out.println("Esperando personas...");
    else{
        head = head.getSiguiente();
        if(head == null) tail = null;
    }
}
public void mostrarCola(){
    
    if(head == null && tail == null) System.out.println("No hay nada en cola");
    else{
    NodoPersona recorrer = head;
    while(recorrer !=null){
        System.out.print(recorrer.getPersona()+" ");

        recorrer = recorrer.getSiguiente();
    }
    }
}
public boolean colaVacia(){
    return head == null&& tail == null;
}
}
