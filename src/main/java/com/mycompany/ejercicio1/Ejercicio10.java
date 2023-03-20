//Diseñe un algoritmo que lea tres longitudes y determine si forman o no un triángulo. Si es
//un triángulo determine de qué tipo de triángulo se trata entre: equilátero, isósceles o
//escaleno. Considere que para formar un triángulo se requiere que: "el lado mayor sea
//menor que la suma de los otros dos lados".
package com.mycompany.ejercicio1;
import java.util.Scanner;
public class Ejercicio10 {

    
    public static void main(String[] args) {
       int n1,n2,n3,a,b,c;
 Scanner sc = new Scanner (System.in);
 
 System.out.println("Ingresa el primer lado");
         n1= sc.nextInt();
System.out.println("Ingresa el segundo lado");
        n2 = sc.nextInt();
System.out.println("Ingresa el tercer lado");
        n3 = sc.nextInt();
        //En este punro cuando se introduzca los 3 datos se dara el debido resultado.
        //Cada linea que tiene la condicion if tiene la debida formula para identificar si es un triangulo y que tipo de triangulo se trata.
        if (n1 < n2 + n3 )
                {
                System.out.println("Corresponde a un triangulo");
                }
        if (n2 < n1 + n3)
        {
        System.out.println("Corresponde a un triangulo");
        }
        else
        {
        System.out.println("No corresponde a ninguna trangulo");
        }
        
        if (n1 == n2 && n2 == n3)
        {
            System.out.println("Con los datos ingresados se trata de un triangulo equilatero " );
        }
        if (n1 != n2 && n2 != n3 )
        {
            System.out.println("Con los datos ingresados se trata de un triangulo escaleno " );
        }
        else if (n1 == n2 && n3 != n1)
        {
            System.out.println("Con los datos ingresados se trata de un triangulo isosceles  " );
        }
    }
    
}
