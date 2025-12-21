package com.mycompany.listas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lista funciones = new Lista();
        boolean salir = false;
        Scanner entrada = new Scanner(System.in);
        int opcion;
        while(!salir){

        System.out.println("""
                           Escoge una opcion:
                           1. Insertar al inicio
                           2. Mostrar
                           3. insertar al final
                           4. Eliminar elemento
                           5. Insertar en una posicion especifica
                           """);
        
        opcion = Integer.parseInt(entrada.nextLine());
        
        if(opcion == 1){
            int dato;
            String nombre;
            System.out.println("Ingrese el nombre: ");
            nombre = entrada.nextLine();
            
            System.out.println("Ingrese la edad: ");
            dato = Integer.parseInt(entrada.nextLine());
            
            funciones.insertarNodo(dato, nombre);
            
        }
        if (opcion == 2){
            funciones.mostrarNodos();
        }
        if (opcion ==3){
         int dato;
            String nombre;
            System.out.println("Ingrese el nombre: ");
            nombre = entrada.nextLine();
            
            System.out.println("Ingrese la edad: ");
            dato = Integer.parseInt(entrada.nextLine());
            
            funciones.insertarFinal(dato, nombre);
        }
        if (opcion == 4){
            System.out.println("Ingrese la posicion del que desea eliminar");
            int dato = Integer.parseInt(entrada.nextLine());
            funciones.eliminarNodo(dato);
            System.out.println("Usuario Eliminado");
            }
        if(opcion == 5){
            int dato, posicion;
            String nombre;
            System.out.println("Ingrese el nombre: ");
            nombre = entrada.nextLine();
            
            System.out.println("Ingrese la edad: ");
            dato = Integer.parseInt(entrada.nextLine());
            
            System.out.println("Ingrese la posicion deseada a ingresar");
            posicion = Integer.parseInt(entrada.nextLine());
            
            funciones.insertarMedio(dato, nombre, posicion);
        }
        }
        
    }
        
    
}
