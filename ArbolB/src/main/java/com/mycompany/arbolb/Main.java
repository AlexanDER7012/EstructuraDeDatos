package com.mycompany.arbolb;

import java.util.Scanner;

public class Main {
    public static int menu(Scanner entrada){
        System.out.println("""
                           Escoja una opcion:
                           1. Aniadir Nodo
                           2. Ver Arbol
                           3. Buscar dato
                           4. Eliminar Nodo
                           
                           """);
        return Integer.parseInt(entrada.nextLine());
    }
    
    public static boolean funciones(int opcion, Scanner entrada, boolean salir,ArbolB sup){
        if (opcion ==1){
            System.out.println("INgrese un dato a ingresar");
            int dato = Integer.parseInt(entrada.nextLine());
            sup.insertarDato(dato);
        }
        if(opcion == 2){
            System.out.println("""
                               1. InOrden
                               2. PreOrden
                               3. PostOrden
                               
                               """);
            int orden = Integer.parseInt(entrada.nextLine());
            sup.mostrarTodos(orden);
        }
        if (opcion == 3){
            System.out.println("Ingrese el numero que desea buscar");
            int buscar = Integer.parseInt(entrada.nextLine());
            sup.buscarNodo(buscar, true);
        }
        
        return salir;
    }
    public static void start(){
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        ArbolB sup = new ArbolB();
        while(!salir){
        int opcion = menu(entrada);
        salir = funciones(opcion, entrada, salir,sup);
            
        }
    }
    public static void main(String[] args) {
      start();
    }
    
}
