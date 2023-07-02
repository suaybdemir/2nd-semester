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
public class Rational_Converter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter a natural number nominator");
        int N = input.nextInt();
        System.out.println(" Please enter a natural number denominator");
        int denominator = input.nextInt();
      
        
        int nominator = N;
        gcd(nominator,denominator);
        
    }
    public static void gcd(int N,int n)
    {
        int l = 0;
        int gcd = 1;
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
        N = N/gcd;
        n = n/gcd;
        print(N,n);
    }
    public static void print(int N,int n)
    {
        System.out.println(N + "/"+ n);
    }
    
}
