//A un trabajador le descuentan de su sueldo el 10% si su sueldo es menor o igual a 1000.Por
//encima de1000 y hasta 2000 el 5% del adicional y por encima de 2000 el 3 % del adicional.
//Calcular el descuento y sueldo neto que recibe el trabajador dado su sueldo
package com.mycompany.ejercicio1;
import java.util.Scanner;
public class Ejercicio17 {

    public static void main(String[] args) {
       //Declaración de las variables.
        double n1,total;
 Scanner sc = new Scanner (System.in);
 
 System.out.println("Ingrese su sueldo y determinaremos si tiene un descuento o un adicional");
         n1= sc.nextInt();
         
         if (n1 <= 1000)
         {
             total = n1 * 0.10;//Formulas para realizar el ejercicio
         System.out.println("El resultado de su descuento es de " + total);
         System.out.println("El resultado de su sueldo con el descuento es de " + (n1+total));//Aca se concatena para dar el resultado, en este punto da el sueldo
         //con el debido descuento.
         }
         
         if (n1 > 1000 && n1<=2000)
         {
             total = n1 * 0.5;
         System.out.println("El resultado de su aumento es de " + total);
         System.out.println("El resultado de su sueldo con el aumento es de " + (n1+total));//Aca se concatena y da el resultado del sueldo con su debido aumento.
         }
         if (n1 > 2000)
         {
             total = n1 * 0.3;
         System.out.println("El resultado de su aumento es de " + total);
         System.out.println("El resultado de su sueldo con el aumento es de " + (n1+total));//Aca se concatena y da el resultado del sueldo con su debido aumento.
         }
         
    }
    
}
