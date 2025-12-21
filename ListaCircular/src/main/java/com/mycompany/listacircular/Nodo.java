package com.mycompany.listacircular;

public class Nodo {
    private int dato;
    private String nombre;
    private Nodo siguiente;
    private Nodo anterior;
    
    public Nodo(int dato, String nombre){
        this.dato = dato;
        this.nombre= nombre;
        this.anterior = null;
        this.siguiente = null;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
    
}
