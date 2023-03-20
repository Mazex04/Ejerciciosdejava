//Desarrolle un algoritmo que realice la sumatoria de los números enteros comprendidos
//entre el 1 y el 10. Luego debe realizar la impresión en pantalla de la suma de los números.

package com.mycompany.ejercicio1;
import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       //Declaracion de las variables
       int num ;
       System.out.println("Introduce un numero");
       
       num = sc.nextInt();
       int suma = 0;
               
       for (int i = 0 ; i <= num; i++ ){ //Se usa el ciclo for para que el valor vaya aumentando y se sume
           suma += i;//Este punto es para que los datos se sumen
           System.out.println("El resultado de la suma es: " + suma);
       }
    }
    
}
