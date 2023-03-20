//Hacer un programa que permita calcular la media aritmética de 10 números negativos y que
//muestre la media aritmética en la pantalla.

package com.mycompany.ejercicio1;
import java.util.Scanner;
public class Ejercicio15 {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       //Declaración de las variables. 
       double n,total;
       
      System.out.println("Ingresa el primer numero" );
      n=sc.nextInt();
      System.out.println("Ingresa el segundo numero" );
      n=sc.nextInt();
      System.out.println("Ingresa el tercer numero" );
      n=sc.nextInt();
      System.out.println("Ingresa el cuarto numero" );
      n=sc.nextInt();
      System.out.println("Ingresa el quinto numero" );
      n=sc.nextInt();
      System.out.println("Ingresa el sexto numero" );
      n=sc.nextInt();
      System.out.println("Ingresa el septimo numero" );
      n=sc.nextInt();
      System.out.println("Ingresa el octavo numero" );
      n=sc.nextInt();
      System.out.println("Ingresa el noveno numero" );
      n=sc.nextInt();
      System.out.println("Ingresa el decimo numero" );
      n=sc.nextInt();
     total = n+n+n+n+n+n+n+n+n+n/10;//Formula para el ejercicio
     System.out.println("El resultado de la media aritmetica es de " + total); //Resultado
    }
    
}
