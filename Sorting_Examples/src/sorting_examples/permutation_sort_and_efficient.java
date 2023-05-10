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
public class permutation_sort_and_efficient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[]=new int[3];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(5);
        }
        p_sort(arr);
        System.out.println("Sorted Array");
        print(arr);
        
    }
    public static void p_sort(int arr[])
    {
        while(sort(arr)==false)
        {
            shuffle(arr);
        }
    }
    public static boolean sort(int arr[])
    {
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1]>arr[i])
            {
                return false;
            }
        }
        return true;
    }
    public static void shuffle(int arr[])
    {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            swap(arr,i,r.nextInt(2));
        }
    }
    public static void swap(int arr[],int i,int j)
    {
        int tmp = arr[i];
        arr[i]=arr[j];
        arr[j]=arr[i];
    }
    public static void print(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
    
}
