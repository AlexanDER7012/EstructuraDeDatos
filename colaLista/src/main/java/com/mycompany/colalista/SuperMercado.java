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
}
