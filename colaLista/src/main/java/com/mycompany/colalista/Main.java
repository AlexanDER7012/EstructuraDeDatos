package com.mycompany.colalista;

import java.util.Scanner;

public class Main {

    public static int menu(Scanner entrada){
        System.out.println("""
                           Menu: 
                           1. Ver Cajas disponibles
                           2. Ver las colas en cajas
                           3. Agregar Caja
                           4. Mantenimiento Caja
                           9. Salir
                           """);
        
        return Integer.parseInt(entrada.nextLine());
    }
    
    public static boolean funciones(int opcion, Scanner entrada, boolean salir, SuperMercado sup){
        if (opcion == 1) sup.mostrarCajas();
        //if(opcion == 2)
        if (opcion ==3) sup.agregarCaja();
        if(opcion == 4){
            System.out.println("inserte numero de caja a dar mantenmiento");
            int numero = Integer.parseInt(entrada.nextLine());
            sup.manteniminetoCajas(numero);
        }
        if (opcion == 9) salir = true;
        return salir;
    }
    public static void start(){
        SuperMercado sup = new SuperMercado();
        boolean salir = false;
        Scanner entrada = new Scanner(System.in);
        while(!salir){
        int opcion = menu(entrada);
        salir = funciones(opcion, entrada, salir, sup);
        }
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        start();
    }
}
