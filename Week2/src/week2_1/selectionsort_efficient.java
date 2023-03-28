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
public class selectionsort_efficient {

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
        selection_sort(arr);
        
    }
   
    public static int[] selection_sort(int arr[])
    {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j])
                {
                    int tmp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        long finishTime = System.currentTimeMillis();
        System.out.println(" Selcetion Sort su kadar surede : " + (finishTime - startTime) + " ms");
        return arr;
    }
    
}
