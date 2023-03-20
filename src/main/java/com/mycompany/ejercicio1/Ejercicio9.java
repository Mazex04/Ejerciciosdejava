//El promedio de prácticas de un curso se calcula en base a cuatro prácticas calificadas de las
//cualesse elimina la nota menor y se promedian lastres notas más altas. Diseñe un algoritmo
//que determine la nota eliminada y el promedio de prácticas de un estudiante.

package com.mycompany.ejercicio1;
import java.util.Scanner;
public class Ejercicio9 {

    public static void main(String[] args) {
        //Declaracion de las variables.
        int n1,n2,n3,n4,menor;
 Scanner sc = new Scanner (System.in);

 System.out.println("Ingresa la primera nota");
         n1= sc.nextInt();
System.out.println("Ingresa la segunda nota");
        n2 = sc.nextInt();
System.out.println("Ingresa la tercera nota");
        n3 = sc.nextInt();
System.out.println("Ingresa la tercera nota");
        n4 = sc.nextInt();
menor = n1;
int total = (n1+n2+n3+n4-menor)/3;
if (n1<menor) 
        {
        menor = n1; //Se idenfica la nota menor la cual es la eliminada
        }
if (n2 < menor)
{
menor = n2;
}
if (n3 < menor)
{
menor = n3;
}
if (n4 < menor)
{
menor = n4;
}
System.out.println("El promedio de las notas mas altas fue " + total);
System.out.println("La nota eliminada fue " + menor + " por ser la mas baja" );

    }
}
