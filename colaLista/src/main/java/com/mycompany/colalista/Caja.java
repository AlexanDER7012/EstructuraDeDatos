package com.mycompany.colalista;

public class Caja {
private int numero;
private ColaPersona cola;

public Caja (int numero){
    this.numero = numero;
    cola = new ColaPersona();
}

    public int getNumero() {
        return numero;
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
}
