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
    
    
  static int Fibonacci(int n){
      if (n==1){
          return 0;
      }
      if(n==2){
          return 1;
      }
      return Fibonacci(n-1)+Fibonacci(n-2);
 
}
  
  
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int n;
    Scanner leer= new Scanner(System.in);
         
        System.out.print("Favor de ingresar un numero: ");
        n = leer.nextInt();
        
         System.out.println("El numero que corresponde a la posición "+ n+" en la sucesión de Fibonacci es: "+ Fibonacci(n));
    }
    
}
