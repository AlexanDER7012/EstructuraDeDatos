package com.mycompany.arbolb;

public class ArbolB {
private Nodo head;
 
public ArbolB(){
    this.head = null;
}

public void insertarDato(int dato){
    Nodo nuevo = new Nodo(dato);
    if(head == null) head = nuevo;
    else{
        Nodo recorrer = head;
        Nodo anterior = null;
        while(recorrer!=null){
            anterior = recorrer;
           if (dato>recorrer.getDato()) recorrer = recorrer.getRight();
           else recorrer = recorrer.getLeft();
        }
        if (dato>anterior.getDato()) anterior.setRight(nuevo);
        else anterior.setLeft(nuevo);
    }
    System.out.println("Nodo agregado");
}
public void mostrarTodos(int dato){
    if(head == null) System.out.println("No existen datos");
    else{
    if(dato ==1) this.mostrarInorden(head);
    else if (dato== 2) this.mostrarPreorden(head);
    else if (dato== 3) this.mostrarPostorden(head);
    else System.out.println("Escoja un numero valido");
    }
}
private void mostrarInorden(Nodo nodo){
        if(nodo !=null){
        mostrarInorden(nodo.getLeft());
        System.out.println(nodo.getDato()+ " ");
        mostrarInorden(nodo.getRight());
    }
}
private void mostrarPreorden(Nodo nodo){
    if(nodo !=null){
        System.out.println(nodo.getDato()+ " ");
        mostrarPreorden(nodo.getLeft());
        mostrarPreorden(nodo.getRight());
    }
}

private void mostrarPostorden(Nodo nodo){
    if(nodo !=null){
        mostrarPostorden(nodo.getLeft());
        mostrarPostorden(nodo.getRight());
        System.out.println(nodo.getDato()+ " ");
    }

}

}
