
package com.mycompany.cola;

public class Cola {
private Nodo head;
private Nodo ultimo;

public Cola (){
    this.head = null;
    this.ultimo= null;
    
}

public void insertarNodo(int dato){
    Nodo nuevo = new Nodo(dato);
    if (head == null) head = ultimo = nuevo;
    else {
    ultimo.setSiguiente(nuevo);
    ultimo = nuevo;
    System.out.println("Nodo agregado!");
     }
}
public void mostrarCola(){
    
    if (head == null){
    System.out.println("La cola esta vacia");
    return;
    } else{
        Nodo recorrer = head;
            System.out.println("Cola");
    
    while(recorrer!=null){
        System.out.print(recorrer.getDato() +" - ");
        recorrer = recorrer.getSiguiente();
    }
   }
}
public void eliminarFIFO(){
    if(head == null) System.out.println("La cola esta vacia, no hay nada por eliminar");
    else{
        System.out.println("EL dato "+ head.getDato()+ " ha sido eliminado");
        head = head.getSiguiente();
        if(head==null) ultimo = null; //ambos deben de ser null si no hay nada
    }
}


}
