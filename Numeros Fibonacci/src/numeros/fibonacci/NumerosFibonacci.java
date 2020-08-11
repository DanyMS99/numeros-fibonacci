/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros.fibonacci;

import static java.time.Clock.system;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author danie
 */
public class NumerosFibonacci {
    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int numero,n,n3;
    int n1=1;
    int n2=1;
    ArrayList NumerosFibonacci = new ArrayList();
    
       Scanner leer= new Scanner(System.in);
         
        System.out.print("Favor de ingresar un numero: ");
        numero = leer.nextInt();
        
        NumerosFibonacci.add(0);
        NumerosFibonacci.add(1);
        NumerosFibonacci.add(2);
        
         for(int i =3;i<=numero-1;i++){
            n2= n1 + n2;
            n1= n2 - n1;
            n3=n1 + n2;
            
            NumerosFibonacci.add(n3);
        }
          System.out.println(NumerosFibonacci);
         System.out.println("El numero que corresponde a la posición "+ numero+" en la sucesión de Fibonacci es: "+NumerosFibonacci.get((numero-1)));
    }
    
}
