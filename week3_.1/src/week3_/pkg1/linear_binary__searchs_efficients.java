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
public class linear_binary__searchs_efficients {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        int arr[]=new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i]=r.nextInt(1000);
        }
        linearsearch(arr,578);
        binarysearch(arr,578);
    }
    public static int linearsearch(int arr[],int n )
    {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            if(arr[i]==n)
            {
                return n;
            }
        }
        long finishTime = System.currentTimeMillis();
        System.out.println(" Linearsearch su kadar surede : " + (finishTime - startTime) + " ms");
        return-1;
    }
    public static int binarysearch(int arr[],int n)
    {
        long startTime = System.currentTimeMillis();
     int low = 0;int high = arr.length-1;
     int mid = low + (high-low)/2;
     if(arr[mid]==n)
     {
         return mid;
     }
     else if(arr[mid]>n)
     {
         low = mid + 1 ;
     }
     else if(arr[mid]<n)
     {
         high = mid - 1 ;
     }
     long finishTime = System.currentTimeMillis();
     System.out.println(" Binarysearch su kadar surede : " + (finishTime - startTime) + " ms");
     return-1;
    }
       
    
}
