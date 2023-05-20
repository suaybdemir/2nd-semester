/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting_examples;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Factorial_recurison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a positive integer");
        int i = input.nextInt();
        int a =factorial(i);
        System.out.println(a);
    }
    public static int factorial(int i)
    {
        int fact;
        if(i>1)//decomposition
        {
            fact = factorial(i-1)*i;//composition
        }
        else//base case
            fact = 1 ;
            return fact;
    }
    
}
