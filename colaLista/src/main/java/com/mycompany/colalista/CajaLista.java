package com.mycompany.colalista;

public class CajaLista {
    private NodoCaja head;

public CajaLista(){
    this.head = null;
    
}

public void agregarCaja(int numero){
    Caja caja = new Caja(numero);
    NodoCaja cajaNueva = new NodoCaja(caja);
    
    
}

}
