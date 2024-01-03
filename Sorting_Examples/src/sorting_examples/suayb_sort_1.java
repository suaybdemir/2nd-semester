/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting_examples;

import java.util.Random;

/**
 *
 * @author PC
 */
public class suayb_sort_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();
        int arr[]=new int[10000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(1000);
        }
        exchange(arr,arr.length);
        long finishTime = System.currentTimeMillis();
        System.out.println("Clock time :"+(finishTime-startTime));
    }
    public static int exchange(int arr[],int high)
    {
        if(high<=1)
        {
            return 0;
        }
        else
        {
            high = high-1;
            for (int i = 0; i <=high/2; i++) 
            {
                swap(arr,i,high-i);
            }
            if(arr[high-1]>arr[high] )
            {
                swap(arr,high-1,high);
            }
            
            return exchange(arr,high);
        }
    }
    public static void swap(int arr[],int a,int b)
    {
        if(arr[a]>arr[b])
        {
            int tmp = arr[a];
            arr[a]=arr[b];
            arr[b]=tmp;
        }
    }
}
