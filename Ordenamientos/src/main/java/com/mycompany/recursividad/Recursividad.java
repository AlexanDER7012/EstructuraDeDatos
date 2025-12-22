package com.mycompany.recursividad;

import java.util.Scanner;

public class Recursividad {

    public static int menu(Scanner entrada){
        System.out.println("""
                           1. odenamiento por mayor
                           2. ordenamiento por seleccion
                           3. ordenamiento por Inserccion
                           """);
        return Integer.parseInt(entrada.nextLine());
    }
    
    public static boolean funcionamiento(int opcion, Scanner entrada){
        boolean salir = false;
        if(opcion ==1){
            int[] a;
            int cantidad, conteo = 0, aux;
            boolean ordenado = false;

            System.out.println("Ingrese la cantidad que desea");
            cantidad = Integer.parseInt(entrada.nextLine());
            a = new int[cantidad];
            
            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(entrada.nextLine());
            }
             for (int i = 0; i < a.length; i++) {
                 System.out.println("numero "+ (i+1) + ": " + a[i]);
            }
            
             while(!ordenado){
                 ordenado = true;
                 for (int i = 0; i < a.length -1 - conteo; i++) {
                     if( a[i] > a[i+1]){
                         aux = a[i];
                         a[i] = a[i+1];
                         a[i+1] = aux;
                         ordenado = false;
                     }
                 }
                 conteo ++;
             }
             System.out.println("");
             System.out.println("Numeros ordenados");
             for (int i = 0; i < a.length; i++) {
                 System.out.println("numero "+ (i+1) + ": " + a[i]);
            }
             System.out.println("");
            
             
        }
        if (opcion == 2){
            int[] a;
            int cantidad;
            int numMenor, aux;
            
            System.out.println("Ingrese la cantidad: ");
            cantidad = Integer.parseInt(entrada.nextLine());
            
            a = new int[cantidad];
            
            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(entrada.nextLine());
            }
             for (int i = 0; i < a.length; i++) {
                 System.out.println("numero "+ (i+1) + ": " + a[i]);
            }
            
            for (int i = 0; i < a.length; i++) {
                numMenor = i;
                for (int j = i + 1; j < a.length; j++) {
                    if(a[numMenor]  > a[j]) numMenor = j;
                }
                aux = a[i];
                a[i] = a[numMenor];
                a[numMenor]  = aux;
                
            }
            
            System.out.println("");
             System.out.println("Numeros ordenados");
             for (int i = 0; i < a.length; i++) {
                 System.out.println("numero "+ (i+1) + ": " + a[i]);
            }
             System.out.println("");
            
        }
        if (opcion == 3){
            int a[];
            int cantidad, aux;
            System.out.println("Selecciona la cantidad: ");
            cantidad = Integer.parseInt(entrada.nextLine());
            a = new int[cantidad];
            
            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(entrada.nextLine());
            }
             for (int i = 0; i < a.length; i++) {
                 System.out.println("numero "+ (i+1) + ": " + a[i]);
            }
             
             for (int i = 1; i < a.length; i++) {
               aux = a[i];
               int j;
                 for (j = i -1 ; j>=0 && a[j] > aux; j-- ){
                     a[j+1] = a[j];
                 }
                 a[j+1] = aux;
               
                
            }
             
             System.out.println("");
             System.out.println("Numeros ordenados");
             for (int i = 0; i < a.length; i++) {
                 System.out.println("numero "+ (i+1) + ": " + a[i]);
            }
             System.out.println("");
            
        }
        return salir;
    }
    public static void startApplication(){
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        
        while(!salir){
           int opcion = menu(entrada);
           salir = funcionamiento(opcion, entrada);
           
        }
        
    }
   
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
      
        startApplication();
        
    }
}
