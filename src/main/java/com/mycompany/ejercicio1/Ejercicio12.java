//Dado el monto de una compra mostrar y calcular el descuento considerado:
//Descuento es el 10% si el monto es mayor a $100.
//Descuento es el 2% si el monto es mayor a $50 y menor o igual a $100
//No hay descuento si el monto es menor o igual $50

package com.mycompany.ejercicio1;
import java.util.Scanner;

public class Ejercicio12 {

    
    public static void main(String[] args) {
        //Declaracion de las variables
        double n1,descuento, descuento2;
 Scanner sc = new Scanner (System.in);
 
 System.out.println("Ingresa el valor de la compra");
         n1= sc.nextInt();
         
         if (n1 > 100)
         {
         descuento = n1*.10;//Formula de descuento
         System.out.println("El descuento aplicado fue de " + descuento);
         System.out.println("Gracias por su compra");
         }
         
         if (n1> 50 && n1 <=100 )
         {
         descuento2 = n1*.2;
         System.out.println("El descuento aplicado fue de " + descuento2);
         System.out.println("Gracias por su compra");
         }
         if (n1 <= 50)
         {
         System.out.println ("No hay descuento de la compra");
         System.out.println("Gracias por su compra");
         
         }
    }
    
}
