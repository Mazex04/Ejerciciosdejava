//Diseñe un algoritmo que lea 3 números y me muestre el menor de los 3.
package com.mycompany.ejercicio1;
import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[] args) {
         int n1,n2,n3;
 Scanner sc = new Scanner (System.in);
 
 System.out.println("Ingresa el primer numero");
         n1= sc.nextInt();
System.out.println("Ingresa el segundo numero");
        n2 = sc.nextInt();
System.out.println("Ingresa el tercer numero");
        n3 = sc.nextInt();
       if (n1 < n2 && n1<n3) //Aca se hace el debido orden para dar el resultado dependiendo de cual sea el menor de los tres
       {
           System.out.println("El primer numero es menor: " + n1);
       }
       else if (n2 < n1 && n2 < n3)
       {
           System.out.println("El segundo numero es menor: " + n2);
       }
       else if (n3 < n2 && n3 < n1)
       {
           System.out.println("El tercer numero es menor: " + n3);
       }
    }
}
