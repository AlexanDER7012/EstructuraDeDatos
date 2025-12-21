package com.mycompany.listas;

public class Nodo {
    private int dato;
    private String nombre;
    private Nodo siguiente;
    
    public Nodo (int dato, String nombre){
        this.dato = dato;
        this.nombre = nombre;
        this.siguiente = null;
    }

    public Nodo() {
    }
    

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
    
}
