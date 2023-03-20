//Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las variables A, B y
//C respectivamente. El algoritmo debe indicar cuál es el mayor y cuál es el menor. Luego
//debe realiza la impresión en pantalla del resultado.
package com.mycompany.ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //En este punto se inicializan las variables
        int n1,n2,n3;
        System.out.print("Introduzca el primer numero: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        n2 = sc.nextInt();
        System.out.print("Introduzca el tercer numero: ");
        n3 = sc.nextInt();
        //
        if (n1> n2 ) { //En este punto asignamos los valores para determinar el mayor
            if (n1 > n3) {
                System.out.println("El mayor es el numero: " + n1);
            } else {
                System.out.println(" El mayor es el numero: " + n3);
            }
        } else if (n2 > n3) {
            System.out.println("El mayor es el numero: " + n2);
        } else {
            System.out.println("El mayor es el numero : " + n3);
        }
    }
}
