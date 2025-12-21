package com.mycompany.cola;

import java.util.Scanner;

public class Main {
    
    public static int menu(Scanner entrada){
        System.out.println("""
                           
                           Seleccione una opcion
                           1. Aniadir cola
                           2. Ver cola
                           3. Eliminar de la cola
                           4. Salir
                           
                           """);
        return Integer.parseInt(entrada.nextLine());
    }
    public static boolean Opciones(Scanner entrada, int opcion, Cola funciones){
        boolean salir = false;
        if (opcion ==1){
            System.out.println("Ingresa el dato para la cola");
            int dato = Integer.parseInt(entrada.nextLine());
            funciones.insertarNodo(dato);
        }
        else if (opcion == 2){
            funciones.mostrarCola();
        }
        else if(opcion == 3){
            funciones.eliminarFIFO();
        }
        else if (opcion == 4) return salir = true;
        return salir;
    }
    public static void main(String[] args) {
        Cola funciones = new Cola();
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        while(!salir){
            int opcion = menu(entrada);
            salir = Opciones(entrada, opcion, funciones);
            
        }
        
    }
    
}
