package com.mycompany.listacircular;

import java.util.Scanner;

public class Main {
   
    public static int menu(Scanner entrada){
        System.out.println("""
                           
                           Escoja una opcion:
                           1. Insertar Nodo al inicio
                           2. Insertar Nodo al final
                           3. Insertar nodo en lugar especifico
                           4. Mostrar cantidad total
                           5. Mostrar Nodos
                           6. Eliminar Primer nodo
                           7. Eliminar Ultimo nodo
                           8. Eliminar en lugar especifico
                           9. Salir
                           """);
        
        
        return Integer.parseInt(entrada.nextLine());
    }
    public static boolean funciones(int opcion, Scanner entrada, boolean bandera,ListaCircular funciones){
        if(opcion == 1){
            System.out.println("Ingrese el nombre de la persona");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese la edad de la persona");
            int edad = Integer.parseInt(entrada.nextLine());
            funciones.insertarInicio(edad, nombre);
        }   
        if(opcion == 2){
            System.out.println("Ingrese el nombre de la persona");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese la edad de la persona");
            int edad = Integer.parseInt(entrada.nextLine());
            funciones.insertarFinal(edad, nombre);
        }   
        if(opcion == 3){
            int cantidad = funciones.obtenerCantidadTotal();
        System.out.println("Ingrese el nombre de la persona");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese la edad de la persona");
            int edad = Integer.parseInt(entrada.nextLine());
            System.out.println("Ingrese en la poscicion que desea agregar");
            int posicion = Integer.parseInt(entrada.nextLine());
            funciones.insertarPosicionEspecifica(posicion, edad, nombre, cantidad);
        }
        if(opcion == 4){
            int cantidad = funciones.obtenerCantidadTotal();
            System.out.println("La cantidad total de la lista es: "+ cantidad);
        }
        if(opcion == 5){
            System.out.println("Ingrese la cantidad de vueltas que desea hacer para ver el listado");
            int cantidad = Integer.parseInt(entrada.nextLine());
            funciones.mostrarNodos(cantidad);
        }
        if(opcion == 6) funciones.eliminarPrimero();
        if(opcion == 7) funciones.eliminarUltimo();
        if (opcion == 9) bandera = true;
        if (opcion == 8){
            int total = funciones.obtenerCantidadTotal();
            System.out.println("Ingresar posicion");
            int posicion = Integer.parseInt(entrada.nextLine());
            funciones.eliminarPosicion(posicion, total);
            
        }
        return bandera;
    }
    public static void start(){
       boolean bandera = false;
       ListaCircular funciones = new ListaCircular();
       Scanner entrada = new Scanner(System.in);
       while(!bandera){
          int opcion =  menu(entrada);
          bandera = funciones(opcion, entrada, bandera,funciones);
       }
       
   }
    
    
    
    
    public static void main(String[] args) {
     start();  
        
        
        
    }
}
