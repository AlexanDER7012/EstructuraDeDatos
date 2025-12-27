package com.mycompany.colalista;

public class Caja {
private int numero;
private boolean estado;
private ColaPersona cola;

public Caja (int numero){
    this.numero = numero;
    this.estado = true;
    cola = new ColaPersona();
}

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }
    public boolean colaVacia(){
        return cola.colaVacia();
    }
    public void agregarPersona(Persona persona){
        cola.agregarPersona(persona);
    }
    public void eliminarPersona(){
        cola.eliminarPersona();
    }
    public void mostrarCola(){
        cola.mostrarCola();
    }

    @Override
    public String toString() {
        return "Caja: " + numero;
    }
    
}
