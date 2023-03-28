/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3_.pkg1;

import java.util.Random;

/**
 *
 * @author PC
 */
public class Fibonacci_Searcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
      Random r = new Random();
      int n = r.nextInt(1000);
      fibonacci(n);
}
     public static int fibonacci(int n)
        {
           
            System.out.println(1);
            System.out.println(2);
            int num1 =1,num2 = 1 ;
            for (int i = 3; i < n; i++) {
                int tmp= num1+num2;
                num1 = num2;
                num2 = tmp;
                System.out.println(num2);
            }
            return num2;
        }
       public static int sum(int n)
       {
           if(n!=0)
           {
               return n + sum(n-1);
              
           }
           return n;
       }
