package com.mycompany.colalista;

public class CajaLista {
    private NodoCaja head;

public CajaLista(){
    this.head = null;
    
}

public void agregarCaja(){
        int total = cajasTotales();
        total = total+1;
        Caja caja = new Caja(total);
        NodoCaja cajaNueva = new NodoCaja(caja);
    if(head == null) head = cajaNueva;
    else{
       NodoCaja recorrer = head;
        for (int i = 0; recorrer.getSiguiente()!=null; i++) {
            recorrer = recorrer.getSiguiente();
        }
        recorrer.setSiguiente(cajaNueva);
    } 
}
public void mantenimientoCaja(int posicion){
    if(head == null) System.out.println("No existe nada");
    else if ( posicion == 1) head.getCaja().setEstado(false);
    else{
        int total = this.cajasTotales();
        NodoCaja recorrer = head;
        for (int i = 1;recorrer!=null; i++) {
            if(posicion>total){
            System.out.println("Esta posicion de caja no existe");
            break;
            }

            else if(i == posicion) recorrer.getCaja().setEstado(false);
            recorrer = recorrer.getSiguiente();
        
    }
    }
}
   
    
public int cajasTotales(){
    int total = 0;
    NodoCaja recorrer = head;
    if(head == null) return 0;
    else{
    while(recorrer!=null){
        total++;
        recorrer = recorrer.getSiguiente();
    }
    }
    
    return total;
}
public void mostrarCajas(){
    if (head == null) System.out.println("No hay cajas existentes");
    else{
        NodoCaja recorrer = head;
        while(recorrer!=null){
            if(recorrer.getCaja().isEstado()) System.out.println(recorrer.getCaja().toString());
            else System.out.println("Caja " +recorrer.getCaja().getNumero()+ " en mantenimiento");
            recorrer = recorrer.getSiguiente(); 
        }
    }
}
public void mostrarCajasMantenimiento(){
    NodoCaja recorrer = head;
    System.out.print("Las cajas ");
    while(recorrer!=null){
        if(recorrer.getCaja().isEstado() == false) System.out.print(recorrer.getCaja().getNumero()+" ");
        recorrer = recorrer.getSiguiente();
    }
        System.out.print("estan en mantenimiento");
}
public void abrirCaja(int posicion){
    if(head == null) System.out.println("No existe nada");
    else{
    NodoCaja recorrer = head;
    for (int i = 1; recorrer!=null; i++) {
        if(i == posicion) recorrer.getCaja().setEstado(true);
        recorrer = recorrer.getSiguiente();
        
    }
        }
}

}
