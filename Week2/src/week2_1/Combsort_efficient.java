/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2_1;

import java.util.Random;


/**
 *
 * @author PC
 */
public class Combsort_efficient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[]=new int[1000];
        Random r = new Random();
        
        for (int i = 0; i < 1000; i++) {
            arr[i]= r.nextInt();
        }
        
       int n = (int) (arr.length)+1;
        comb_sort(arr,n);
        
    }
    public static int[] comb_sort(int arr[],int n)
    {
        long startTime = System.currentTimeMillis();
        int degisim = 1 , g , i , gap=n ;
        while ( (gap !=1 ) || (degisim==1) )
        {
            gap = (int) (gap/1.3) ;
            if(gap<1) 
            {
                gap = 1;
                degisim = 0;
            }
        }
        for (int j = 0; n-gap > j; j++) {
            if(arr[j]>arr[j+gap])
            {
                g = arr[j];
                arr[j]=arr[j+gap];
                arr[j+gap]=g;
                degisim=1;
            }
        }
        long finishTime = System.currentTimeMillis();
        System.out.println(" Comb Sort su kadar surede : " + (finishTime - startTime) + " ms");
        return arr;
    }
    
}
