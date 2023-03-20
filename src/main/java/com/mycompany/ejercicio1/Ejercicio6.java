//Realice un algoritmo que a partir de proporcionarle la velocidad de un automóvil, expresada
//en kilómetros por hora, proporcione la velocidad enmetros porsegundo. Luego debe realiza
//la impresión en pantalla del resultado.

package com.mycompany.ejercicio1;
import java.util.Scanner;//El scanner se utilza para poder hacer la debida introduccion de los datos.
public class Ejercicio6 {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
    double velocidad;
    System.out.println ("Ingresa los kilometros");
    velocidad = sc.nextInt();
    //Se ingresa la formula para poder dar el resultado.
    double total = velocidad*0.277778;
    System.out.println ("En metros por segundos equivale: " + total);
    }
    
}
