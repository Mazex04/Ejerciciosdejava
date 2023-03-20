//Elabore un programa que permita ingresar 4 números enteros positivo y que los muestre
//en orden ascendente.

package com.mycompany.ejercicio1;
import java.util.Scanner;
public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //Declaracion de variables
        int a,b,c,d,mayor = 0,menor,medio;
       
      System.out.println("Ingresa el primer numero" );
      a=sc.nextInt();
      System.out.println("Ingresa el segundo numero" );
      b=sc.nextInt();
      System.out.println("Ingresa el tercer numero" );
      c=sc.nextInt();
      System.out.println("Ingresa el cuarto numero" );
      d=sc.nextInt();
      
      if (a>b && a>c && a>d) //En este punto se identifican el numero mayor que tiene que generar el orden
      {
          mayor = a;
      }
      else if (b>a && b>c && b > d )
      {
      mayor = b;
      }
      else  if (c>a && c>b && c>d)
      {
      mayor = c;
      }
      else if (d>a && d>b && d>c)
      {
      mayor = d;
      }
      
      
      if (a<b && a<c && a<d)// En este punto se genera el numero menor
      {
          menor = a;
      }
      else if (b<a && b<c && b<d )
      {
      menor = b;
      }
      else  if (c<a && c<b && c<d)
      {
      menor = c;
      }
      else if (d<a && d<b && d<c)
      {
      menor = d;
      
      medio = (a+b+c) - (mayor + menor);//Aca se utiliza para dar el orden
      
      System.out.println( menor+ " "+ medio+ " "+ mayor); //En este punto se hace lo que es la impresion de los numeros y su debido orden
      }
    }
    
}
