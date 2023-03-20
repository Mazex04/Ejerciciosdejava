//Desarrolle un algoritmo que permita determinar el área y volumen de un cilindro dado su
//radio (R) y altura (H). Luego debe realiza la impresión en pantalla del resultado.

package com.mycompany.ejercicio1;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       //Declaracion de las variables.
    double radio;
    double altura;
    System.out.println ("Ingresa el radio del cilindro");
    radio = sc.nextInt();
    System.out.println ("Ingresa la altura del cilindro");
    altura = sc.nextInt();
    //Aca se ingresan las formulas para dar el debido resultado.
    double total = 2.0 * 3.1416* radio *( radio + altura);
    double total2 = 2.0 * 3.1416* radio * altura; 
    System.out.println ("Su area equivale a : " + total);
    System.out.println ("Su volumen equivale a : " + total2);
    }
}