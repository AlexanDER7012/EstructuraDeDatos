package com.mycompany.colalista;

public class SuperMercado {
private CajaLista cajaLista;

public SuperMercado (){
    cajaLista = new CajaLista();
}

public void agregarCaja(int numero){
    cajaLista.agregarCaja(numero);
}
public void cajasTotales(){
    cajaLista.cajasTotales();
}
public void mostrarCajas(){
    cajaLista.mostrarCajas();
}
}
