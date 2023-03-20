//Dado un monto calcular el descuento. De esta forma el descuento:
//25% si m>=300
//20% si 150<=m<300
//no hay descuento si m<150
package com.mycompany.ejercicio1;
import java.util.Scanner;
public class Ejercicio16 {

    public static void main(String[] args) {
       //Declaración de las variables.
        double n1,descuento, descuento2;
 Scanner sc = new Scanner (System.in);
 
 System.out.println("Ingresa el valor de la compra");
         n1= sc.nextInt();
         
         if (n1 >= 300)
         {
         descuento = n1*.25;//Sus formulas para dar el resultado
         System.out.println("El descuento del monto fue de " + descuento);
         }
         if (n1 < 300 && n1 <=150 )
         {
         descuento2 = n1*.2;
         System.out.println("El descuento del monto fue de " + descuento2);
         }
         if (n1 >= 150)
         {    
         System.out.println("No hay descuento de la compra");   
         }    
         
        
    }
    
}
