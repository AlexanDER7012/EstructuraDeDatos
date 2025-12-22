package com.mycompany.recursividadd;

public class Recursividadd {

    public static void Recursividad(int n, int origen, int aux, int dest ){
        if(n != 0){
            Recursividad(n-1, origen, dest, aux);
            System.out.println("Del destino " + origen + " se movio a " + dest );
            Recursividad(n-1, dest, aux, origen);
        }
        
    }
    
    public static void main(String[] args) {
        Recursividad(3,1,3,2);
    }
}
