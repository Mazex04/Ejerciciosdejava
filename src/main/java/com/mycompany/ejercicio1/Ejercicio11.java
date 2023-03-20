//Diseñe un algoritmo que lea tres números y los imprima de mayor a menor y de menor a
//mayor.

package com.mycompany.ejercicio1;
import java.util.Scanner;
public class Ejercicio11 {

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
//En este punto se vuelve a utilizar un codigo ya existente solo que en el momento de ser utilizado se le cambian.
//algunos parametros para que el codigo funcione
if (n1<=n2 && n2<=n3) //En esta condicion se generan el orden de los numeros si es mayor o menor y en este caso es menor.
{
System.out.println(" "+ n1 + " " +n2+ " " +n3+ " "); // En este punto es el debido orden que se le da.
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

System.out.println("Los numeros por orden de mayor a menor son los siguientes: ");

if (n1>=n2 && n2>=n3)
{
System.out.println(" "+ n1 + " " +n2+ " " +n3+ " ");
}
else if (n1>=n3 && n3>=n2)
{
     System.out.println(" "+ n1 + " " +n3+ " " +n2+ " ");
}
else if (n2>=n1 && n1>= n3)
        {
      System.out.println(" "+ n2 + " " +n1+ " " +n3+ " ");
        }
else if (n2>=n3 && n3>= n1)
{
        System.out.println(" "+ n2 + " " +n3+ " " +n1+ " ");
}
else if (n3>=n1 && n1>=n2 )
{
    System.out.println(" "+ n3 + " " +n1+ " " +n2+ " ");
}
else
{
    System.out.println(" "+ n3 + " " +n2+ " " +n1+ " ");
}
        
    }
    
}
