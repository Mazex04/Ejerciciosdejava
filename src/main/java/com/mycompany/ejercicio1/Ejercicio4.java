//Desarrolle un algoritmo que permita leer un valor cualquiera N y escriba si dicho número es
//par o impar. Luego debe realiza la impresión en pantalla del resultado.
package com.mycompany.ejercicio1;
import java.util.Scanner;
public class Ejercicio4 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n1 = 0;
        System.out.print("Introduce un numero: ");
        n1 = sc.nextInt();
        if (n1 % 2 == 0){ //Se utiliza % para poder dar la diferencia del par y el impar
            System.out.println("El numero ingresado es par");
        }else{
            System.out.println(" El numero ingresado es impar");
        }
    }
    
}
