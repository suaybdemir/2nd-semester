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
public class Bubblesort_efficient {

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
        
      
        bubble_sort(arr);
      
    }
    public static int[] bubble_sort(int arr[])
    {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-1 ; j++) {
                if(arr[i]>arr[i+1])
                {
                    int tmp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=tmp;
                }
            }
        }
        long finishTime = System.currentTimeMillis();
        System.out.println(" Bubble Sort su kadar surede : " + (finishTime - startTime) + " ms");
        return arr;
    }
    
}
