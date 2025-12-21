
package com.mycompany.ejercicioslogicos;

import java.util.Scanner;

public class EjerciciosLogicos {
    
    public static int menu(Scanner entrada){
        System.out.println(""" 
                           Escoje una opcion:
                           
                           1. Restar 5 y 1 sin el -
                           2. Multiplicar sin el signo *
                           3. Dividir sin el signo /
                           4. potencia sin el signo usar math
                           5. Factoriales
                           6. Numeros Perfectos
                           7. Numeros amigos
                           8. Numeros Guay
                           9. Mayor, menor y promedio
                           10. Algoritmo de intercambio
                           11. algoritmo de eleccion
                           12. Algoritmo por inserccion
                           15. Salir
                           """);
        return Integer.parseInt(entrada.nextLine());
    }
    
    public static boolean funcionamiento(int opcion, Scanner entrada){
     boolean salir = false;
     if (opcion == 1){
         //resta
         int a, b;
         System.out.print("Ingrese el primer valor: ");
         a = Integer.parseInt(entrada.nextLine());
         System.out.print("Ingrese el segudno digito: ");
         b = Integer.parseInt(entrada.nextLine());
         int aux = 0;
         System.out.print(a +" - "+b+" = ");
         while(b<a){
             b++;
             aux++;
         }
         System.out.println(aux);
         
     }
     
     else if (opcion ==2){
         //multiplicacion
         int a, b;
         int aux = 0;
         
         System.out.print("Ingrese el primer valor: ");
         a = Integer.parseInt(entrada.nextLine());
         System.out.print("Ingrese el segundo digito: ");
         b = Integer.parseInt(entrada.nextLine());
         
         System.out.print(a +" * "+b+" = ");
         while(a!=0){
             a--;//2 1 0 2
             
             aux = aux + b;//0 3 6
         }
          System.out.println(aux);
     }
     
     else if (opcion == 3){
         //division
         int a, b;
         int aux = 0;
         
         System.out.print("Ingrese el primer valor: ");
         a = Integer.parseInt(entrada.nextLine());
         System.out.print("Ingrese el segundo digito: ");
         b = Integer.parseInt(entrada.nextLine());
         System.out.print(a +" / "+b+" = ");
         while(a>=b){
            a = a - b; //8/2 6/2 4/2 2/2 0/2
            aux ++;
         }
          System.out.println(aux +" FALTANDO: "+a);
         
     }
     else if (opcion == 4){
         //potencia
         int a, b;
         int resultado = 1;
         System.out.print("Ingrese el primer valor: ");
         a = Integer.parseInt(entrada.nextLine());
         System.out.print("Ingrese la potencia: ");
         b = Integer.parseInt(entrada.nextLine());
         System.out.print(a +" elevado al "+b+" = ");
         for (int i =0; i<b; i ++ ){
          resultado = resultado *a;
          
           }
         System.out.println(resultado);
         
         
     }
     
     else if (opcion == 5){
         //factoriales
         int a;
         int resultado = 1;
         System.out.print("Ingrese el valor del facgorial: ");
         a = Integer.parseInt(entrada.nextLine());

         for (int i =1; i<=a; i ++ ){
          resultado = resultado *i;//1 2 6 
          
           }
         System.out.println(resultado);
         
         
     }
     else if (opcion == 6){
         //numeros perfectos 
         int a, aux = 0;
         boolean verdadero = false;
         System.out.println("Ingrese el numero:");
         a = Integer.parseInt(entrada.nextLine());
         
         for (int i = 1; i<=a /2; i ++){
             if(a % i==0){
                 aux = aux + i;
             }   
         }
         if (aux == a) verdadero = true;
         
         if(verdadero) System.out.println("El numero es perfecto !");
         else System.out.println("el numero no es perfecto");
         
     }
     else if(opcion == 7){
         int a,b, aux=0,aux2 =0;
         boolean bandera = false;
         System.out.println("Ingrese el primer digito ");
         a = Integer.parseInt(entrada.nextLine());
         System.out.println("Ingrese el segundo numero");
         b = Integer.parseInt(entrada.nextLine());
         
         for(int i = 1; i < a; i++){
             if ( a % i== 0) aux +=i;
         }
         for(int i = 1; i < b; i++){
             if ( b % i== 0) aux2 +=i;
         }
         
         if( a == aux2 &&  b == aux) bandera = true;
         
         if(bandera) System.out.println("Son amigos");
         else System.out.println("No son amigos:c");
         
     }
     else if (opcion == 8){
         int a;
         int aux=0;
         System.out.println("Ingrese un numero");
         a = Integer.parseInt(entrada.nextLine());
         
         for (int i=0; aux<a; i++){
             aux +=i;
         }
         if (aux == a) System.out.println("Es un numero guay");
         else System.out.println("No es un numero guay");
     }
     else if(opcion == 9){
         int cant;
         int menor = 9999, mayor = 0; 
         double promedio, suma=0;
         int[] array;
         System.out.println("Ingrese la cantidad a ingresar");
         cant = Integer.parseInt(entrada.nextLine());
         array = new int[cant];
         
         for (int i = 0; i<cant ; i++){
             System.out.println("Ingrese el digito numero "+ i+1 + ": ");
             array[i] = Integer.parseInt(entrada.nextLine());
             
             if (array[i] < menor ) menor = array[i];
             if (array[i] > mayor ) mayor = array[i];
             suma = suma + array[i];
             
         }
         promedio = suma/cant;
         System.out.println("El numero mayor es: "+ mayor);
         System.out.println("EL numenor menor es: " + menor);
         promedio = Double.parseDouble(entrada.nextLine());
         System.out.println(String.format("%.2f", promedio));
         
     }
     else if ( opcion == 10){
         int[] array;
         int cant;
         boolean ordenado = false;
         int vueltas = 0;
         int aux;
         System.out.println("Ingrese la cantidad a agregar");
         cant = Integer.parseInt(entrada.nextLine());
         array = new int[cant];
         
         for( int i = 0; i < array.length; i ++){
             System.out.println("Ingrese el numero en la posicion " + i +": ");
             array[i] = Integer.parseInt(entrada.nextLine());
         }
         System.out.println("");
         for (int i = 0; i < array.length; i++) {
             System.out.print(array[i] +" ");
         }
         

         while(!ordenado){
             ordenado = true;
             for(int i = 0; i < array.length - 1 - vueltas; i++ ){
                 
                 if(array[i] > array[i+1]){
                     
                     aux = array[i+1];
                     array[i+1] = array[i];
                     array[i] = aux;
                     ordenado = false;
                     
                 }
             }
             vueltas++;
         }
         
         System.out.println("Numeros ordenados"); 
             for (int i = 0; i < array.length; i++) {
             System.out.print(array[i] +" ");
             
         }
             System.out.println("");
     }
     
     else if(opcion == 11){
         int[] a;
         int cant;
         int numPeque;
         int aux;
         System.out.println("Ingrese la cantidad de numeros que desea ");
         cant = Integer.parseInt(entrada.nextLine());
         a = new int[cant];
         
         for (int i = 0; i < a.length; i++){
             System.out.println("Numero: ");
             a[i] = Integer.parseInt(entrada.nextLine());
         }
         System.out.println("Los numeros son");
         for (int i = 0; i < a.length; i++) {
             System.out.print(a[i]+" ");
         }
         System.out.println("");
         
         for (int i = 0; i < a.length; i++){
             numPeque = i;
             for (int j = i+1; j < a.length ; j++){
                 if(a[numPeque] > a[j]) numPeque = j;
             }
             aux = a[i];
             a[i] = a[numPeque];
             a[numPeque] = aux;
         }
         
         System.out.println("Los numeros ordenados son");
         for (int i = 0; i < a.length; i++) {
             System.out.println(a[i]+ " ");
         }
         
         
     }
     else if (opcion == 12){
         int[] a;
         int cant;
         int aux;
         System.out.println("Ingrese la cantidad a ordenar");
         cant = Integer.parseInt(entrada.nextLine());
         a = new int[cant];
         System.out.println("Ingrese los numeros");
         for ( int i = 0; i < cant; i ++){
             a[i] = Integer.parseInt(entrada.nextLine());
             
         }
         
         for ( int i = 1; i < a.length; i++){
             aux = a[i];
             int j;
             for ( j = i-1; j>=0 && a[j]>aux; j--) {
                 a[j+1] = a[j];
                 
             }
             a[j+1] = aux;
             
         }
         
         System.out.println("Los numeros ordenados son");
         for (int i = 0; i < a.length; i++) {
             System.out.println(a[i]+ " ");
         }
        }
     
     
     else if (opcion == 15){
         System.out.println("Nos vemos pronto!!!");
         salir = true;
         return salir;
         
     }
     return salir;
    }
    
    public static void startApplication(){
        boolean salir = false;
        Scanner entrada = new Scanner(System.in);
        while(!salir){
            int opcion = menu(entrada);
            salir = funcionamiento(opcion, entrada);
        }
       
    }
    

    public static void main(String[] args) {
        startApplication();
    }
}
