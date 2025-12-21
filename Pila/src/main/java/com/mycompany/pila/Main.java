package com.mycompany.pila;

import java.util.Scanner;

public class Main {
public static int menu(Scanner entrada){
        System.out.println("""
                           
                           Seleccione una opcion
                           1. Aniadir Pila
                           2. Ver cola
                           3. Eliminar de la Pila
                           4. Salir
                           
                           """);
        return Integer.parseInt(entrada.nextLine());
    }
    public static boolean Opciones(Scanner entrada, int opcion, Pila funciones){
        boolean salir = false;
        if (opcion ==1){
            System.out.println("Ingresa el dato para la Pila");
            int dato = Integer.parseInt(entrada.nextLine());
            funciones.insertarNodo(dato);
        }
        else if (opcion == 2){
            funciones.mostrarPila();
        }
        else if(opcion == 3){
           funciones.eliminarLIFO();
        }
        else if (opcion == 4) return salir = true;
        return salir;
    }
    public static void main(String[] args) {
        Pila funciones = new Pila();
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        while(!salir){
            int opcion = menu(entrada);
            salir = Opciones(entrada, opcion, funciones);
            
        }
        
    
}
    }
    

