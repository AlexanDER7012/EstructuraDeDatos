package com.mycompany.listas;

public class Lista {
    private Nodo head;
    
    public Lista(){
        this.head = null;
    }
    
    //insertar primero
    public void insertarNodo(int dato, String nombre){
        Nodo nuevoNodo = new Nodo(dato, nombre);
        nuevoNodo.setSiguiente(head);
        this.head = nuevoNodo;
        System.out.println("El nuevo nodo se a creado a partir de Head"); 
    }
    
    //MOstrar
    public void mostrarNodos(){
        Nodo nodos = head;
        System.out.println("Estas son las personas inscritas");
        while(nodos!= null){
            System.out.println("nombre: "+nodos.getNombre() + " edad: "+ nodos.getDato());
            nodos = nodos.getSiguiente();
        }
    }
    //Eliminar
    //Buscar
    //Imprimir
    //contar
    //Insertar al final
    public void insertarFinal(int dato, String nombre){
        Nodo nuevo = new Nodo(dato, nombre);
        Nodo recorrer;
        boolean agregado=false;
        
        if(head == null) head = nuevo;
        else{
            recorrer = head;
            while(!agregado){
                
            if(recorrer.getSiguiente()==null){
                recorrer.setSiguiente(nuevo);
                agregado = true;
            } else {
                recorrer = recorrer.getSiguiente();
                
            }
        }
        }
    }
    //insertar en el medio
    public void insertarMedio(int dato, String nombre, int posicion){
        Nodo nuevo = new Nodo(dato, nombre);

        if(head == null){
            head=nuevo;
            return;
        }
        if(posicion == 1){
            nuevo.setSiguiente(head);
            head = nuevo;   
        }
        else{
        Nodo recorrer = head;
        for (int i = 1;recorrer != null ;i++){
            if(i == posicion-1) break;
                recorrer = recorrer.getSiguiente(); 
        }
        nuevo.setSiguiente(recorrer.getSiguiente());
        recorrer.setSiguiente(nuevo);
        }
        
    }
    //eliminar por posicion
    public void eliminarNodo(int dato){
        
        if(head == null){
            System.out.println("No hay nada que eliminar");
            return;
        }
        
        Nodo recorrer = head;
        
        if(dato ==1 && head != null) head = head.getSiguiente();
        else{
        
   
        for (int i = 1; recorrer!=null; i++){
            if(i == dato-1){
                if(recorrer.getSiguiente().getSiguiente() == null) recorrer.setSiguiente(null);
                else recorrer.setSiguiente(recorrer.getSiguiente().getSiguiente());
            }
             recorrer = recorrer.getSiguiente();
        }
      }
        
    }
    
    
    
}
