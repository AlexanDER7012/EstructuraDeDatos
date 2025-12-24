package com.mycompany.colalista;

public class CajaLista {
    private NodoCaja head;

public CajaLista(){
    this.head = null;
    
}

public void agregarCaja(int numero){
        Caja caja = new Caja(numero);
        NodoCaja cajaNueva = new NodoCaja(caja);
    if(head == null) head = cajaNueva;
    else{
        boolean encontrado = false;
        NodoCaja recorrer = head;
        for (int i = 0; recorrer != null; i++) {
            if(recorrer.getCaja().getNumero()== numero){
                encontrado = true;
                break;
            }
            recorrer = recorrer.getSiguiente();
        }
        if(encontrado) System.out.println("Este numero de caja ya esta registrada");
        else{
            cajaNueva.setSiguiente(head);
            head = cajaNueva;
      }
    } 
}
public int cajasTotales(){
    int total = 0;
    NodoCaja recorrer = head;
    do{
        total ++;
        recorrer = recorrer.getSiguiente();
    }while(recorrer.getSiguiente()!=null);
    
    return total;
}
public void mostrarCajas(){
    if (head == null) System.out.println("No hay cajas existentes");
    else{
        NodoCaja recorrer = head;
        while(recorrer!=null){
            System.out.println(recorrer.getCaja().toString());
            recorrer = recorrer.getSiguiente(); 
        }
    }
}

}
