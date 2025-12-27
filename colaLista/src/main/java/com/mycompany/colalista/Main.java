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
                           5. Reabrir Caja
                           6. Agregar persona a caja
                           7. Eliminar persona de caja
                           9. Salir
                           """);
        
        return Integer.parseInt(entrada.nextLine());
    }
    
    public static boolean funciones(int opcion, Scanner entrada, boolean salir, SuperMercado sup){
        if (opcion == 1) sup.mostrarCajas();
        if(opcion == 2) sup.mostrarCajasConFilas();
        if (opcion ==3) sup.agregarCaja();
        if(opcion == 4){
            System.out.println("");
            System.out.println("inserte numero de caja a dar mantenmiento");
            int numero = Integer.parseInt(entrada.nextLine());
            sup.manteniminetoCajas(numero);
        }
        if(opcion == 5){
            sup.mostrarCajasMantenimiento();
            System.out.println("inserte numero de caja a reAbrir");
            int numero = Integer.parseInt(entrada.nextLine());
            sup.abrirCaja(numero);
        }
        if(opcion == 6){
            System.out.println("Ingrese el nombre de la persona");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese la edad");
            int edad = Integer.parseInt(entrada.nextLine());
            System.out.println("Ingrese el turno");
            int turno = Integer.parseInt(entrada.nextLine());
            Persona persona = new Persona(nombre, edad, turno);
            System.out.println("Ingrese la caja a ingresar la persona");
            int posicion = Integer.parseInt(entrada.nextLine());
            sup.agregarPersonaCaja(persona, posicion);
        }
        if(opcion == 7){
            System.out.println("Ingrese la caja en donde se ira la persona");
            int dejar = Integer.parseInt(entrada.nextLine());
            sup.personaSeVaDeCaja(dejar);
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
