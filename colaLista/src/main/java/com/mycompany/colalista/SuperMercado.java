package com.mycompany.colalista;

public class SuperMercado {
private CajaLista cajaLista;

public SuperMercado (){
    cajaLista = new CajaLista();
}

public void agregarCaja(){
    cajaLista.agregarCaja();
}
public void cajasTotales(){
    cajaLista.cajasTotales();
}
public void mostrarCajas(){
    cajaLista.mostrarCajas();
}
public void manteniminetoCajas(int numero){
    cajaLista.mantenimientoCaja(numero);
}
public void abrirCaja(int numero){
    cajaLista.abrirCaja(numero);
}
public void mostrarCajasMantenimiento(){
    cajaLista.mostrarCajasMantenimiento();
}
public boolean buscarCajaDisponible(int numero){
    return cajaLista.buscarCajaDisponible(numero);
}
public void agregarPersonaCaja(Persona persona, int posicion){
    cajaLista.agregarPersonaCaja(persona, posicion);
}
public void mostrarCajasConFilas(){
    cajaLista.mostrarCajasConFilas();
}
public void personaSeVaDeCaja(int posicion){
    cajaLista.personaSeVaDeCaja(posicion);
}
}
