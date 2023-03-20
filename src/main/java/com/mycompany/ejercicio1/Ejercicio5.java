//Desarrolle un algoritmo que permita leer dos números y ordenarlos de menor a mayor, si
//es el caso. Luego debe realiza la impresión en pantalla del resultado

package com.mycompany.ejercicio1;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
 //Declaracion de las variables
        int n1,n2,n3;
 Scanner sc = new Scanner (System.in);
 
 System.out.println("Ingresa el primer numero");
         n1= sc.nextInt();
System.out.println("Ingresa el segundo numero");
        n2 = sc.nextInt();
System.out.println("Ingresa el tercer numero");
        n3 = sc.nextInt();
        
System.out.println("Los numeros por orden de menor a mayor son los siguientes: ");
////Se utiliza este metodo para identificar el primer numero menor
if (n1<=n2 && n2<=n3) 
{
System.out.println(" "+ n1 + " " +n2+ " " +n3+ " "); //Estos son los ordenes que debe llevar segun corresponda el numero menor
}
else if (n1<=n3 && n3<=n2)
{
     System.out.println(" "+ n1 + " " +n3+ " " +n2+ " ");
}
else if (n2<=n1 && n1<= n3)
        {
      System.out.println(" "+ n2 + " " +n1+ " " +n3+ " ");
        }
else if (n2<=n3 && n3<= n1)
{
        System.out.println(" "+ n2 + " " +n3+ " " +n1+ " ");
}
else if (n3<=n1 && n1<=n2 )
{
    System.out.println(" "+ n3 + " " +n1+ " " +n2+ " ");
}
else
{
    System.out.println(" "+ n3 + " " +n2+ " " +n1+ " ");
}
    }
    }

