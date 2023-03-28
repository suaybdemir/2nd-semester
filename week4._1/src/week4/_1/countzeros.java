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
public class countzeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi girin");
        int n = input.nextInt();
        int count = countzeros(n);
        System.out.println(count);
    }
    public static int countzeros(int n)
    {
        if(n==0)
        {
            return 1 ;
        }
        else if(n<10)
        {
            return 0 ;
        }
        else{
            if(n%10!=0)
            {
                return 0 + countzeros(n/10);
            }
            else if(n%10==0)
            {
                return 1 + countzeros(n/10);
            }
        } 
            
        return -1;   
    }
    
}
