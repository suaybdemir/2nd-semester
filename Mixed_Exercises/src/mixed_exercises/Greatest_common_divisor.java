/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mixed_exercises;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Greatest_common_divisor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a natural number");
        int N = input.nextInt();
        System.out.println("Please enter other natural number");
        int n = input.nextInt();
        int g = 0;
        int l = 0;
        int gcd = 0;
        if(N>n)
        {
            l=n;
        }
        else if(n>N)
        {
            l=N;
        }
        for (int i = l/2 ; i >0 ; i--) 
        {
            if(N%i==0 && n%i==0)
            {
                gcd = i;
                i=0;
            }
        }
        System.out.println(gcd);
    }
    
}
