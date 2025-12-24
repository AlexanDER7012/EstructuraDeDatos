package com.mycompany.colalista;

public class NodoCaja {
  private Caja caja;
  private NodoCaja siguiente;
  
  public NodoCaja(Caja caja){
      this.caja = caja;
      siguiente = null;
      
      
  }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

 

    public NodoCaja getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCaja siguiente) {
        this.siguiente = siguiente;
    }
}
