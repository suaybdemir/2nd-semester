/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4._1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Perfect_number_with_recursive_function {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = input.nextInt();
        int b;
        b = gen(a,1);
        if(b==0 || b<a)
        {
            System.out.println("This number isn't a perfect number");
        }
        else if(b==a)
        {
            System.out.println("This number is a perfect number");
        }
            
    }
    public static int gen(int number,int count)
    {
        if(number%count==0)
        {
            System.out.println(count+" ve "+number);
            return count + gen(number,count+1);
        }
        return 0;
    }
    
}
