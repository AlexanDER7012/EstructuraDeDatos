package com.mycompany.arbolb;

public class Nodo {
private int dato;
private Nodo left;
private Nodo right;

public Nodo(int dato){
    this.dato = dato;
    this.left=null;
    this.right= null;
}

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getLeft() {
        return left;
    }

    public void setLeft(Nodo left) {
        this.left = left;
    }

    public Nodo getRight() {
        return right;
    }

    public void setRight(Nodo right) {
        this.right = right;
    }


}
