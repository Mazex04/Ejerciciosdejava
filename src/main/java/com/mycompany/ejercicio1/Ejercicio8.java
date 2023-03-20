//Elaborar un programa que me ingrese 3 números y me muestre el número intermedio
package com.mycompany.ejercicio1;
import java.util.Scanner;
public class Ejercicio8 {

    public static void main(String[] args) {
        //Declaracion de las variables
        int n1,n2,n3;
 Scanner sc = new Scanner (System.in);
 
 System.out.println("Ingresa el primer numero");
         n1= sc.nextInt();
System.out.println("Ingresa el segundo numero");
        n2 = sc.nextInt();
System.out.println("Ingresa el tercer numero");
        n3 = sc.nextInt();
        //Se identifica el mayor para saber en que momento uno pueda quedar en la mitad por los 4 numeros
    if (n1>n2)
       {
           System.out.println("En la mitad esta: " + n1);
       }
       else if (n2>n1)
       {
           System.out.println("En la mitad esta: " + n2);
       }
       else if (n3>n1)
       {
           System.out.println("En la mitad esta: " + n3);
       }
    
    }
    
}
