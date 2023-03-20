//Se necesita un sistema que tenga tres opciones, si se selecciona la primera se calcula el
//perímetro de un cuadrado, si la opción es la dos se calcula el perímetro de un triángulo
//equilátero, y cuando se elija la tres se calcula el perímetro de un círculo. Además de que
//mandara un mensaje de “error” en caso de presionar cualquier otro número.
package com.mycompany.ejercicio1;

import java.util.Scanner;
public class Ejercicio14 {

    public static void main(String[] args) {
        //Declaracion de variables
        int dato,l1,l2,l3,l4,total;
        double e1,e2,e3,tot,r1,resultado;
 Scanner sc = new Scanner (System.in);
 
 System.out.println("Bienvenido por favor escoge una opcion entre la 1, 2 y 3");
 dato = sc.nextInt();
 
 switch (dato) //Esta variable llamada dato me permite que se guarde en ella el numero para escoger la debida opción.
 {
     case 1://En el caso de ingresar el numero 1 seleccionara está opción.
         System.out.println("Calcular perimetro de un cuadrado");
         System.out.println("------------------------------------");
         System.out.println("------------------------------------");
         System.out.println("Por favor ingresa el primer lado");
         l1 = sc.nextInt();
         System.out.println("Por favor ingresa el segundo lado");
         l2 = sc.nextInt();
         System.out.println("Por favor ingresa el tercer lado");
         l3 = sc.nextInt();
         System.out.println("Por favor ingresa el cuarto lado");
         l4 = sc.nextInt();
         total = l1+l2+l3+l4;
         
         System.out.println("El perimetro del cuadrado es de " + total + " cm ");
         break;
         
     case 2://En el caso de ingresar el numero 2 seleccionara está opción.
         System.out.println("Calcular el perimetro de un triangulo equilatero");
         System.out.println("--------------------------------------------------");
         System.out.println("--------------------------------------------------");
         System.out.println("Por favor ingresa el primer lado");
         e1 = sc.nextInt();
         System.out.println("Por favor ingresa el segundo lado");
         e2 = sc.nextInt();
         System.out.println("Por favor ingresa el tercer lado");
         e3 = sc.nextInt();
         tot = e1+e2+e3;
         
         System.out.println ("El perimetro del triangulo equivale es de " + tot + " cm ");
         break;
     case 3://En el caso de ingresar el numero 3 seleccionara está opción.
         System.out.println("Calcular el perimetro de un circulo");
         System.out.println("--------------------------------------------------");
         System.out.println("--------------------------------------------------");
         System.out.println("Por favor ingresa el radio del circulo");
         r1 = sc.nextInt();
         resultado = 2*Math.PI*r1;
         
         System.out.println ("El perimetro del circulo es de " + resultado);
         break;
     default: //Este metodo se utiliza en caso de que al momento de ingresar un numero que no coincida arroje el mensaje de "Opcion invalida"
    System.out.println("Opcion invalida");
 }
 
    }
    
}
